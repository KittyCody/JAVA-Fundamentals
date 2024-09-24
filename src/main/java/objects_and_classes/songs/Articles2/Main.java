package objects_and_classes.songs.Articles2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        String title = input[0];
        String content = input[1];
        String author = input[2];

        Article article = new Article(title, content, author);


        int numOfCommands = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < numOfCommands; i++) {
            String[] command = scanner.nextLine().split(": ");
            String commandName = command[0];
            String newValue = command[1];

            switch(commandName){
                case "edit" -> article.edit(newValue);
                case "changeAuthor" -> article.changeAuthor(newValue);
                case "rename" -> article.rename(newValue);
            }
        }
        System.out.println(article.toString());
        scanner.close();
    }
}
