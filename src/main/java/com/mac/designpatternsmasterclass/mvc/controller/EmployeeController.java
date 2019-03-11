package com.mac.designpatternsmasterclass.mvc.controller;

import com.mac.designpatternsmasterclass.mvc.model.EmployeeModel;
import com.mac.designpatternsmasterclass.mvc.view.EmployeeView;

public class EmployeeController {

    private final EmployeeModel model;
    private final EmployeeView view;

    public EmployeeController(EmployeeModel model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String firstName, String lastName){
        model.setFirstName(firstName);
        model.setLastName(lastName);
    }

    public String getEmployeeName(){
        return model.getFirstName() + " " + model.getLastName();
    }

    public void setEmployeeNumber(int employeeNumber){
        model.setEmployeeNumber(employeeNumber);
    }

    public int getEmployeeNumber(){
        return model.getEmployeeNumber();
    }

    public void updateView(){
        view.printEmployeeInfo(
                model.getFirstName(),
                model.getLastName(),
                model.getEmployeeNumber());
    }

}
