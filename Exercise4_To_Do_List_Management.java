package Lec6;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4_To_Do_List_Management {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> todoList = new ArrayList<>();

        while (true) {
            System.out.println("\n--- To-Do List Menu ---");
            System.out.println("1. Add a new task");
            System.out.println("2. View all tasks");
            System.out.println("3. Remove a task by index");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter a new task: ");
                String task = scanner.nextLine();
                todoList.add(task);
                System.out.println("Task added.");
            } else if (choice == 2) {
                System.out.println("Current tasks: " + todoList);
            } else if (choice == 3) {
                System.out.print("Enter the index of the task to remove: ");
                int index = scanner.nextInt();
                if (index >= 0 && index < todoList.size()) {
                    todoList.remove(index);
                    System.out.println("Task removed.");
                } else {
                    System.out.println("Invalid index.");
                }
            } else if (choice == 4) {
                System.out.println("Exiting program...");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
