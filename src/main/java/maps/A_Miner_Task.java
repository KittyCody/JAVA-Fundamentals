package maps;

import java.util.*;

public class A_Miner_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();
        Map<String,Integer> resources = new LinkedHashMap<>();

        while(!input.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());

            if(!resources.containsKey(input)){
                resources.put(input,quantity);
            } else{
                resources.put(input,resources.get(input)+quantity);
            }

            input = scanner.nextLine().toLowerCase();
        }

        resources.forEach((key, value) -> System.out.println(key + " -> " + value));

        scanner.close();
    }
}
