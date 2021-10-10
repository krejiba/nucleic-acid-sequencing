import java.io.File;
import java.util.Scanner;

public class Protein extends Macromolecule {
    int numberOfAminoacids;
    char[] aminoacids;
    String[][] aminoacidsNames;

    Protein() {
        this.sequence = "" ;
        this.numberOfAminoacids = 0;
        this.aminoacids = this.getAminoacids();
    }
    Protein (String sequence) {
        this.sequence = sequence ;
        this.numberOfAminoacids = sequence.length();
        this.aminoacids = getAminoacids();

        // Test if the provided sequence is a valid protein sequence
        boolean test = this.isValid(sequence, new String(this.aminoacids));
        if (!test) {
            throw new Error("The sequence provided does not correspond to a protein sequence!");
        }

    }

    char[] getAminoacids() {

        try {
            Scanner scanner = new Scanner(new File("aminoacids.txt"));
            String[][] AminoacidsArray = new String[20][3];
            int j = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (int k = 0; k < 3; k++) {
                    AminoacidsArray[j][k] = line.split(" ")[k];
                }
                j++;
            }
            if (j != 20) {
                System.out.println("WARNING: aminoacids.txt is not in the right format!");
            }
            scanner.close();
            this.aminoacidsNames = AminoacidsArray;
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
        }

        char[] OneLetterCodeArray = new char[20];
        for (int j=0; j<20; j++) {
            OneLetterCodeArray[j] = this.aminoacidsNames[j][2].charAt(0);
        }
        return OneLetterCodeArray;
    }

}
