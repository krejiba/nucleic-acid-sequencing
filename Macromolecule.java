public class Macromolecule {
    String sequence;
    void printFirst(int howMany) {
        System.out.println(this.sequence.substring(0, howMany));
    }

    boolean isValid(String sequence, String testSet) {
        boolean test = true;

        // Test if sequence contains only characters from a provided set of possible characters
        for(int i = 0; i < sequence.length(); i++) {
            if (testSet.indexOf(sequence.charAt(i)) == -1) {
                test = false;
                break;
            }
        }
        return test;
    }

}
