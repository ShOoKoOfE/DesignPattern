package com.shokoofe.adeli.designpattern.Structural.Composite;

import android.util.Log;

public class JuniorEmployee implements  Employee {
    private String employeeName;
    private float yearsOfExperiance;

    public JuniorEmployee(String employeeName, float yearsOfExperiance){

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

    @Override
    public void ShowYearsOfExperiance() {
        Log.i("LOG","Junior Employee"+employeeName+" has "+yearsOfExperiance+" number of years of experiance");
    }
}
