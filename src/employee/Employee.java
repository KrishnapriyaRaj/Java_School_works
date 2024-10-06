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

/** Abstract class representing an Employee with basic attributes */
public abstract class Employee {
    private String id;
    private String name;
    private String department;
    private String role;
    private int workingHoursPerWeek;
    private double salary;

    /** Constructor for initializing employee details */
    public Employee(String id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        this.setId(id);
        this.name = name;
        this.department = department;
        this.role = role;
        this.workingHoursPerWeek = workingHoursPerWeek;
        this.salary = salary;
    }

    // Getters and setters for employee attributes
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public int getWorkingHoursPerWeek() { return workingHoursPerWeek; }
    public void setWorkingHoursPerWeek(int workingHoursPerWeek) { this.workingHoursPerWeek = workingHoursPerWeek; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    // Abstract methods for employee time tracking
    public abstract void clockIn();
    public abstract void clockOut();
    public abstract void trackWorkHours();

    /** Provides a formatted string representing the employee */
    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, Department: %s, Role: %s, Hours/Week: %d, Salary: %.2f",
                id, name, department, role, workingHoursPerWeek, salary);
    }
}
