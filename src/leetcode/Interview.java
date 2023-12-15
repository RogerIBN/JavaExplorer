package leetcode;

public class Interview {
    public static void main(String[] args) {

        int[] array = { 5904, 859, 9380, 772, 6180, 6000, 123, 4742, 5335, 5900, 636, 5865, 5303,
                7848, 7393, 2313, 8338, 1934, 2998, 867, 6905, 2090, 4818, 3072, 2496 };
        // Give me the sum of the odd numbers in the array and the sum of the even
        // numbers in the array.
        int sumOfOddNumbers = 0;
        int sumOfEvenNumbers = 0;

        for (int number : array) {
            if (number % 2 == 0) {
                sumOfEvenNumbers += number;
            } else {
                sumOfOddNumbers += number;
            }
        }

        System.out.println("The sum of the odd numbers is " + sumOfOddNumbers);
        System.out.println("The sum of the even numbers is " + sumOfEvenNumbers);
    }
}
