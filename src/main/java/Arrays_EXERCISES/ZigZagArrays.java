package Arrays_EXERCISES;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfRows = Integer.parseInt(scan.nextLine());
        StringBuilder array1 = new StringBuilder();
        StringBuilder array2 = new StringBuilder();

        for (int row = 0; row < numOfRows; row++) {
            String[] items = scan.nextLine().split(" ");
            String firstItem = items[0];
            String secondItem = items[1];

            if (row % 2 == 0) {
                array1.append(firstItem).append(" ");
                array2.append(secondItem).append(" ");
            } else {
                array1.append(secondItem).append(" ");
                array2.append(firstItem).append(" ");
            }
        }

        System.out.println(array1.toString().trim());
        System.out.println(array2.toString().trim());

        scan.close();
    }
}


