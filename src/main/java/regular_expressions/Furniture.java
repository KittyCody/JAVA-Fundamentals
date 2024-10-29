package regular_expressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> furniture = new ArrayList<>(); // all the furniture after check out
        String input = scanner.nextLine();
        double totalPrice = 0;

        String regex = "/>>(?<type>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)\\b/gm";
        Pattern pattern = Pattern.compile(regex);


        while (!input.equals("purchase")) {

            Matcher matcher = pattern.matcher(input);

            if(matcher.find()) {
                String type = matcher.group("type");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furniture.add(type);
                double pricePerFurniture = price * quantity;
                totalPrice += pricePerFurniture;
            }

            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);
        System.out.printf("Total price: %.2f\n", totalPrice);

        scanner.close();
    }
}
