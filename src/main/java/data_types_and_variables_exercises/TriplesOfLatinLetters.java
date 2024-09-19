package data_types_and_variables_exercises;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userInput = scan.nextInt();

        if(userInput < 1 || userInput > 26){
            System.out.println("Invalid input. 'n' must be between 1 and 26.");
            return;
        }

        int start = (int) 'a';

        for(int i = 0; i < userInput; i++){
            for(int j = 0; j < userInput; j++){
                for(int k = 0; k < userInput; k++){
                    char first = (char) (start + i);
                    char second = (char) (start + j);
                    char third =(char) (start + k);
                    System.out.println("" + first + second + third);
                }
            }
        }
        scan.close();
    }
}
