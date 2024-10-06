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
import employee.FullTimeEmployee;

/** Builder class for constructing FullTimeEmployee objects */
public class FullTimeEmployeeBuilder implements EmployeeBuilder {
    private String id, name, department, role;
    private int workingHoursPerWeek;
    private double salary;

    @Override
    public EmployeeBuilder setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public EmployeeBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    @Override
    public EmployeeBuilder setRole(String role) {
        this.role = role;
        return this;
    }

    @Override
    public EmployeeBuilder setWorkingHoursPerWeek(int hours) {
        this.workingHoursPerWeek = hours;
        return this;
    }

    @Override
    public EmployeeBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    /** Constructs and returns a FullTimeEmployee */
    @Override
    public Employee build() {
        return new FullTimeEmployee(id, name, department, role, workingHoursPerWeek, salary);
    }
}
