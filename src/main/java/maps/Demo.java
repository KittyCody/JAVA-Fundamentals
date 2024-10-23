package maps;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        byte digit = Byte.parseByte(scanner.nextLine());
        int count = 0;

        while(number > 0) {
            int remainder = number % 2;
            if(remainder == digit) {
                count++;
            }
            number /= 2;
        }

        System.out.println(count);

        scanner.close();
    }
}
