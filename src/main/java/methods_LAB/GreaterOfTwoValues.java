package methods_LAB;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String valueType = scan.nextLine();

        switch (valueType) {
            case "int":
                int int1 = Integer.parseInt(scan.nextLine());
                int int2 = Integer.parseInt(scan.nextLine());
                System.out.println(getMax(int1, int2));
                break;
            case "char":
                char char1 = scan.nextLine().charAt(0);
                char char2 = scan.nextLine().charAt(0);
                System.out.println(getMax(char1, char2));
                break;
            case "string":
                String str1 = scan.nextLine();
                String str2 = scan.nextLine();
                System.out.println(getMax(str1, str2));
                break;
        }

        scan.close();
    }

    static int getMax(int firstNum, int secondNum) {
        return Math.max(firstNum, secondNum);
    }

    static char getMax(char first, char second) {
        return first > second ? first : second;
    }

    static String getMax(String first, String second) {
        return first.compareTo(second) >= 0 ? first : second;
    }
}




