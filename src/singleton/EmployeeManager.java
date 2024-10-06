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
package singleton;

import java.util.ArrayList;
import java.util.List;
import employee.Employee;

/**
 * Singleton class to manage employee instances.
 */
public class EmployeeManager {
    private static EmployeeManager instance;
    private List<Employee> employees;

    private EmployeeManager() {
        employees = new ArrayList<>();
    }

    /**
     * Gets the singleton instance of EmployeeManager.
     *
     * @return EmployeeManager instance.
     */
    public static synchronized EmployeeManager getInstance() {
        if (instance == null) {
            instance = new EmployeeManager();
        }
        return instance;
    }

    /**
     * Adds an employee.
     *
     * @param employee Employee to add.
     */
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    /**
     * Removes an employee.
     *
     * @param employee Employee to remove.
     */
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    /**
     * Gets an employee by ID.
     *
     * @param id Employee ID.
     * @return Employee or null if not found.
     */
    public Employee getEmployeeById(String id) {
        return employees.stream()
                        .filter(emp -> emp.getId().equals(id))
                        .findFirst()
                        .orElse(null);
    }

    /**
     * Gets all employees.
     *
     * @return List of employees.
     */
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees);
    }
}
