package leetcode;

public class IsPalindrome {
    public static void main(String[] args) {
        // Check if every string in an array is a palindrome
        // The output should be:
        // like this
        // Esta palabra si es un palíndromo annA
        // Esta palabra si es un palíndromo Civic
        // Esta palabra si es un palíndromo oso
        // Esta palabra si es un palíndromo radaR

        String[] words = { "like this", "annA", "Civic", "oso", "radaR" };

        for (String word : words) {
            System.out.println("Esta palabra " + (isPalindrome(word) ? "si" : "no") + " es un palíndromo: " + word);
        }

    }

    /**
     * Verifica si una palabra es un palíndromo.
     * Un palíndromo es una palabra que se lee igual de izquierda a derecha y de
     * derecha a izquierda.
     *
     * @param word la palabra a verificar
     * @return true si la palabra es un palíndromo, false de lo contrario
     */
    public static boolean isPalindrome(String word) {
        final String WORD_LOWER_CASE = word.toLowerCase();
        final int LENGTH = WORD_LOWER_CASE.length();
        for (int leftI = 0; leftI < LENGTH / 2; leftI++) {
            int rightI = LENGTH - leftI - 1;
            if (WORD_LOWER_CASE.charAt(leftI) != WORD_LOWER_CASE.charAt(rightI)) {
                return false;
            }
        }
        return true;
    }
}
