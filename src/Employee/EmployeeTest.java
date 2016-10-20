package Employee;

import Employee.Employee;

/**
 * Created by jasonganub on 10/20/16.
 */
public class EmployeeTest {

    public static void main(String args[]) {
        // Create two objects with the constructor
        Employee empOne = new Employee("Jason Ganub");
        Employee empTwo = new Employee("Vania Alfitri");

        // Invoke methods for each object created
        empOne.empAge(25);
        empOne.empDesignation("Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(24);
        empTwo.empDesignation("QA Analyst");
        empTwo.empSalary(1000);
        empTwo.printEmployee();
    }
}