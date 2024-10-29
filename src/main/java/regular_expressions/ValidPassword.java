package regular_expressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {
    private static final String REGEX_PASS = "_\\.+(?<password>[A-Z][A-Za-z0-9]{4,}[A-Z])_\\.+";
    private static final Pattern PATTERN = Pattern.compile(REGEX_PASS);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String password = scanner.nextLine();
            processPassword(password);
        }

        scanner.close();
    }

    private static void processPassword(String password) {
        Matcher matcher = PATTERN.matcher(password);

        if (matcher.matches()) {
            String group = extractDigitGroup(matcher.group("password"));
            System.out.println("Group: " + (group.isEmpty() ? "default" : group));
        } else {
            System.out.println("Invalid pass!");
        }
    }


    private static String extractDigitGroup(String password) {
        StringBuilder group = new StringBuilder();
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                group.append(symbol);
            }
        }
        return group.toString();
    }
}
