package lists_exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers2 {
    public static void main(String[] args) {
        Scanner
                scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        int[] bombAndPower = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = calculateSumNum(numbers, bombAndPower);

        System.out.println(sum);

    }

    private static int calculateSumNum(List<Integer> numbers, int[] bombAndPower) {
        int sum = 0;
        int bomb = bombAndPower[0];
        int power = bombAndPower[1];

        for(int i = 0; i < numbers.size(); i++){
            int currentNum = numbers.get(i);

            if(currentNum != bomb){
                continue;
            }
            numbers.set(i,0);

            for(int j = 1; j <= power; j++){
                if(i + j < numbers.size()) {
                    numbers.set(i + j, 0);
                }
                if(i - j >= 0){
                    numbers.set(i - j, 0);
                }
            }
        }
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }
}

