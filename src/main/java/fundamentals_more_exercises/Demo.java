package fundamentals_more_exercises;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Double> salariesMap = new HashMap<>();

        //will add the pair only if the key doesn't exist yet
        salariesMap.putIfAbsent("Mike", 3450.50);

        //will add a new value if the key is existing or add a new key with the same value
        salariesMap.put("John", 3450.50);
        scanner.close();
    }
}

// Remove anything that's not a digit, decimal point, or comma ^^
// [^\d.,]
