package fundamentals_more_exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        Map<String, String> digitNames = new HashMap<>();
        digitNames.put("0", "zero");
        digitNames.put("1", "one");
        digitNames.put("2", "two");
        digitNames.put("3", "three");
        digitNames.put("4", "four");
        digitNames.put("5", "five");
        digitNames.put("6", "six");
        digitNames.put("7", "seven");
        digitNames.put("8", "eight");
        digitNames.put("9", "nine");

        int lastDigit = num % 10;

        String lastDigitName = digitNames.get(String.valueOf(lastDigit));

        System.out.println(lastDigitName);

        scan.close();
    }
}
