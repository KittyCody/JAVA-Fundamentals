package MoreExercises;
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    double celsius = Double.parseDouble(scan.nextLine());
    double toFahrenheit = (celsius * 9 / 5) + 32;

    String formatedCelsius = String.format("%.2f", toFahrenheit);
    System.out.println(formatedCelsius);

    scan.close();
    }
}

