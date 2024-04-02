import java.util.*;
public class arraysorting {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70,80};

        sortHalfAsc(array);
        sortHalfDesc(array);

        System.out.print("Sorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }


    public static void sortHalfAsc(int[] array) {
        for (int i = 0; i < array.length / 2 - 1; i++) {
            for (int j = i + 1; j < array.length / 2; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


    public static void sortHalfDesc(int[] array) {
        for (int i = array.length / 2; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}

