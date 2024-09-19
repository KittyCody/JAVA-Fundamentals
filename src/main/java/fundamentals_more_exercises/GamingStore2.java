package fundamentals_more_exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GamingStore2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());

        Map<String, Double> games = new HashMap<>();
        games.put("OutFall 4", 39.99);
        games.put("CS: OG", 15.99);
        games.put("Zplinter Zell", 19.99);
        games.put("Honored 2", 59.99);
        games.put("RoverWatch", 29.99);
        games.put("RoverWatch Origins Edition", 39.99);

        double totalSpent = 0.0;
        String userInput;

        while (!(userInput = scan.nextLine()).equals("Game Time")) {
            if (!games.containsKey(userInput)) {
                System.out.println("Not Found");
            } else {
                double gamePrice = games.get(userInput);
                if (gamePrice > budget) {
                    System.out.println("Too Expensive");
                } else {
                    budget -= gamePrice;
                    totalSpent += gamePrice;
                    System.out.println("Bought " + userInput);

                    if (budget == 0) {
                        System.out.println("Out of money!");
                        break;
                    }
                }
            }
        }

        if (budget > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f%n", totalSpent, budget);
        }

        scan.close();
    }
}

