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

/** Represents a full-time employee, extending the Employee class */
public class FullTimeEmployee extends Employee {
    /** Constructor for initializing full-time employee details */
    public FullTimeEmployee(String id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        super(id, name, department, role, workingHoursPerWeek, salary);
    }

    /** Clock in action for full-time employee */
    @Override
    public void clockIn() {
        System.out.println(getName() + " (Full-time) clocked in.");
    }

    /** Clock out action for full-time employee */
    @Override
    public void clockOut() {
        System.out.println(getName() + " (Full-time) clocked out.");
    }

    /** Method to track work hours for full-time employee */
    @Override
    public void trackWorkHours() {
        System.out.println(getName() + " is tracking full-time hours.");
    }
}
