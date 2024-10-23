package text_processing;

import java.util.*;

public class Repeat_Strings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] texts = scanner.nextLine().split(" ");

     for(String text : texts) {
         int length = text.length();
       System.out.print(text.repeat(length));
     }

        scanner.close();
    }

}
