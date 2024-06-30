package FundamentalsLAB;
import java.util.Scanner;

public class TimeAfter30Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        minutes += 30;

        if(minutes > 59){
            hour += 1;
            minutes -= 60;
        }

        if(hour >= 24){
            hour -= 24;
        }

        String formatedMinutes = String.format("%02d", minutes);

        System.out.printf(hour + ":" + formatedMinutes);

        scan.close();

    }
}
