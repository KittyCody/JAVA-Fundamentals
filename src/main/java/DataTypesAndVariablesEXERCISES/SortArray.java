package DataTypesAndVariablesEXERCISES;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array: " + Arrays.toString(array));

        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            class QuickSort {
}
            int partitionIndex = partition(array, low, high);

            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int smallerElementIndex = low - 1;

        for (int currentIndex = low; currentIndex < high; currentIndex++) {
            if (array[currentIndex] <= pivot) {
                smallerElementIndex++;

                int temp = array[smallerElementIndex];
                array[smallerElementIndex] = array[currentIndex];
                array[currentIndex] = temp;
            }
        }

        int temp = array[smallerElementIndex + 1];
        array[smallerElementIndex + 1] = array[high];
        array[high] = temp;

        return smallerElementIndex + 1;
    }
}

