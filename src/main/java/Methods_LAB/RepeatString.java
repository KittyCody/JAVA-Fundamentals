package Methods_LAB;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        int numToRepeat = Integer.parseInt(scan.nextLine());

        String result = String.valueOf(repeatedWord(word, numToRepeat));

        System.out.println(result);

        scan.close();
    }

    private static StringBuilder repeatedWord(String word, int numToRepeat) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < numToRepeat; i++){
            result.append(word);
        }
        return result;
    }

}
