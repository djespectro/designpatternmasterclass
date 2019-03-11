package com.mac.designpatternsmasterclass.mvc.model;

public class EmployeeModel {

    private String firstName;
    private String lastName;
    private int employeeNumber;

    public EmployeeModel(String firstName, String lastName, int employeeNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", employeeNumber=" + employeeNumber + '}';
    }
}
