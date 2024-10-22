package maps;

import java.util.*;

public class Courses_SoftUni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> students = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            String courseName = tokens[0];
            String studentName = tokens[1];

            // Add the course if not present
            students.putIfAbsent(courseName, new ArrayList<>());

            // Add the student if not already in the course list
            if (!students.get(courseName).contains(studentName)) {
                students.get(courseName).add(studentName);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : students.entrySet()) {
            String courseName = entry.getKey();
            List<String> studentList = entry.getValue();

            System.out.printf("%s: %d\n", courseName, studentList.size());
            for (String student : studentList) {
                System.out.printf("-- %s\n", student);
            }
        }

        scanner.close();
    }
}
