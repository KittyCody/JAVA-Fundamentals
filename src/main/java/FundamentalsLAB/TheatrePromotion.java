package FundamentalsLAB;
import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String typeOfDay = scan.nextLine().toLowerCase();
        int age = Integer.parseInt(scan.nextLine());

        int price = 0;

        if(typeOfDay.equals("weekday")){
            if(age >= 0 && age <= 18 || age > 64 && age <= 122){
                price = 12;
            } else if(age > 18 && age <= 64){
                price = 18;
            }
        } else if(typeOfDay.equals("weekend")) {
            if(age >= 0 && age <= 18 || age > 64 && age <= 122){
                price = 15;
            } else if(age > 18 && age <= 64){
                price = 20;
            }
        } else if(typeOfDay.equals("holiday")){
            if(age >= 0 && age <= 18){
                price = 5;
            } else if(age > 18 && age <= 64){
                price = 12;
            } else if(age > 64 && age <= 122){
                price = 10;
            }
        } else{
            System.out.println("Error!");
        }
        if(age < 0){
            System.out.println("Error!");
        } else if(price > 0){
            System.out.println(price+"$");
        }
        scan.close();
    }
}


