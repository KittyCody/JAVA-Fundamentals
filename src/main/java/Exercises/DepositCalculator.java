package Exercises;
import java.util.Scanner;


public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double depositedSum = Double.parseDouble(scan.nextLine());
        int deadline = Integer.parseInt(scan.nextLine());
        double annualInterest = Double.parseDouble(scan.nextLine());

        double totalTax = depositedSum * (annualInterest / 100);
        double monthlyInterest = totalTax / 12;
        double totalSum = depositedSum + deadline * monthlyInterest; System.out.println(totalSum);
scan.close();}



}







