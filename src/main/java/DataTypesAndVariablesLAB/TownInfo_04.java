package DataTypesAndVariablesLAB;

import java.math.BigInteger;
import java.util.Scanner;

public class TownInfo_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String city = scan.nextLine();
        BigInteger population = new BigInteger(scan.nextLine());
        int area = Integer.parseInt(scan.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", city, population, area);

        scan.close();
    }
}
