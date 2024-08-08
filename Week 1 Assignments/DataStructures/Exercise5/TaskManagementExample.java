package Exercise5;

public class TaskManagementExample {
	public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        Task t1 = new Task(1, "Design module", "Pending");
        Task t2 = new Task(2, "Implement feature", "In Progress");
        Task t3 = new Task(3, "Test application", "Completed");

        taskList.addTask(t1);
        taskList.addTask(t2);
        taskList.addTask(t3);

        System.out.println("All Tasks:");
        taskList.traverseTasks();

        System.out.println("\nSearching for Task with ID 2:");
        Task task = taskList.searchTask(2);
        if (task != null) {
            System.out.println(task);
        } else {
            System.out.println("Task not found.");
        }

        System.out.println("\nDeleting Task with ID 2:");
        taskList.deleteTask(2);

        System.out.println("\nAll Tasks after deletion:");
        taskList.traverseTasks();
    }
}
