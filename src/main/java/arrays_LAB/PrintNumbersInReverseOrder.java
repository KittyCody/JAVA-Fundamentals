package arrays_LAB;
import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scan.nextLine());
        int[] numbers = new int[numberOfLines];

        for(int i = 0; i < numberOfLines; i++){
            int currentNum = Integer.parseInt(scan.nextLine());
            numbers[i] = currentNum;
        }

        for(int i = numbers.length - 1; i >= 0; i--){
            System.out.print(numbers[i] + " ");
        }

        scan.close();
    }
}


