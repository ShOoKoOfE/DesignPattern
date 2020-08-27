package com.shokoofe.adeli.designpattern.Structural.Adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterPatternDemo {
    List<String> employeeList = new ArrayList<String>();
    IEmployee employee = new EmployeeAdapter();
    public void loadData(){
        employeeList.add("Pankaj");
        employeeList.add("Raj");
        employeeList.add("David");
        employeeList.add("Lisa");
        employee.PrintEmployee(employeeList);
    }
}
