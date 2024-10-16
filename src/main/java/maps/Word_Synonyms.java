package maps;

import java.util.*;

public class Word_Synonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wordsCount = Integer.parseInt(scanner.nextLine());

            Map<String, List<String>> synonyms = new LinkedHashMap<>();

        for (int count = 1; count <= wordsCount; count++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            synonyms.putIfAbsent(word, new ArrayList<>());
            synonyms.get(word).add(synonym);

        }


        for(Map.Entry<String, List<String>> pair : synonyms.entrySet()) {
            String word = pair.getKey();
            List<String> synonymList = pair.getValue();

            System.out.println(word + " - " + String.join(", ", synonymList));
        }
        scanner.close();
    }
}
