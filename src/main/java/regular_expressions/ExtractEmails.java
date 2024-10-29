package regular_expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String regexUser = "\\w+[.\\-_]?\\w+";
                String regexHost = "([A-Za-z]+-?[A-Za-z]+)(\\.([A-Za-z]+-?[A-Za-z]+))+";
                String regexEmail = regexUser + "@" + regexHost;
                Pattern pattern = Pattern.compile(regexEmail);

                Matcher matcher = pattern.matcher(text);

                while(matcher.find()) {
                    System.out.println(matcher.group());
                }
        scanner.close();
    }
}
