package Lists_EXERCISES;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> lessons = Arrays.stream(scanner.nextLine().split(", "))
                                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!input.equals("course start")){

            String[] commandParts = input.split(":");
            String commandName = commandParts[0].toLowerCase();
            String lesson = commandParts[1];

            switch (commandName){
                case "add":
                    if(!lessons.contains(lesson)){
                        lessons.add(lesson);
                    }
                    break;
                case "insert" :
                    int indexToInsert = Integer.parseInt(commandParts[2]);
                    if(!lessons.contains(lesson)){
                        lessons.add(indexToInsert, lesson);
                    }
                    break;
                case "remove":
                    lessons.remove(lesson);
                    lessons.remove(lesson + "exercise");
                    break;
                case "swap":
                    String lesson2 = commandParts[2];
                    if(lessons.contains(lesson2) && lessons.contains(lesson)){
                        int index1 = lessons.indexOf(lesson2);
                        int index2 = lessons.indexOf(lesson);

                        lessons.set(index1, lesson2);
                        lessons.set(index2, lesson);

                        String firstLessonExercise = lesson + "exercise";
                        String secondLessonExercise = lesson2 + "exercise";

                        if(lessons.contains(firstLessonExercise)) {
                            lessons.remove(firstLessonExercise);
                            lessons.add(index2 + 1, firstLessonExercise);
                        }

                        if(lessons.contains(secondLessonExercise)) {
                            lessons.remove(secondLessonExercise);
                            lessons.add(index1 + 1, secondLessonExercise);
                        }
                    }
                    break;
                    case "exercise":
                        String exercise = lesson + "-Exercise";
                        if(lessons.contains(lesson)){
                            if(!lessons.contains(exercise)){
                                int indexOfTheLesson = lessons.indexOf(lesson);
                                lessons.add(indexOfTheLesson + 1, exercise);
                            }

                        } else {
                            lessons.add(lesson);
                            lessons.add(exercise);
                        }

                    break;
            }

            input = scanner.nextLine();
        }

        int number = 1;
        for(String lesson : lessons) {
            System.out.println(number + "." + lesson);
             number++;
        }
        scanner.close();
    }

}
