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
package factory;

import employee.Employee;
import employee.FullTimeEmployee;
import employee.PartTimeEmployee;

/**
 * Creates Employee objects.
 */
public class EmployeeFactory {
    
    /**
     * Creates an Employee based on the given type.
     *
     * @param type Employee type (FullTime or PartTime).
     * @param id Employee ID.
     * @param name Employee name.
     * @param department Employee department.
     * @param role Employee role.
     * @param workingHoursPerWeek Weekly working hours.
     * @param salary Employee salary.
     * @return New Employee instance.
     * @throws IllegalArgumentException if the type is invalid.
     */
    public static Employee createEmployee(String type, String id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        if (type.equalsIgnoreCase("FullTime")) {
            return new FullTimeEmployee(id, name, department, role, workingHoursPerWeek, salary);
        } else if (type.equalsIgnoreCase("PartTime")) {
            return new PartTimeEmployee(id, name, department, role, workingHoursPerWeek, salary);
        } else {
            throw new IllegalArgumentException("Invalid employee type: " + type);
        }
    }
}
