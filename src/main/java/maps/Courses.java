package maps;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (!input.equals("end")) {

            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];

          courses.putIfAbsent(courseName, new ArrayList<>());
                courses.get(courseName).add(studentName);

            input = scanner.nextLine();}


        for (Map.Entry<String, List<String>> entry : courses.entrySet()) {
            String courseName = entry.getKey();
            List<String> students = entry.getValue();

            System.out.printf("%s: %d\n", courseName, students.size());
            students.forEach(student -> System.out.printf("--%s\n",student));
        }
        scanner.close();
    }
}
