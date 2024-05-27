
import java.util.Scanner;
import java.util.ArrayList;

class Task {
    private ArrayList<String> tasks = new ArrayList<>();

    public void addTask(String name) {
        tasks.add(name);
        System.out.println("Task added");
    }

    public void removeTask(int taskNumber) {
        tasks.remove(taskNumber - 1);
        System.out.println("Task removed.");
    }

    public void listTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public boolean isEmpty() {
        return tasks.isEmpty();
    }

    public boolean isValidNumber(int taskNumber) {
        return taskNumber >= 1 && taskNumber <= tasks.size();
    }
}

public class TaskListApp {
    private static int getChoice(Scanner scan) {
        return scan.nextInt();
    }

    private static String getName(Scanner scan) {
        System.out.print("Enter the task name: ");
        return scan.next();
    }

    private static int getInput(Scanner scan) {
        System.out.print("Enter the task number to remove: ");
        return scan.nextInt();
    }

    private static void displayMenu() {
        System.out.println("Task List Application");
        System.out.println("1. Add Task");
        System.out.println("2. Remove Task");
        System.out.println("3. List Tasks");
        System.out.println("4. Quit");
        System.out.print("Select an option from above: ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Task task = new Task();
        while (true) {
            displayMenu();
            int choice = getChoice(scan);
            switch (choice) {
                case 1:
                    task.addTask(getName(scan));
                    break;
                case 2:
                    if (!task.isEmpty()) {
                        task.listTasks();
                        int taskNumber = getInput(scan);
                        if (task.isValidNumber(taskNumber)) {
                            task.removeTask(taskNumber);
                        } else {
                            System.out.println("Invalid Task Number.");
                        }
                    } else {
                        System.out.println("No tasks to remove.");
                    }
                    break;
                case 3:
                    if (!task.isEmpty()) {
                        task.listTasks();
                    } else {
                        System.out.println("No tasks to list.");
                    }
                    break;
                case 4:
                    scan.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
