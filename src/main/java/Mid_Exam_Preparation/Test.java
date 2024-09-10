package Mid_Exam_Preparation;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>(Arrays.stream(scan.nextLine().split(""))
                .map(Integer::parseInt)
                .toList());

        Collections.reverse(numbers);

        scan.close();

    }


}
