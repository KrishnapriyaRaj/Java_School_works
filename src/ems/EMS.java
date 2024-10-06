/**
 * @author: Krishnapriya Raj
 * Student Number: 041127498
 * Course: CST8288-section 030
 * Date: 03-10-2024
 * Professor: Sazzad Hossain
 * Term: Fall 2024
 * File name: Lab01
 * Description:To understand and implement the Singleton, Builder, and Factory design patterns in an Employee Management System. * 
 */
package ems;

import java.util.Scanner;
import employee.Employee;
import factory.EmployeeFactory;
import singleton.EmployeeManager;

/**
 * EMS (Employee Management System) application.
 * Manages employee creation and displays employee information.
 */
public class EMS {

    /**
     * Main method to run the Employee Management System.
     * Prompts the user for employee type, creates an employee,
     * and displays all employees in the system.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
    	// Get instance of EmployeeManager
        EmployeeManager manager = EmployeeManager.getInstance(); 
        Scanner scanner = new Scanner(System.in);
          // Prompt for employee type
        System.out.println("Enter employee type (Full-Time / Part-Time): "); 
        String type = scanner.nextLine(); 

        // Create and add employee
        try {
            Employee employee = EmployeeFactory.createEmployee(type, "001", "August", "HR", "Manager", 40, 60000);
            manager.addEmployee(employee);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); 
        }

        // Display employees
        if (manager.getAllEmployees().isEmpty()) {
            System.out.println("No employees available.");
        } else {
            System.out.println("Employees in the system:");
            for (Employee emp : manager.getAllEmployees()) {
                System.out.println(emp.toString());
            }
        }

        scanner.close(); 
    }
}
