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
            System.out.println("Esta palabra " + (isPalindrome2(word) ? "si" : "no") + " es un palíndromo: " + word);
        }

    }

    /**
     * Comprueba si una palabra es un palíndromo.
     * Un palíndromo es una palabra que se lee igual de izquierda a derecha y de
     * derecha a izquierda.
     *
     * @param word la palabra a comprobar
     * @return true si la palabra es un palíndromo, false en caso contrario
     */
    public static boolean isPalindrome(String word) {
        String reversedString = new StringBuilder(word)
                .reverse()
                .toString();
        return word.equalsIgnoreCase(reversedString);
    }

    public static boolean isPalindrome2(String word) {
        String wordLowerCase = word.toLowerCase();
        int length = wordLowerCase.length();
        for (int i = 0; i < length / 2; i++) {
            if (wordLowerCase.charAt(i) != wordLowerCase.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
