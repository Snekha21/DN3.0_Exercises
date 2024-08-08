package Exercise4;

public class DecoratorPatternExample {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);

        Employee e1 = new Employee(1, "Alice", "Manager", 90000);
        Employee e2 = new Employee(2, "Bob", "Developer", 80000);
        Employee e3 = new Employee(3, "Charlie", "Designer", 70000);

        ems.addEmployee(e1);
        ems.addEmployee(e2);
        ems.addEmployee(e3);

        System.out.println("All Employees:");
        ems.traverseEmployees();

        System.out.println("\nSearching for Employee with ID 2:");
        Employee emp = ems.searchEmployee(2);
        if (emp != null) {
            System.out.println(emp);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting Employee with ID 2:");
        ems.deleteEmployee(2);

        System.out.println("\nAll Employees after deletion:");
        ems.traverseEmployees();
    }
}