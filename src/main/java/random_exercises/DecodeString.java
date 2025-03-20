package random_exercises;

import java.util.Scanner;

public class DecodeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        int length = input1.length();

        StringBuilder build = new StringBuilder();
        for (int i = 0; i < length; i++) {
            build.append(input1.charAt(i));
            build.append(input2.charAt(i));
        }

        System.out.println(build);

        scanner.close();
    }
}
