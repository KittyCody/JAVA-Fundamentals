package random_exercises;

public class MissingNumber {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 2, 8, 4, 5};
        System.out.println("The missing number is: " + findMissingNumber(arr));
    }
}
