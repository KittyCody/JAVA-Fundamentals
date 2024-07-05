package Lists_EXERCISES;

import java.util.*;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String[] array = input.split("\\|");
        List<Integer> numbers = new ArrayList<>();

        for(int i = array.length - 1; i >= 0; i--) {
            String[] items = array[i].trim().split("\\s+");

            for(String item : items) {
                numbers.add(Integer.parseInt(item));
            }
        }

        for(int number : numbers) {
            System.out.print(number + " ");
        }

        scan.close();
    }
}
