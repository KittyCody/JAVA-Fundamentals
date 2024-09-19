package methods_LAB;

import java.util.Scanner;

public class PrintingTriangle {

    private static void printLine(int end) {
        for(int i = 1; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printTriangle(int number) {
        for(int i = 1; i <= number; i++) {
            printLine(i);
        }
        for(int i = number - 1; i >= 1; i--) {
            printLine(i);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        printTriangle(number);
    }
}

