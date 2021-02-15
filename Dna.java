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
            if(this.sequence.charAt(i) == 'T'){
                complementarySequence.append('A');
            }
            if(this.sequence.charAt(i) == 'A'){
                complementarySequence.append('T');
            }
            if(this.sequence.charAt(i) == 'C'){
                complementarySequence.append('G');
            }
            if(this.sequence.charAt(i) == 'G'){
                complementarySequence.append('C');
            }
        }
        Dna cdna = new Dna(complementarySequence.toString());
        return cdna;

    }

}