package taskmanagement;

import java.util.Scanner;

public class TaskMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        System.out.print("Enter task title: ");
        String title = scanner.nextLine();

        System.out.print("Enter task description: ");
        String description = scanner.nextLine();

        taskManager.addTask(title, description);
        System.out.println("Task added successfully!");

        System.out.println("Displaying task:");
        taskManager.displayTask();

        scanner.close();
    }
}