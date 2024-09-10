package Lists_EXERCISES;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while(true) {
            if(command.equals("end")){
                break;
            }
            String operation = command.split(" ")[0].toLowerCase();


            switch(operation){

                case "delete" -> deleteElementByIndex(numbers, command);
                case "insert" -> insertElementOnPosition(numbers,command);
            }
            command = scanner.nextLine();
        }

        for(int number : numbers){
            System.out.print(number + " ");
        }
        scanner.close();

    }

    private static void insertElementOnPosition(List<Integer> numbers, String command) {
        int numberToInsert = Integer.parseInt(command.split(" ")[1]);
        int position = Integer.parseInt(command.split(" ")[2]);

        if(position <= numbers.size()){
            numbers.add(position,numberToInsert);
        }
    }

    private static void deleteElementByIndex(List<Integer> numbers, String command) {
        int index = Integer.parseInt(command.split(" ")[1]);

        for(int i = 0 ; i < numbers.size() ; i++){
            if(numbers.get(i) == index){
                numbers.remove(i);
            }
        }
    }
}
