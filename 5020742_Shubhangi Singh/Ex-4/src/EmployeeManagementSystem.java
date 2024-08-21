public class EmployeeManagementSystem {
    private Employee[] employees;
    private int size;

    public EmployeeManagementSystem(int capacity) {
        this.employees = new Employee[capacity];
        this.size = 0;
    }

    public void addEmployee(Employee employee) {
        if (size < employees.length) {
            employees[size] = employee;
            size++;
        } else {
            System.out.println("Array is full. Cannot add more employees.");
        }
    }

    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println("Employee ID: " + employees[i].getEmployeeId());
            System.out.println("Name: " + employees[i].getName());
            System.out.println("Position: " + employees[i].getPosition());
            System.out.println("Salary: " + employees[i].getSalary());
            System.out.println();
        }
    }

    public void deleteEmployee(int employeeId) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                employees[i] = employees[i + 1];
            }
            size--;
        } else {
            System.out.println("Employee not found.");
        }
    }
}