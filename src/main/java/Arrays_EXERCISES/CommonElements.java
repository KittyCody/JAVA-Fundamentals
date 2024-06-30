package Arrays_EXERCISES;
import java.util.Objects;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] array1 = scan.nextLine().split(" ");
        String[] array2 = scan.nextLine().split(" ");
        StringBuilder commonElements = new StringBuilder();

        for (String item2 : array2) {
            for (String item1 : array1) {
                if (Objects.equals(item1, item2)) {
                    commonElements.append(item1).append(" ");
                }
            }
        }

        System.out.println(commonElements.toString().trim());

        scan.close();
    }
}

