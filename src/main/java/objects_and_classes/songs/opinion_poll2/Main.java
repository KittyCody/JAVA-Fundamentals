package objects_and_classes.songs.opinion_poll2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String name = input.split(" ")[0];
            int age = Integer.parseInt(input.split(" ")[1]);

            Person person = new Person(name, age);

            if(person.getAge() > 30){
                System.out.println(person.getName() + " - " + person.getAge());
            }
        }

        scanner.close();
    }
}
