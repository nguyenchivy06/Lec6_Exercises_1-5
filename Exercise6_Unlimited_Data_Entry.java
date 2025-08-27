package Lec6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise6_Unlimited_Data_Entry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Nhap so nguyen (nhap -1 de ngung):");

       while(true){
           int num = scanner.nextInt();
           if(num == -1 ){
               break;
           }
           numbers.add(num);
       }
       int sum = 0;
       for( int i : numbers ){ 
           sum += i;
       }

        System.out.println("Danh sach so da nhap: " + numbers);
        System.out.println("Tong cac so = " + sum);
    }
}
