package task12;

import java.util.Arrays;

/**
 * @author Vitalii Myroniuk
 *
 * Сортування вибором та пузирком?
 *
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 5 , 4, 1};
        System.out.println(Arrays.toString(selectionSort(array)));
        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    private static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    private static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
