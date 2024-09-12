package Lists_EXERCISES;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_Last {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> partyList = new ArrayList<>();

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < numberOfCommands; i++){
            String[] currentCommand = scanner.nextLine().split(" ");
            String name = currentCommand[0];

            if(currentCommand[2].equals("not")){
                if(!partyList.contains(name)){
                    System.out.println(name + "is not in the List");
                } else {
                    partyList.remove(name);
                }
            }

            else{
                if(!partyList.contains(name)){
                    partyList.add(name);
                } else {
                    System.out.println(name + "is already in the List");
                }
            }

        }

        for(String name : partyList){
            System.out.println(name);
        }
        scanner.close();
    }
}
