public class Rna extends NucleicAcid{
    Rna(String sequence) {
        super(sequence);

        boolean test = this.isValid(sequence, "ACGU");
        if (!test) {
            throw new Error("The sequence provided does not correspond to a RNA strand!");
        }
        this.nucleotides = new char[]{'A', 'C', 'G', 'U'};
    }
}
