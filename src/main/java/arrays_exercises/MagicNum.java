package arrays_exercises;

import java.util.Scanner;

public class MagicNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] elements = scan.nextLine().split(" ");
        int magicNum = Integer.parseInt(scan.nextLine());
        StringBuilder magicNumbers = new StringBuilder();

        for(int i = 0; i < elements.length; i++){
            int num1 = Integer.parseInt(elements[i]);
            for(int j = i + 1; j < elements.length; j++){
                int num2 = Integer.parseInt(elements[j]);

                if(num1 + num2 == magicNum) {
                    magicNumbers.append(num1).append(" ").append(num2).append("\n");
                }
            }
        }

        System.out.println(magicNumbers);
        scan.close();
    }
}
