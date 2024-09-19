package data_types_and_variables_exercises;
import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int targetCount = 0;

        int N = Integer.parseInt(scan.nextLine());
        int M = Integer.parseInt(scan.nextLine());
        int Y = Integer.parseInt(scan.nextLine());

        int originalN = N;

        while(N >= M){
            if (N == originalN / 2 && Y != 0){
                N /= Y;
            }
            if(N >= M){
                N -= M;
                targetCount++;
            }
        }

        System.out.println(N);
        System.out.println(targetCount);

        scan.close();
    }
}


