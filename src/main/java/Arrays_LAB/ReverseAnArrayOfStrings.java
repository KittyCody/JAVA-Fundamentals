package Arrays_LAB;

import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);

  String[] items = scan.nextLine().split(" ");
  int left = 0;
  int right = items.length-1;

  while (left < right){
      String temp = items[left];
      items[left] = items[right];
      items[right] = temp;

      left++;
      right--;
  }

  for(String item : items){
      System.out.print(item + " ");
  }
        scan.close();

     }
}

