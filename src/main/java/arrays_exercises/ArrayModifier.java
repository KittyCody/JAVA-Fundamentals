package arrays_exercises;

import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] elements = scan.nextLine().split(" ");
        int[] array = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            array[i] = Integer.parseInt(elements[i]);
        }

        String input;
        while (!(input = scan.nextLine()).equals("end")) {
            String[] command = input.split("\\s+");
            String action = command[0];

            switch (action) {
                case "swap":
                    int index1 = Integer.parseInt(command[1]);
                    int index2 = Integer.parseInt(command[2]);
                    swap(array, index1, index2);
                    break;
                case "multiply":
                    index1 = Integer.parseInt(command[1]);
                    index2 = Integer.parseInt(command[2]);
                    multiply(array, index1, index2);
                    break;
                case "decrease":
                    decrease(array);
                    break;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }

        scan.close();
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void multiply(int[] array, int index1, int index2) {
        array[index1] *= array[index2];
    }

    private static void decrease(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]--;
        }
    }
}

