package text_processing;

import java.util.Scanner;

public class Caesar_Cipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder encryptedText = new StringBuilder();

        for(char symbol : text.toCharArray()) {

            char encryptedSymbol = (char) (symbol + 3);
            encryptedText.append(encryptedSymbol);
        }

        System.out.println(encryptedText.toString());
        scanner.close();
    }
}
