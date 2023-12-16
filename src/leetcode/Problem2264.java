/*
2264. Largest 3-Same-Digit Number in String
Easy
You are given a string num representing a large integer. An integer is good if
it meets the following conditions:

It is a substring of num with length 3.
It consists of only one unique digit.
Return the maximum good integer as a string or an empty string "" if no such
integer exists.

Note:
A substring is a contiguous sequence of characters within a string.
There may be leading zeroes in num or a good integer.


Example 1:
Input: num = "6777133339"
Output: "777"
Explanation: There are two distinct good integers: "777" and "333".
"777" is the largest, so we return "777".

Example 2:
Input: num = "2300019"
Output: "000"
Explanation: "000" is the only good integer.
Example 3:

Input: num = "42352338"
Output: ""
Explanation: No substring of length 3 consists of only one unique digit.
Therefore, there are no good integers.

Constraints:
3 <= num.length <= 1000
num only consists of digits.

 */
package leetcode;

public class Problem2264 {

    public static void main(String[] args) {
        String num = "6777133339";
        System.out.println(largestGoodInteger(num));
    }

    /**
     * Finds the largest 3-same-digit number in the given string.
     *
     * @@param num the string containing the number
     * @return the largest 3-same-digit number in the given string
     */
    public static String largestGoodInteger(final String num) {
        // start with the biggest digit 9
        // and go down to 0
        for (int i = 9; i >= 0; i--) {
            // convert the digit to a string and repeat it 3 times
            String threeDigit = String.valueOf(i).repeat(3);
            // check if the digit is in the string
            if (num.contains(threeDigit)) {
                // return the first occurrence of the digit
                return threeDigit;
            }
        }
        // if no digit is found, return an empty string
        return "";
    }
}
