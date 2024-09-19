package exercises;
import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    int pagesNum = Integer.parseInt(scan.nextLine());
    int pagesPerHour = Integer.parseInt((scan.nextLine()));
    int dayNeeded = Integer.parseInt((scan.nextLine()));

    int totalTimeNeeded = pagesNum / pagesPerHour;
    int hoursPerDay = totalTimeNeeded / dayNeeded;

    System.out.println(hoursPerDay);

    scan.close();

    }
}
