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
import employee.FullTimeEmployee;
import employee.PartTimeEmployee;
import builder.EmployeeBuilder;
import builder.EmployeeDirector;
import builder.FullTimeEmployeeBuilder;
import builder.PartTimeEmployeeBuilder;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the EmployeeDirector class, which constructs Employee objects.
 */
public class EmployeeDirectorTest {

    /**
     * Tests the construction of a FullTimeEmployee.
     * Asserts that the employee is created with the expected attributes.
     */
    @Test
    public void testConstructFullTimeEmployee() {
        EmployeeBuilder builder = new FullTimeEmployeeBuilder();
        EmployeeDirector director = new EmployeeDirector(builder);
        FullTimeEmployee employee = (FullTimeEmployee) director.constructEmployee("1", "Pinky", "IT", "Developer", 40, 60000);

        assertNotNull(employee, "FullTimeEmployee should not be null");
        assertEquals("1", employee.getId());
        assertEquals("Pinky", employee.getName());
        assertEquals("IT", employee.getDepartment());
        assertEquals("Developer", employee.getRole());
        assertEquals(40, employee.getWorkingHoursPerWeek());
        assertEquals(60000, employee.getSalary());
    }

    /**
     * Tests the construction of a PartTimeEmployee.
     * Asserts that the employee is created with the expected attributes.
     */
    @Test
    public void testConstructPartTimeEmployee() {
        EmployeeBuilder builder = new PartTimeEmployeeBuilder();
        EmployeeDirector director = new EmployeeDirector(builder);
        PartTimeEmployee employee = (PartTimeEmployee) director.constructEmployee("2", "Maggy", "Tester", "Assistant", 20, 30000);

        assertNotNull(employee, "PartTimeEmployee should not be null");
        assertEquals("2", employee.getId());
        assertEquals("Maggy", employee.getName());
        assertEquals("Tester", employee.getDepartment());
        assertEquals("Assistant", employee.getRole());
        assertEquals(20, employee.getWorkingHoursPerWeek());
        assertEquals(30000, employee.getSalary());
    }
}
