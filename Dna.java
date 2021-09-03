public class Dna {
    String sequence;
    int numberNucleotides;

    Dna() {
        this.sequence = "" ;
        this.numberNucleotides = 0;
    }
    Dna(String dna) {
        this.sequence = dna ;
        this.numberNucleotides = sequence.length();
    }

    Dna complementaryStrand() {
        StringBuilder complementarySequence = new StringBuilder();
        for (int i=0; i<this.numberNucleotides; i++) {
            char c = this.sequence.charAt(i);
            switch (c) {
                case 'A': complementarySequence.append('T'); break;
                case 'C': complementarySequence.append('G'); break;
                case 'G': complementarySequence.append('C'); break;
                case 'T': complementarySequence.append('A'); break;
            }
        }
        return new Dna(complementarySequence.toString());

    }

    void count(boolean normalize) {
        int numberA = 0;
        int numberC = 0;
        int numberG = 0;
        int numberT = 0;

        for (int i=0; i<this.numberNucleotides; i++) {
            char c = this.sequence.charAt(i);
            switch (c) {
                case 'A': numberA++; break;
                case 'C': numberC++; break;
                case 'G': numberG++; break;
                case 'T': numberT++; break;
            }
        }

        if (normalize == false) {
            System.out.println("A: " + numberA);
            System.out.println("C: " + numberC);
            System.out.println("G: " + numberG);
            System.out.println("T: " + numberT);
        } else {
            System.out.println("%A: " + numberA/ (double) this.numberNucleotides*100);
            System.out.println("%C: " + numberC/ (double) this.numberNucleotides*100);
            System.out.println("%G: " + numberG/ (double) this.numberNucleotides*100);
            System.out.println("%T: " + numberT/ (double) this.numberNucleotides*100);
        }
    }

}