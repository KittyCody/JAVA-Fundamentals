package text_processing;

import java.util.Scanner;

public class Text_Filter_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for(String bannedWord : bannedWords) {
            String wordToReplace = "*".repeat(bannedWord.length());
            text = text.replace(bannedWord, wordToReplace);
        }
        System.out.println(text);
        scanner.close();
    }
}
