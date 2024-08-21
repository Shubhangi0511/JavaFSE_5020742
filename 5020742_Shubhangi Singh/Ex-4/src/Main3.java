public class Main3 {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);

        Employee employee1 = new Employee(1, "John Doe", "Software Engineer", 50000.0);
        Employee employee2 = new Employee(2, "Jane Doe", "Data Scientist", 60000.0);
        Employee employee3 = new Employee(3, "Bob Smith", "Product Manager", 70000.0);

        ems.addEmployee(employee1);
        ems.addEmployee(employee2);
        ems.addEmployee(employee3);

        System.out.println("Employee Records:");
        ems.traverseEmployees();

        System.out.println("Searching for employee with ID 2:");
        Employee foundEmployee = ems.searchEmployee(2);
        if (foundEmployee != null) {
            System.out.println("Employee ID: " + foundEmployee.getEmployeeId());
            System.out.println("Name: " + foundEmployee.getName());
            System.out.println("Position: " + foundEmployee.getPosition());
            System.out.println("Salary: " + foundEmployee.getSalary());
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("Deleting employee with ID 2:");
        ems.deleteEmployee(2);

        System.out.println("Employee Records after deletion:");
        ems.traverseEmployees();
    }
}