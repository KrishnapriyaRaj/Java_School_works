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
package junit_testCases;

import org.junit.jupiter.api.Test;
import singleton.EmployeeManager;
import employee.FullTimeEmployee;
import employee.PartTimeEmployee;
import employee.Employee;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the EmployeeManager class, which manages employee instances.
 */
public class EmployeeManagerTest {

    /**
     * Tests the singleton behavior of the EmployeeManager.
     * Asserts that two instances retrieved are the same.
     */
    @Test
    public void testSingletonBehavior() {
        EmployeeManager instance1 = EmployeeManager.getInstance();
        EmployeeManager instance2 = EmployeeManager.getInstance();

        assertSame(instance1, instance2, "EmployeeManager is not a singleton");
    }

    /**
     * Tests adding an employee to the EmployeeManager.
     * Asserts that the employee is successfully added to the manager.
     */
    @Test
    public void testAddEmployee() {
        EmployeeManager manager = EmployeeManager.getInstance();
        Employee employee = new FullTimeEmployee("1", "Pinky", "IT", "Developer", 40, 60000);

        manager.addEmployee(employee);
        assertTrue(manager.getAllEmployees().contains(employee), "Employee should be added to manager");
    }

    /**
     * Tests removing an employee from the EmployeeManager.
     * Asserts that the employee is successfully removed from the manager.
     */
    @Test
    public void testRemoveEmployee() {
        EmployeeManager manager = EmployeeManager.getInstance();
        Employee employee = new PartTimeEmployee("2", "Maggy", "Tester", "Assistant", 20, 30000);

        manager.addEmployee(employee);
        manager.removeEmployee(employee);
        assertFalse(manager.getAllEmployees().contains(employee), "Employee should be removed from manager");
    }

    /**
     * Tests retrieving an employee by ID from the EmployeeManager.
     * Asserts that the employee is retrieved and the name matches.
     */
    @Test
    public void testGetEmployeeById() {
        EmployeeManager manager = EmployeeManager.getInstance();
        Employee employee = new FullTimeEmployee("3", "Alice Smith", "Finance", "Analyst", 40, 70000);

        manager.addEmployee(employee);
        Employee retrievedEmployee = manager.getEmployeeById("3");
        assertNotNull(retrievedEmployee, "Employee should be retrieved by ID");
        assertEquals("Alice Smith", retrievedEmployee.getName(), "Employee name should match");
    }
}
