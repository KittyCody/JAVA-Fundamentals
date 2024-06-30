package Arrays_EXERCISES;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int wagons = Integer.parseInt(scan.nextLine());
        int sum = 0;
        StringBuilder peopleInEachWagon = new StringBuilder(wagons);

        for(int i = 0; i < wagons; i++){
            int currentNumPeople = Integer.parseInt(scan.nextLine());
            sum += currentNumPeople;
            peopleInEachWagon.append(currentNumPeople).append(" ");
        }

        System.out.println(peopleInEachWagon);
        System.out.println(sum);

        scan.close();
    }
}
