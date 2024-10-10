package fundamentals_more_exercises;

import java.util.*;

public class Demo_Lambda_StreamAPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split(" ");
        int [] numbers = Arrays.stream(input)
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static int convertToInt(String text){
        return Integer.parseInt(text);
    }
}
