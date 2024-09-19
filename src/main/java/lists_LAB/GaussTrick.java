package lists_LAB;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        StringBuilder allNumbs = new StringBuilder();
        int length = numbers.size();
        int middleNum = 0;

        while (length > 1) {

            int start = numbers.getFirst();
            int end = numbers.getLast();
            int result = start + end;
            allNumbs.append(result).append(" ");
            length -= 2;
            numbers.removeFirst();
            numbers.removeLast();
        }

        if (length == 1) {
            middleNum = numbers.getFirst();
        }

        System.out.print(allNumbs);
        if (middleNum > 0) {
            System.out.print(middleNum);
            scan.close();
        }
    }
}
