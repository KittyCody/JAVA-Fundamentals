package objects_and_classes.songs.articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        String title = input[0];
        String content = input[1];
        String author = input[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < n; i++) {

           String row = scanner.nextLine();
           String command = row.split(": ")[0];
           String newValue = row.split(": ")[1];

            switch (command) {
                case "Edit":
                    article.edit(newValue);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(newValue);
                    break;
                    case "Rename":
                        article.rename(newValue);
            }
        }
        System.out.println(article);

        scanner.close();
    }
}
