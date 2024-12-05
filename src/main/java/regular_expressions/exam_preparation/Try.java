package regular_expressions.exam_preparation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        HashMap<String, Integer> employees = new HashMap<>(Integer.parseInt(input));

        List<String> names = new ArrayList<>();

        for(String name : employees.keySet()) {
            if(employees.get(name) >= 18) {
                names.add(name);
            }
        }


        scanner.close();
    }
}
