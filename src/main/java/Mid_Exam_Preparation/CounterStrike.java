package Mid_Exam_Preparation;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int energy = scan.nextInt();
        scan.nextLine();

        int wonBattlesCount = 0;

        while (true) {
            String command = scan.nextLine();

            if (command.equals("End of battle")) {
                System.out.printf("Won battles: %d. Energy left: %d%n", wonBattlesCount, energy);
                break;
            }

            int distance;
            try {
                distance = Integer.parseInt(command);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a valid number or 'End of battle'.");
                continue;
            }

            if (energy >= distance) {
                energy -= distance;
                wonBattlesCount++;

                if (wonBattlesCount % 3 == 0) {
                    energy += wonBattlesCount;
                }
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy.%n", wonBattlesCount, energy);
                break;
            }
        }

        scan.close();
    }
}
