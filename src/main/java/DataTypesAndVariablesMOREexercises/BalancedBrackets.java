package DataTypesAndVariablesMOREexercises;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scan.nextLine());
        int bracketCount = 0;

        for(int i = 0; i < numberOfLines; i++){
            char symbol = scan.nextLine().charAt(0);
            if(symbol == '('){
                bracketCount++;
            } else if(symbol == ')'){
                bracketCount--;
                if (bracketCount < 0) {
                    break;
                }
            }
        }
        if(bracketCount == 0){
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
        scan.close();
    }
}

