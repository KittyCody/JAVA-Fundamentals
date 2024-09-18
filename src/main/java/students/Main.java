package students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] data = input.split(" ");

            String name = data[0];
            String surname = data[1];
            int age = Integer.parseInt(data[2]);
            String hometown = data[3];

            // Create a new student object
            Student student = new Student(name, surname, age, hometown);

            studentList.add(student);
            input = scanner.nextLine();
        }

        String town = scanner.nextLine();

        for (Student student : studentList) {
            if (student.getHometown().equals(town)) {
                System.out.printf("%s %s is %d years old%n", student.getName(), student.getSurname(), student.getAge());
            }
        }

        scanner.close();
    }
}
