package data_types_and_variables_exercises;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfPeople = Integer.parseInt(scan.nextLine());
        int capacity = Integer.parseInt(scan.nextLine());

        double numOfFullCourses = Math.ceil((double)numOfPeople / capacity);
        System.out.printf("%.0f",numOfFullCourses);

        scan.close();
    }
}
