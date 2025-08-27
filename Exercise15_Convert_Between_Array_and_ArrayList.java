package Lec6;
import java.util.ArrayList;
public class Exercise15_Convert_Between_Array_and_ArrayList {
    public static void main(String[] args) {
        String[] arr = {"Ann", "Bob"};
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) list.add(arr[i]);
        System.out.println(list);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Charles");
        list2.add("David");
        String[] arr2 = new String[list2.size()];
        for (int i = 0; i < list2.size(); i++) arr2[i] = list2.get(i);
        for (int i = 0; i < arr2.length; i++) System.out.print(arr2[i] + " ");
    }
}
