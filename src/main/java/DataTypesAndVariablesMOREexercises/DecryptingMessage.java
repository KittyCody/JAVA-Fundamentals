package DataTypesAndVariablesMOREexercises;
import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int key = Integer.parseInt(scan.nextLine());
        int numbersOfLines = Integer.parseInt(scan.nextLine());
        StringBuilder message = new StringBuilder();

        for(int i = 0; i < numbersOfLines; i++){
            char letter = scan.nextLine().charAt(0);
            int decryptedLetter = (int) letter + key;
            message.append((char) decryptedLetter);
        }
        System.out.println(message);
        scan.close();
    }
}


