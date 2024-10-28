package regular_expressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // Regular expression to match the phone number pattern
        String regex = "\\+359([ -])\\d{1}\\1\\d{3}\\1\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> validNumbers = new ArrayList<>();

        while (matcher.find()) {
            validNumbers.add(matcher.group());
        }

        // Join the valid numbers into a single string separated by ", " and print it
        System.out.println(String.join(", ", validNumbers));

        scanner.close();
    }
}
