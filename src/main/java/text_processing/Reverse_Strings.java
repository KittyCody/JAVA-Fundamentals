package text_processing;

import java.util.Scanner;

public class Reverse_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder reversedWord = new StringBuilder();
        while(!input.equals("end")){
            for(int position = input.length() - 1; position > 0; position--){
                char currentChar = input.charAt(position);
                reversedWord.append(currentChar);

            }
            input = scanner.nextLine();
        }
System.out.println(reversedWord);
        scanner.close();
    }
}
