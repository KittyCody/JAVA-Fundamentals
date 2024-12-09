package regular_expressions.exam_preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrintList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     List<String> words = Arrays.stream(scanner.nextLine().split(" "))
             .map(String :: toString)
             .collect(Collectors.toList());

        for(int i = words.size() - 1; i >= 0; i--){
            System.out.print(words.get(i) + " ");
        }
        scanner.close();
    }
}
