public class Main {
    public static void main(String[] args) {
        Dna dna = new Dna("GACTTCGGAGCTCGAGTGTG");
        System.out.println("This is the original strand: "+dna.sequence);
        System.out.println("This is the complementary strand: "+dna.complementaryStrand().sequence);
        System.out.println("Each strand has "+dna.numberNucleotides+" nucleotides.");
    }
}
