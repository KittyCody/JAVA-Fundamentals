package maps;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> productQuantity = new LinkedHashMap<>();
        Map<String, Double> productPrice = new LinkedHashMap<>();

        while (!input.equals("buy")) {

            String product = input.split(" ")[0].toLowerCase();
            double price = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);

            if (productQuantity.containsKey(product)) {
                productQuantity.put(product, productQuantity.get(product) + quantity);
            } else{
                productQuantity.put(product, quantity);
            }

            productPrice.put(product, price);

            input = scanner.nextLine();
        }

        for(Map.Entry<String, Integer> entry : productQuantity.entrySet()) {

            String product = entry.getKey();
            int quantity = entry.getValue();
            double price = productPrice.get(product) * quantity;

            System.out.printf("%s -> %.2f\n", product, price);
        }

        scanner.close();
    }
}
