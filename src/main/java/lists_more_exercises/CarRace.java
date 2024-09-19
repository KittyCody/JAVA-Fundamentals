package lists_more_exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> raceTime = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> timePlayer1 = new ArrayList<>();
        List<Integer> timePlayer2 = new ArrayList<>();

        double sumPlayer1 = 0;
        double sumPlayer2 = 0;

      while(raceTime.size() > 1) {
          timePlayer1.add(raceTime.get(0));
          timePlayer2.add(raceTime.get(raceTime.size() - 1));
          raceTime.remove(0);
          raceTime.remove(raceTime.size() - 1);
      }
      for(int i = 0; i < timePlayer1.size(); i++){
          double currentNumber = timePlayer1.get(i);
          if(currentNumber == 0){
              sumPlayer1 -= sumPlayer1 * 0.2;
          }

          sumPlayer1 += currentNumber;
      }
      for(int j = 0; j < timePlayer2.size(); j++){
          double currentNumber = timePlayer2.get(j);

          if(currentNumber == 0){
              sumPlayer2 -= sumPlayer2 * 0.2;
          }
          sumPlayer2 += currentNumber;
      }

        if(sumPlayer1 < sumPlayer2){
            System.out.print("The winner is left with total time: " + sumPlayer1 );
        } else {
            System.out.print("The winner is right with total time: " + sumPlayer2);
        }

        scan.close();
    }
}
