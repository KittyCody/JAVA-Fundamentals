package maps;

import java.util.*;

public class Student_Academy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfStudents = scanner.nextInt();

        Map<String, List<Double>> studentGrades= new LinkedHashMap<>();

        for (int i = 0; i < numOfStudents; i++) {
            String studentName = scanner.next().toLowerCase();
            double grade = scanner.nextDouble();

            if(studentGrades.containsKey(studentName)){

                studentGrades.get(studentName).add(grade);

            } else {
                studentGrades.put(studentName, new ArrayList<>());
                studentGrades.get(studentName).add(grade);
            }

        }
        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()) {
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();

            double sum = grades.stream().mapToDouble(Double::doubleValue).sum();


            //Option 2

        // double sum = 0;
        // for (double grade : grades) {
        // sum += grade;
        // }


            double average = sum / grades.size();

            if(average >= 4.50) {
                System.out.printf("%s -> %.2f\n", studentName, average);
            }
        }

        scanner.close();
    }
}
