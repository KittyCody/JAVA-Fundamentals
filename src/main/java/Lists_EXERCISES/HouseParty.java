package Lists_EXERCISES;

import java.util.*;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numCommands = Integer.parseInt(scan.nextLine());
        List<String> guestList = new ArrayList<>();

        for(int i = 0; i < numCommands; i++) {
            String[] currentCommand = scan.nextLine().split(" ");
            String name = currentCommand[0];

            if(currentCommand[2].equals("not")){
                 if(guestList.contains(name)){
                     guestList.remove(name);
                 } else {
                     System.out.println(name + " " + "is not in the list!");
                 }
             } else if(guestList.contains(name)){
                System.out.println(name + " " + "is already in the list!");
            } else{
            guestList.add(name);}
        }
        scan.close();
        for(String guest : guestList){
            System.out.println(guest);
        }
    }
}
