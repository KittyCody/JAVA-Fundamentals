package lists_more_exercises;

import java.util.*;

public class MixedUpLists {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] secondArray = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int constraint1 = firstArray[firstArray.length - 1];
        int constraint2 = secondArray[0];

        List<Integer> result = new ArrayList<>();
        List<Integer> sortedResult = new ArrayList<>();

        for (int i = 0; i < firstArray.length - 1; i++) {
            result.add(firstArray[i]);
        }

        for (int i = 1; i < secondArray.length; i++) {
            result.add(secondArray[i]);
        }

        int lowerBound = Math.min(constraint1, constraint2);
        int upperBound = Math.max(constraint1, constraint2);

        for (int number : result) {
            if (number > lowerBound && number < upperBound) {
                sortedResult.add(number);
            }
        }

        Collections.sort(sortedResult);

        for (int number : sortedResult) {
            System.out.print(number + " ");
        }

        scan.close();
    }
}
