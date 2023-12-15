package leetcode;

public class Problem1662 {
    public static void main(String[] args) {
        // Check if the concatenation of every string in two arrays equals
        // The same word

        String[] word1 = { "a", "b", "c" };
        String[] word2 = { "a", "bc" };

        System.out.println("The concatenation of the words in the first array "
                + (arrayStringsAreEqual(word1, word2) ? "equals" : "does not equal")
                + " the concatenation of the words in the second array");
    }

    /**
     * Compares two arrays of strings and checks if they are equal.
     *
     * @param word1 The first array of strings.
     * @param word2 The second array of strings.
     * @return True if the arrays are equal, false otherwise.
     */
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String string1 = String.join("", word1);
        String string2 = String.join("", word2);

        return string1.equals(string2);
    }
}
