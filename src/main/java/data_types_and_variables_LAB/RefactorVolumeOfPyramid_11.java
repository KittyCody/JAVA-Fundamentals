package data_types_and_variables_LAB;

import java.util.Scanner;

public class RefactorVolumeOfPyramid_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Double length = Double.parseDouble(scanner.nextLine());
        Double width = Double.parseDouble(scanner.nextLine());
        Double height = Double.parseDouble(scanner.nextLine());
        Double volume = (length * width * height) / 3;

        System.out.printf("Length: Width: Height: Pyramid Volume: %.2f", volume);

        scanner.close();
    }
}
