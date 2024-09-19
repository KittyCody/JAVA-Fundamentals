package arrays_LAB;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userInput = Integer.parseInt(scan.nextLine());
        String[] days  = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday","Sunday"};
        String day = "";

        for(int i = 0; i < days.length; i++){
            if(userInput >= 1 && userInput <= 7){
                day = days[userInput - 1];
            } else {
                day = "Invalid day!";
            }
        }
        System.out.println(day);
        scan.close();
    }
}
