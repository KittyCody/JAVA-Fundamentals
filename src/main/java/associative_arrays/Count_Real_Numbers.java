package associative_arrays;

import java.util.*;

public class Count_Real_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToDouble(Double::parseDouble)
                                .toArray();

        Map<Double, Integer> numbersCount = new TreeMap<>();

        for(double number : numbers) {
            if(!numbersCount.containsKey(number)){
                numbersCount.put(number, 1);
            } else {
                int currentCount = numbersCount.get(number);
                numbersCount.put(number, currentCount + 1);
            }
        }

        for(Map.Entry<Double, Integer> entry : numbersCount.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        scanner.close();
    }
}
