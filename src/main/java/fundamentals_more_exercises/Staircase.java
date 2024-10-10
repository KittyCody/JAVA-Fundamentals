package fundamentals_more_exercises;

public class Staircase {

    public static int countWays(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
    }

    public static void main(String[] args) {
        int n = 5;
        int ways = countWays(n);
        System.out.println("num of ways " + n + " steps: " + ways);
    }
}
