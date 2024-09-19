package fundamentals_exercises;
import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int studentsNum = Integer.parseInt(scan.nextLine());
        double priceOfLightSabers = Double.parseDouble(scan.nextLine());
        double robePrice = Double.parseDouble(scan.nextLine());
        double beltPrice = Double.parseDouble(scan.nextLine());

        int lightsabersNeeded = (int) Math.ceil(studentsNum * 1.1);
        double totalLightsabersPrice = lightsabersNeeded * priceOfLightSabers;

        double totalRobesPrice = studentsNum * robePrice;

        int freeBelts = studentsNum / 6;
        double totalBeltsPrice = (studentsNum - freeBelts) * beltPrice;

        double totalCost = totalLightsabersPrice + totalRobesPrice + totalBeltsPrice;

        if (totalCost <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.%n", totalCost);
        } else {
            double neededMoney = totalCost - budget;
            System.out.printf("George Lucas will need %.2flv more.%n", neededMoney);
        }

        scan.close();
    }
}



