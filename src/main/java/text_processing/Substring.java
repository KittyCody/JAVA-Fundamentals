package text_processing;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstText = scanner.nextLine();
        String secondText = scanner.nextLine();

        StringBuilder sb = new StringBuilder(secondText);
        int index = sb.indexOf(firstText);

        while (index > -1) {
            sb.delete(index, index + firstText.length());
            index = sb.indexOf(firstText);
        }

        System.out.println(sb.toString());
        scanner.close();
    }
}
