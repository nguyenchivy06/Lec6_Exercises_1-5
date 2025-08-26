package Lec6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise5_FilterEvenNumbers {

    public static ArrayList<Integer> filterEvenNumbers(int[] arr) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }
        return evenList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));

        ArrayList<Integer> evenNumbers = filterEvenNumbers(arr);

        System.out.println("Even numbers: " + evenNumbers);
    }
}
