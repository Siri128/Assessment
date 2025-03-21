import java.util.ArrayList;
import java.util.List;


class Employee {
    
    int id;
    String name;
    double salary;

       public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
        System.out.println("-----------------------------");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "John Doe", 55000.50);
        Employee emp2 = new Employee(102, "Jane Smith", 65000.75);
        Employee emp3 = new Employee(103, "Alice Johnson", 75000.80);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

       
        System.out.println("Employee Details:");
        for (Employee emp : employeeList) {
            emp.displayDetails();
        }
    }
}