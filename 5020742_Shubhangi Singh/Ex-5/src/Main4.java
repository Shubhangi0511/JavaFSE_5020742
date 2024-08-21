public class Main4 {
    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();

        Task task1 = new Task(1, "Task 1", "In Progress");
        Task task2 = new Task(2, "Task 2", "Completed");
        Task task3 = new Task(3, "Task 3", "Pending");

        tms.addTask(task1);
        tms.addTask(task2);
        tms.addTask(task3);

        System.out.println("Task Details:");
        tms.traverseTasks();

        System.out.println("Searching for task with ID 2:");
        Task foundTask = tms.searchTask(2);
        if (foundTask != null) {
            System.out.println("Task ID: " + foundTask.getTaskId());
            System.out.println("Task Name: " + foundTask.getTaskName());
            System.out.println("Status: " + foundTask.getStatus());
        }
    }
}