package methods_LAB;

import java.util.Scanner;

public class Grades {

    public static void printResult(double score){

        if(score >= 2.00 && score <= 2.99){
            System.out.println("Fail");
        } else if(score > 2 && score <= 3.49){
            System.out.println("Poor");
        } else if(score > 3.49 && score <= 4.49){
            System.out.println("Good");
        } else if(score > 4.49 && score <= 5.49){
            System.out.println("Very good");
        } else if(score > 5.49 && score <= 6.00){
           System.out.println("Excellent");
        } else{
            System.out.println("Not a valid score !");
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double input = scan.nextDouble();

        scan.close();
        printResult(input);

    }
}
