package objects_and_classes.songs.students_04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        int studentsNum = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < studentsNum; i++) {

            String input = scanner.nextLine();
            String[] inputParts = input.split(" ");
            String firstName = inputParts[0];
            String lastName = inputParts[1];
            double grade = Double.parseDouble(inputParts[2]);

            Student student = new Student(firstName, lastName, grade);
            students.add(student);
        }

        students.sort(Comparator.comparing(Student::getGrade).reversed());

        for(Student student : students) {
            System.out.printf("%s %s: %.2f\n", student.getFirstName(), student.getLastName(), student.getGrade());
        }
    scanner.close();}
}
