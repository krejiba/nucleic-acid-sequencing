public class Dna extends NucleicAcid{
    Dna(String sequence) {
        super(sequence);

        // Test if the provided sequence is a valid DNA sequence
        boolean test = this.isValid(sequence, "ACGT");
        if (!test) {
            throw new Error("The sequence provided does not correspond to a DNA strand!");
        }

        this.nucleotides = new char[]{'A', 'C', 'G', 'T'};
    }

    Rna transcribe () {
        String newSequence = this.sequence.replace('T', 'U');
        return new Rna(newSequence);
    }
}