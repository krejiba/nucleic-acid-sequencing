public class NucleicAcid extends Macromolecule {
    int numberOfNucleotides;
    char[] nucleotides;

    NucleicAcid() {
        this.sequence = "" ;
        this.numberOfNucleotides = 0;
        this.nucleotides = new char[4];
    }
    NucleicAcid(String sequence) {
        this.sequence = sequence ;
        this.numberOfNucleotides = sequence.length();
        this.nucleotides = new char[]{'A', 'C', 'G', '*'};  // * is a placeholder for T in DNA and for U in RNA
    }

    NucleicAcid complementaryStrand() {
        StringBuilder complementarySequence = new StringBuilder();
        for (int i=0; i<this.numberOfNucleotides; i++) {

            char c = this.sequence.charAt(i);

            for (int j=0; j<4; j++) {
                if (c == this.nucleotides[j]) {
                    complementarySequence.append(this.nucleotides[3-j]);
                }
            }

        }
        return new NucleicAcid(complementarySequence.toString());

    }

    void count(boolean normalize) {
        int[] countOfNucleotides = new int[]{0, 0, 0, 0};
        float[] percentageOfNucleotides = new float[]{0, 0, 0, 0};

        for (int i=0; i<this.numberOfNucleotides; i++) {
            char c = this.sequence.charAt(i);
            for (int j=0; j<4; j++) {
                if (c == this.nucleotides[j]) {
                    countOfNucleotides[j]++;
                }
            }
        }

        for (int j=0; j<4; j++) {
            percentageOfNucleotides[j] = (float) countOfNucleotides[j] * 100 / this.numberOfNucleotides;
            if (!normalize) {
                System.out.println(this.nucleotides[j]+": " + countOfNucleotides[j]);
            } else {
                System.out.println(this.nucleotides[j]+"%: " + percentageOfNucleotides[j]);
            }
        }
    }
}