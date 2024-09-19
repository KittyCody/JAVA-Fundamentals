package mid_exam_preparation;

import java.util.Scanner;

public class DungeonRooms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] rooms = scan.nextLine().split("\\|");
        int health = 100;
        int coins = 0;
        int roomsCount = 0;

        for(String room : rooms) {
            String name = room.split(" ")[0];
            int amount = Integer.parseInt(room.split(" ")[1]);

        switch (name){
            case "potion":

                break;
            case "chest":
                break;
            default:
                break;
        }





        }
    }
}



