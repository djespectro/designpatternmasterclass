package com.mac.designpatternsmasterclass.mvc;

import com.mac.designpatternsmasterclass.mvc.controller.EmployeeController;
import com.mac.designpatternsmasterclass.mvc.model.EmployeeModel;
import com.mac.designpatternsmasterclass.mvc.view.EmployeeView;

public class Main {

    public static void main(String[] args) {

        EmployeeModel model = new EmployeeModel("John", "Bush", 123);

        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();

        System.out.println();

        controller.setEmployeeName("Barack", "Obama");
        controller.updateView();

    }

}
