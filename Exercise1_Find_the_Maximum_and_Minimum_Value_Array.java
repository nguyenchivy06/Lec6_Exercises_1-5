package Lec6;

import java.util.Scanner;

public class Exercise1_Find_the_Maximum_and_Minimum_Value_Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mot day so nguyen: ");
        int number = scanner.nextInt();
        int[] temps = new int[number];
        for ( int i = 0; i < number ; i++ ){
            System.out.println(" so thu "+ (i + 1));
            temps[i] = scanner.nextInt();
        }
        int max = temps[0];
        int min = temps[0];
        for ( int i = 0 ; i < number ; i++ ){
            if ( temps[i] > max )
                
        max = temps[i];
            if ( temps[i] < min ){
                min = temps[i];
            }
        }
            System.out.println("so lon nhat la: " + max);
            System.out.println("So nho nhat la: "+min);
    
}}
