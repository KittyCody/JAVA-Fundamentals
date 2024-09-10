package Lists_EXERCISES;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> arrays = Arrays.stream(scanner.nextLine().split("\\|"))
                .map(String::trim)
                .collect(Collectors.toList());

        List<String> result = new ArrayList<>();

        for (int i = arrays.size() - 1; i >= 0; i--) {
            String[] elements = arrays.get(i).split("\\s+");
            for (String element : elements) {
                if (!element.isEmpty()) {
                    result.add(element);
                }
            }
        }

        System.out.println(String.join(" ", result));

        scanner.close();
    }
}
