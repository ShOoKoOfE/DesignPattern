package com.shokoofe.adeli.designpattern.Structural.Adapter;

import android.util.Log;

import java.util.List;

public class EmployeeDetail {
    public static void ListEmployee(List<String> employeeList){
        for (String emloyee:employeeList ) {
            Log.i("LOG","Employee Name: " + emloyee);
        }
    }
}
