package random_exercises;
import java.util.Arrays;
import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(numbers);

        int biggestNum = numbers[numbers.length - 1];

        System.out.println(biggestNum);

    }
}

