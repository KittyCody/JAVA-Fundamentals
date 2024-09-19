package lists_more_exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> input = Arrays.stream(scan.nextLine().split(""))
                .map(String::valueOf)
                .collect(Collectors.toList());

        List<String> digits = new ArrayList<>();
        List<String> chars = new ArrayList<>();

        List<Integer> skipCount = new ArrayList<>();
        List<Integer> takeCount = new ArrayList<>();

        for (String currentChar : input) {
            if (currentChar.matches("\\d")) {
                digits.add(currentChar);
            } else {
                chars.add(currentChar);
            }
        }

        for (int i = 0; i < digits.size(); i++) {
            int currentDigit = Integer.parseInt(digits.get(i));
            if (i % 2 == 0) {
                takeCount.add(currentDigit);
            } else {
                skipCount.add(currentDigit);
            }
        }

        StringBuilder result = new StringBuilder();
        int currentIndex = 0;

        for (int i = 0; i < takeCount.size(); i++) {
            int take = takeCount.get(i);
            int skip = skipCount.get(i);

            for (int j = 0; j < take && currentIndex < chars.size(); j++) {
                result.append(chars.get(currentIndex));
                currentIndex++;
            }

            currentIndex += skip;
        }

        System.out.println(result);

        scan.close();
    }
}
