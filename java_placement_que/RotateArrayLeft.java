
//Program to rotate array elements left by 1 position

import java.util.*;

public class RotateArrayLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of array:-");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements:-");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int temp = arr[0];

        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[size - 1] = temp;

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
