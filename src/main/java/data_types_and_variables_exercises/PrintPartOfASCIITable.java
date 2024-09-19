package data_types_and_variables_exercises;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startingPoint = Integer.parseInt(scan.nextLine());
        int endingPoint = Integer.parseInt(scan.nextLine());

        StringBuffer buff = new StringBuffer();

        for(int i = startingPoint; i <= endingPoint; i++){
            int currentNum = i;
            char currentChar = (char) currentNum;
            buff.append(currentChar + " ");

        }
        System.out.println(buff);

        scan.close();
    }
}
