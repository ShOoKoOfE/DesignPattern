package com.shokoofe.adeli.designpattern.Structural.Adapter;

import java.util.List;

public class EmployeeAdapter implements IEmployee {
    @Override
    public void PrintEmployee(List<String> employeeList) {
        EmployeeDetail.ListEmployee(employeeList);
    }
}
