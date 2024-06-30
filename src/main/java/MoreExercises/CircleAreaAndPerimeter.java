package MoreExercises;
import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double radius = Double.parseDouble(scan.nextLine());
        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;


        String formattedArea = String.format("%.2f", area);
        String formattedPerimeter = String.format("%.2f", perimeter);

        System.out.println(formattedArea);
        System.out.println(formattedPerimeter);

        scan.close();
    }
}

