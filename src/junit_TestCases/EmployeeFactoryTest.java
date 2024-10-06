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
import static org.junit.jupiter.api.Assertions.*;
import employee.Employee;
import employee.FullTimeEmployee;
import employee.PartTimeEmployee;
import factory.EmployeeFactory;

/**
 * Unit tests for the EmployeeFactory class, which creates Employee instances.
 */
public class EmployeeFactoryTest {

    /**
     * Tests the creation of a FullTimeEmployee.
     * Asserts that the employee is created successfully and has the correct attributes.
     */
    @Test
    public void testCreateFullTimeEmployee() {
        Employee employee = EmployeeFactory.createEmployee("Full-Time", "1", "Pinky", "IT", "Developer", 40, 60000);

        assertNotNull(employee, "Employee should not be null");
        assertTrue(employee instanceof FullTimeEmployee, "Created employee should be a FullTimeEmployee");
        assertEquals("1", employee.getId());
        assertEquals("Pinky", employee.getName());
    }

    /**
     * Tests the creation of a PartTimeEmployee.
     * Asserts that the employee is created successfully and has the correct attributes.
     */
    @Test
    public void testCreatePartTimeEmployee() {
        Employee employee = EmployeeFactory.createEmployee("Part-Time", "2", "Maggy", "Tester", "Assistant", 20, 30000);

        assertNotNull(employee, "Employee should not be null");
        assertTrue(employee instanceof PartTimeEmployee, "Created employee should be a PartTimeEmployee");
        assertEquals("2", employee.getId());
        assertEquals("Maggy", employee.getName());
    }

    /**
     * Tests the creation of an employee with an invalid type.
     * Asserts that an IllegalArgumentException is thrown with the expected message.
     */
    @Test
    public void testCreateInvalidEmployeeType() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            EmployeeFactory.createEmployee("Invalid-Type", "3", "Invalid Employee", "None", "None", 0, 0);
        });

        assertEquals("Invalid employee type: Invalid-Type", exception.getMessage());
    }
}
