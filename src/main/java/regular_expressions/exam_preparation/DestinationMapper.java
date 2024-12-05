package regular_expressions.exam_preparation;
import java.util.*;
import java.util.regex.*;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "([=/])([A-Z][a-zA-Z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> destinations = new ArrayList<>();
        int travelPoints = 0;

        while (matcher.find()) {
            String destination = matcher.group(2);
            destinations.add(destination);
            travelPoints += destination.length(); // Add to travel points
        }

        // Print results
        System.out.println("Destinations: " + String.join(", ", destinations));
        System.out.println("Travel Points: " + travelPoints);
    }
}

