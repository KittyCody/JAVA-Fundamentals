package Lists_EXERCISES;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

List<String> arrays = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());


Collections.reverse(arrays);

String output = arrays.toString()
                .replace("[", "")
                        .replace("]", "")
                                .replace(",", "")
                                        .replaceAll("\\s+", " ")
                                                .trim();


System.out.println(output);
        scanner.close();
    }
}
