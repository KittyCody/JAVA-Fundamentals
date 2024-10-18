package maps;

import fundamentals_more_exercises.Demo_Lambda_StreamAPI;

import java.util.*;

public class Legendary_Farming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materials = new LinkedHashMap<>();;
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        Map<String, Integer> junks = new LinkedHashMap<>();
        boolean isLegendaryItemBought = false;

        while(!isLegendaryItemBought) {

            String input = scanner.nextLine();
            String[] inputData = input.split(" ");

            for(int index = 0; index <= inputData.length - 1; index += 2) {

                int quantity = Integer.parseInt(inputData[index]);
                String material = inputData[index + 1].toLowerCase();

                if(material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int existingQuantity = materials.get(material);
                    materials.put(material, existingQuantity + quantity);
                }
                else {
                    if(junks.containsKey(material)) {
                        junks.put(material, junks.get(material) + quantity);
                    }
                    else{
                    junks.put(material, quantity);
                }

                }

                for(Map.Entry<String, Integer> entry : materials.entrySet()) {

                    if(entry.getValue() >= 250){
                        isLegendaryItemBought = true;
                        switch (entry.getKey()) {
                            case "shards" -> System.out.println("Shadowmourne obtained!");
                            case "fragments" -> System.out.println("Valanyr obtained!");
                            case "motes" -> System.out.println("Dragonwrath obtained!");
                        }

                        int newQuantity = entry.getValue() - 250;
                        materials.put(material, newQuantity);
                    }
                }
                  if(isLegendaryItemBought) {
                      break;
                  }
         }
        }
        materials.forEach((key, value) -> System.out.printf("%s: %d\n", key, value));
        junks.forEach((key, value) -> System.out.printf("%s: %d\n", key, value));
        scanner.close();
    }

    //3 Motes 5 Stones 5 Shards
    //6 leathers 255 fragments 7 Shards

    //123 silver 6 shards 8 shards 5 motes
    //9 fangs 75 motes 103 MOTES 8 Shards
    //86 Motes 7 stones 19 silver
}
