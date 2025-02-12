package random_exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SecondLargestNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Integer result = secondBiggestNum(numbers);

        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("No second biggest num present.");
        }

        scanner.close();
    }

    private static Integer secondBiggestNum(List<Integer> numbers) {
        if (numbers.size() < 2) {
            return null;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > first) {
                second = first;
                first = number;
            } else if (number > second && number < first) {
                second = number;
            }
        }

        return (second == Integer.MIN_VALUE) ? null : second;
    }
}
