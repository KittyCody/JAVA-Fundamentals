package random_exercises;

import java.util.Scanner;

public class ReverseNum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            int number = scanner.nextInt();
            StringBuilder reversed = new StringBuilder(String.valueOf(number));

            reversed.reverse();

            System.out.println(reversed);

        scanner.close();
    }

}

//Tu ne peux pas convertir le nombre en chaîne de caractères.
//✅ Tu dois uniquement utiliser des opérations mathématiques (/ et %).
//✅ Pas de ArrayList, juste des variables.