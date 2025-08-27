package Lec6;
import java.util.Scanner;

public class Exercise12_CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[] freq = new int[26];
        for (char c : text.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char)(i + 'a') + ": " + freq[i]);
            }
        }
    }
}
