package FundamentalsExercises;
import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = Integer.parseInt((scan.nextLine()));

        String ageCategory = "";

        if(age >= 0 && age <= 2){
            ageCategory = "baby";
        } else if(age <= 13){
            ageCategory = "child";
        } else if(age <= 19){
            ageCategory = "teenager";
        } else if(age <= 65){
            ageCategory = "adult";
        } else {
            ageCategory = "elder";
        }

        if(age < 0 || age > 122){
            System.out.println("Type a real age!");
        } else {
            System.out.println(ageCategory);
        }


        scan.close();

    }
}

