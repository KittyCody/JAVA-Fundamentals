package objects_and_classes.songs.company_roster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < n; i++) {
            String[] information = scanner.nextLine().split(" ");
            String name = information[0];
            double salary = Double.parseDouble(information[1]);
            String position = information[2];
            String department = information[3];
            String email = information[4];
            int age = Integer.parseInt(information[5]);



            
        }
    }
}
