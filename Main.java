public class Main {
    public static void main(String[] args) {

        Dna dna = new Dna("GACTTCGGAGCTCGAGTGTG");
        System.out.println("This is the original strand: "+dna.sequence);
        System.out.println("This is the complementary strand: "+dna.complementaryStrand().sequence);
        System.out.println("Each strand has "+dna.numberNucleotides+" nucleotides.");
        dna.count(false);
        dna.count(true);

        Rna rna = new Rna("GACUUCGGAGCUCGAGUGUG");
        System.out.println("This is the original strand: "+rna.sequence);
        System.out.println("This is the complementary strand: "+rna.complementaryStrand().sequence);
        System.out.println("Each strand has "+rna.numberNucleotides+" nucleotides.");
        rna.count(false);
        rna.count(true);


        boolean equal = dna.transcribe().sequence.equals(rna.sequence);
        if (equal) {
            System.out.println("The RNA strand is the result of the transcription of the DNA strand.");
        }
    }
}
