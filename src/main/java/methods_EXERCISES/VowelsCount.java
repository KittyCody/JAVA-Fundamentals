package methods_EXERCISES;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        int result = findVowelsCount(word);

        System.out.println(result);
        scan.close();
    }

    private static int findVowelsCount(String word) {
        int vowelsCount = 0;
        for(int i = 0; i < word.length(); i++){
            char currentLetter = word.charAt(i);
            if(isVowel(currentLetter)){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    private static boolean isVowel(char letter) {
        letter = Character.toLowerCase(letter);
        return letter == 'a' || letter == 'e' || letter == 'o' || letter == 'i' || letter == 'u';
    }
}
