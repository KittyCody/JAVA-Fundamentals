package arrays_LAB;

import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    String[] firstArray = scan.nextLine().split(" ");

    String[] secondArray = scan.nextLine().split(" ");
    int sum = 0;

    for(int i = 0; i < firstArray.length; i++){
        int num1 = Integer.parseInt(firstArray[i]);
        int num2 = Integer.parseInt(secondArray[i]);

        if(num1 == num2){
            sum += num1;

        } else{
            System.out.printf("Arrays are not identical. Found difference at %d index.", i);
            return;
        }

        }

    System.out.printf("Arrays are identical. Sum: %d", sum);
        scan.close();
    }
}
