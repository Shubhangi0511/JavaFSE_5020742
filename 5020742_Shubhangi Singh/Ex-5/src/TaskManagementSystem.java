public class TaskManagementSystem {
    private Node head;

    public TaskManagementSystem() {
        this.head = null;
    }

    private class Node {
        Task task;
        Node next;

        public Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next!= null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public Task searchTask(int taskId) {
        Node temp = head;
        while (temp!= null) {
            if (temp.task.getTaskId() == taskId) {
                return temp.task;
            }
            temp = temp.next;
        }
        return null;
    }
    public void traverseTasks() {
        Node temp = head;
        while (temp!= null) {
            System.out.println("Task ID: " + temp.task.getTaskId());
            System.out.println("Task Name: " + temp.task.getTaskName());
            System.out.println("Status: " + temp.task.getStatus());
            System.out.println();
            temp = temp.next;
        }
    }
    public void deleteTask(int taskId) {
        if (head == null) {
            return;
        }
        if (head.task.getTaskId() == taskId) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next!= null) {
            if (temp.next.task.getTaskId() == taskId) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }
}