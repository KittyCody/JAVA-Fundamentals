package regular_expressions.exam_preparation;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        StringBuilder finalCombination = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
                finalCombination.append(c);
            }
        }

       System.out.println(finalCombination);

        scanner.close();
    }
}
