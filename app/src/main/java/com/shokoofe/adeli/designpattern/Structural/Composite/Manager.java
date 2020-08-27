package com.shokoofe.adeli.designpattern.Structural.Composite;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

    private String employeeName;
    private float yearsOfExperiance;

    public Manager(String employeeName, float yearsOfExperiance){

        this.employeeName = employeeName;

        this.yearsOfExperiance = yearsOfExperiance;

    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public float getYearsOfExperiance() {
        return yearsOfExperiance;
    }

    public void setYearsOfExperiance(float yearsOfExperiance) {
        this.yearsOfExperiance = yearsOfExperiance;
    }

    private List<Employee> subordinates = new ArrayList<>();

    @Override
    public void ShowYearsOfExperiance() {
        Log.i("LOG","Manager"+employeeName+" has "+yearsOfExperiance+" number of years of experiance");
        for(Employee employee : subordinates){
            employee.ShowYearsOfExperiance();
        }
    }

    public void AddSubordinate(Employee employee){
        subordinates.add(employee);
    }

    public void RemoveSubordinate(Employee employee) {
        subordinates.remove(employee);
    }
}
