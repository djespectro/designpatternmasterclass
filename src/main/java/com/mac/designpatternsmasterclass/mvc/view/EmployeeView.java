package com.mac.designpatternsmasterclass.mvc.view;

public class EmployeeView {

    public void printEmployeeInfo(String firstName, String lastName, int employeeNumber){
        System.out.println(" - Employee # " + employeeNumber);
        System.out.println(" - Name: " + firstName + " " + lastName);
    }

}
