package taskmanagement;

public class TaskManager {
    private Task task;

    public void addTask(String title, String description) {
        task = new Task(title, description);
    }

    public void displayTask() {
        if (task != null) {
            System.out.println(task);
        } else {
            System.out.println("No task found.");
        }
    }
}