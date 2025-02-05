package regular_expressions.exam_preparation;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = Integer.parseInt(scanner.nextLine());

    }
    private final int year;

public LeapYear(int year){
    this.year = year;

}

public boolean isLeapYear(){
    return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
}

}
