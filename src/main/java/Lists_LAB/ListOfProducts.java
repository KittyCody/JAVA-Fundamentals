package Lists_LAB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfProducts = Integer.parseInt(scan.nextLine());
        List<String> products = new ArrayList<>();

        for(int i = 0; i < numOfProducts; i++){
            String currentProduct = scan.nextLine().toLowerCase();
            products.add(currentProduct);
        }
        Collections.sort(products);

        for(int i = 0; i < products.size(); i++){
            System.out.printf("%d.%s%n", i + 1, products.get(i));
        }

        scan.close();
    }
}
