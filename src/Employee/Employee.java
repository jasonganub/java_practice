package Employee; /**
 * Created by jasonganub on 10/20/16.
 */

import java.io.*;

public class Employee {

    String name;
    int age;
    String designation;
    double salary;

    // Constructor of the class Employee.Employee
    public Employee(String name) {
        this.name = name;
    }

    // Assign the age to the variable
    public void empAge(int empAge) {
        age = empAge;
    }

    // Assign designation to the variable
    public void empDesignation(String empDesig) {
        designation = empDesig;
    }

    // Assign salary to the variable
    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    // Print the employee details
    public void printEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}
