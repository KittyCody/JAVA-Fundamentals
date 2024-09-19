package lists_more_exercises;

import java.util.*;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.reverse(numbers);

        for(int number : numbers) {
            System.out.print(number + " ");
        }

        scanner.nextLine();
    }
}