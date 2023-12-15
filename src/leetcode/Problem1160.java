/*
You are given an array of strings words and a string chars.
A string is good if it can be formed by characters from chars (each character
can only be used once).
Return the sum of lengths of all good strings in words.
Example 1:
Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer
is 3 + 3 = 6.
Example 2:
Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: The strings that can be formed are "hello" and "world" so the
answer is 5 + 5 = 10.
*/
package leetcode;

public class Problem1160 {
    public static void main(String[] args) {
        String[] words = { "cat", "bt", "hat", "tree" };
        String chars = "atach";

        System.out.println(countCharacters(words, chars));
    }

    /**
     * Counts the total number of characters in the given array of words that can be
     * formed using the characters in the given string.
     *
     * @param words the array of words to count characters from
     * @param chars the string containing the characters to form the words
     * @return the total number of characters that can be formed
     */
    public static int countCharacters(String[] words, String chars) {
        int count = 0;
        int[] charsArray = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            charsArray[chars.charAt(i) - 'a']++;
        }
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (canBeFormed(word, charsArray)) {
                count += words[i].length();
            }

        }
        return count;
    }

    /**
     * Determines whether a given word can be formed using a given array of
     * characters.
     *
     * @param word       the word to be formed
     * @param charsArray the array of characters
     * @return true if the word can be formed using the characters in the array,
     *         false otherwise
     */
    public static boolean canBeFormed(String word, int[] charsArray) {
        int[] wordsCharsArray = new int[26];
        for (int i = 0; i < word.length(); i++) {

            wordsCharsArray[word.charAt(i) - 'a']++;
            if (wordsCharsArray[word.charAt(i) - 'a'] > charsArray[word.charAt(i) - 'a']) {
                return false;
            }
        }
        return true;
    }
}