package Lec6;
import java.util.Scanner;

public class Exercise8_InputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a number between 1 and 10: ");
            number = sc.nextInt();
        } while (number < 1 || number > 10);
        System.out.println("Valid number: " + number);
    }
}
