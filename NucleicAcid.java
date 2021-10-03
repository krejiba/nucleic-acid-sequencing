public class NucleicAcid {
    String sequence;
    int numberNucleotides;
    char[] nucleotides;

    NucleicAcid() {
        this.sequence = "" ;
        this.numberNucleotides = 0;
    }
    NucleicAcid(String sequence) {
        this.sequence = sequence ;
        this.numberNucleotides = sequence.length();
        this.nucleotides = new char[]{'A', 'C', 'G', '*'};
    }

    boolean isValid(String sequence, String testSet) {
        boolean test = true;
        for(int i = 0; i < sequence.length(); i++) {
            if (testSet.indexOf(sequence.charAt(i)) == -1) {
                test = false;
                break;
            }
        }
        return test;
    }

    NucleicAcid complementaryStrand() {
        StringBuilder complementarySequence = new StringBuilder();
        for (int i=0; i<this.numberNucleotides; i++) {
            char c = this.sequence.charAt(i);

            if (c == this.nucleotides[0]) {
                complementarySequence.append(this.nucleotides[3]);
            } else if (c == this.nucleotides[1]) {
                complementarySequence.append(this.nucleotides[2]);
            }  else if (c == this.nucleotides[2]) {
                complementarySequence.append(this.nucleotides[1]);
            } else {
                complementarySequence.append(this.nucleotides[0]);
            }
        }
        return new NucleicAcid(complementarySequence.toString());

    }


    void count(boolean normalize) {
        int[] countOfNucleotides = new int[]{0, 0, 0, 0};

        for (int i=0; i<this.numberNucleotides; i++) {
            char c = this.sequence.charAt(i);
            for (int j=0; j<4; j++) {
                if (c == this.nucleotides[j]) {
                    countOfNucleotides[j]++;
                }
            }
        }

        if (normalize == false) {
            System.out.println(this.nucleotides[0]+": " + countOfNucleotides[0]);
            System.out.println(this.nucleotides[1]+": " + countOfNucleotides[1]);
            System.out.println(this.nucleotides[2]+": " + countOfNucleotides[2]);
            System.out.println(this.nucleotides[3]+": " + countOfNucleotides[3]);
        } else {
            System.out.println(this.nucleotides[0]+"%: " + countOfNucleotides[0] / (double) this.numberNucleotides*100);
            System.out.println(this.nucleotides[1]+"%: " + countOfNucleotides[1] / (double) this.numberNucleotides*100);
            System.out.println(this.nucleotides[2]+"%: " + countOfNucleotides[2] / (double) this.numberNucleotides*100);
            System.out.println(this.nucleotides[3]+"%: " + countOfNucleotides[3] / (double) this.numberNucleotides*100);

        }
    }

}