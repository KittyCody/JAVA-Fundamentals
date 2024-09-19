package more_exercises;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a= Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble((scan.nextLine()));

        double result = a * h / 2;

        String formatedResult = String.format("%.2f" , result);

        System.out.println(formatedResult);

        scan.close();
    }
}
