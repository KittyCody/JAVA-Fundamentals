package objects_and_classes.songs.order_by_age;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        while(true) {
            String[] input = scanner.nextLine().split(" ");
            if(input[0].equals("End")){
                break;
            }

            String name = input[0];
            String id = input[1];
            int age = Integer.parseInt(input[2]);

            Person person = new Person(name, id, age);
            people.add(person);
        }


        people.sort(Comparator.comparing(Person::getAge));
for(Person person : people){
    System.out.printf("%s with ID: %s is %d years old.\n", person.getName(), person.getId(), person.getAge());
}
    }
}
