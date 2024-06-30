package FundamentalsExercises;
import java.util.Scanner;


public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userName = scan.nextLine();
        String reversedUserName = new StringBuilder(userName).reverse().toString();

        boolean isUserNameFound = false;
        int userInputCount = 0;

      while(true){

        String userInput = scan.nextLine();
        userInputCount++;
        if(userInput.equals(reversedUserName)){
            isUserNameFound = true;
            System.out.printf("User %s logged in.", userName);
            break;

        } else if (userInputCount == 4){

                System.out.printf("User %s blocked!", userName);
                break;
        } else{
            System.out.println("Incorrect password. Try again.");
        }
      }
        scan.close();
    }
}
