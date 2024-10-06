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
package builder;

import employee.Employee;

/** Directs the construction of Employee objects using an EmployeeBuilder */
public class EmployeeDirector {
    private EmployeeBuilder builder;

    public EmployeeDirector(EmployeeBuilder builder) {
        this.builder = builder;
    }

    /** Constructs an Employee using the provided parameters */
    public Employee constructEmployee(String id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        return builder.setId(id)
                      .setName(name)
                      .setDepartment(department)
                      .setRole(role)
                      .setWorkingHoursPerWeek(workingHoursPerWeek)
                      .setSalary(salary)
                      .build();
    }
}
