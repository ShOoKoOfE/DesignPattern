package com.shokoofe.adeli.designpattern.Structural.Composite;

public class CompositePatternDemo {
    //Create JuniorEmployee object
    JuniorEmployee jEmp1 = new JuniorEmployee("Ramesh", 2);
    JuniorEmployee jEmp2 = new JuniorEmployee("Suresh", 3);
    JuniorEmployee jEmp3 = new JuniorEmployee("Manoj", 2.5f);

    //Create Manager object
    Manager manager1 = new Manager("Prakash", 8);
    Manager manager2 = new Manager("Pankaj", 8.5f);

    public void AddSubordinate() {
        manager1.AddSubordinate(jEmp1);
        manager1.AddSubordinate(jEmp2);
        manager2.AddSubordinate(jEmp3);
        manager1.ShowYearsOfExperiance();
        manager2.ShowYearsOfExperiance();
    }

    public void RemoveSubordinate(){
        manager1.RemoveSubordinate(jEmp2);
        manager2.RemoveSubordinate(jEmp3);
        manager1.ShowYearsOfExperiance();
    }
}
