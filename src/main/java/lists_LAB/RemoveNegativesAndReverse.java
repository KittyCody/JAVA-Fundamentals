package lists_LAB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList();

        List<Integer> positiveNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number > 0) {
                positiveNumbers.add(number);
            }
        }

        if(positiveNumbers.isEmpty()){
            System.out.print("empty");
        }

        Collections.reverse(positiveNumbers);

        System.out.println(positiveNumbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));

        scan.close();
    }
}

