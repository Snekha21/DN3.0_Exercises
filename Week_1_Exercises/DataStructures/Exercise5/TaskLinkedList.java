package Exercise5;

public class TaskLinkedList {
	 private TaskNode head;

	    public TaskLinkedList() {
	        this.head = null;
	    }

	    // Method to add a task to the list
	    public void addTask(Task task) {
	        TaskNode newNode = new TaskNode(task);
	        if (head == null) {
	            head = newNode;
	        } else {
	            TaskNode current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	    }

	    // Method to search for a task by taskId
	    public Task searchTask(int taskId) {
	        TaskNode current = head;
	        while (current != null) {
	            if (current.task.getTaskId() == taskId) {
	                return current.task;
	            }
	            current = current.next;
	        }
	        return null;
	    }

	    // Method to traverse and print all tasks
	    public void traverseTasks() {
	        TaskNode current = head;
	        while (current != null) {
	            System.out.println(current.task);
	            current = current.next;
	        }
	    }

	    // Method to delete a task by taskId
	    public void deleteTask(int taskId) {
	        if (head == null) {
	            System.out.println("Task list is empty.");
	            return;
	        }

	        if (head.task.getTaskId() == taskId) {
	            head = head.next;
	            return;
	        }

	        TaskNode current = head;
	        while (current.next != null) {
	            if (current.next.task.getTaskId() == taskId) {
	                current.next = current.next.next;
	                return;
	            }
	            current = current.next;
	        }
	        System.out.println("Task not found.");
	    }
	}
