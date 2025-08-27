package Lec6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise7_Remove_Duplicate_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();

        System.out.println("Nhap cac so nguyen (nhap -1 de dung): ");
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) break;
            numbers.add(num);
        }

        for (int n : numbers) {
            if (!uniqueNumbers.contains(n)) {
                uniqueNumbers.add(n);
            }
        }

        System.out.println("Danh sach ban dau: " + numbers);
        System.out.println("Sau khi loai bo trung lap: " + uniqueNumbers);
    }
}
