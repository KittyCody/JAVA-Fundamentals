package regular_expressions.exam_preparation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        HashMap<String, Integer> employees = new HashMap<>();
        List<String> names = new ArrayList<>();

      while(true) {

          String input = scanner.nextLine();

          if(input.equalsIgnoreCase("stop")) {
              break;
          }

          String [] parts = input.split(" ");
          String name = parts[0];
          int age = Integer.parseInt(parts[1]);
          employees.put(name, age);

          for(String employee : employees.keySet()) {
              if(employees.get(employee) >= 18) {
                  names.add(employee);
              }
          }
          scanner.close();
        }
      for(String name : names) {
          System.out.println(name);
      }
    }
}
