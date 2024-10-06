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
package employee;

/** 
 * Represents a part-time employee.
 */
public class PartTimeEmployee extends Employee {

    /** 
     * Constructor to initialize a PartTimeEmployee.
     */
    public PartTimeEmployee(String id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        super(id, name, department, role, workingHoursPerWeek, salary);
    }

    /** Clocks in the part-time employee. */
    @Override
    public void clockIn() {
        System.out.println(getName() + " (Part-time) clocked in.");
    }

    /** Clocks out the part-time employee. */
    @Override
    public void clockOut() {
        System.out.println(getName() + " (Part-time) clocked out.");
    }

    /** Tracks work hours for the part-time employee. */
    @Override
    public void trackWorkHours() {
        System.out.println(getName() + " is tracking part-time hours.");
    }
}
