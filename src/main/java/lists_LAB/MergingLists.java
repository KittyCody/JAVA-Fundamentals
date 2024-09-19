package lists_LAB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> firstArrayNumbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList();

        List<Integer> secondArrayNumbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList();

        List<Integer> allNumbers = getIntegerList(firstArrayNumbers, secondArrayNumbers);

        String result = allNumbers.stream()
                        .map(Object::toString)
                                .collect(Collectors.joining(" "));
        scan.close();

        System.out.println(result);
    }

    private static List<Integer> getIntegerList(List<Integer> firstArrayNumbers, List<Integer> secondArrayNumbers) {
        List<Integer> allNumbers = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < firstArrayNumbers.size() && j < secondArrayNumbers.size()) {
            allNumbers.add(firstArrayNumbers.get(i));
            allNumbers.add(secondArrayNumbers.get(j));
            i++;
            j++;
        }

        while (i < firstArrayNumbers.size()) {
            allNumbers.add(firstArrayNumbers.get(i));
            i++;
        }

        while (j < secondArrayNumbers.size()) {
            allNumbers.add(secondArrayNumbers.get(j));
            j++;
        }
        return allNumbers;
    }
}

