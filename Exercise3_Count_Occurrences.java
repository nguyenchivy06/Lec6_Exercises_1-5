package Lec6;
import java.util.Scanner;

public class Exercise3_Count_Occurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int numberToFind = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == numberToFind) {
                count++;
            }
        }

        System.out.println("The number " + numberToFind + " appears " + count + " time(s) in the array.");
    }
}
