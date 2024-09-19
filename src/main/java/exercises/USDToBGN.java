package exercises;
import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);

  double dollar = Double.parseDouble(scan.nextLine());
  double dollarInBgLev = 1.79549;

  double totalBgLev = dollar * dollarInBgLev;

  System.out.println(totalBgLev);
  scan.close();
    }
}
