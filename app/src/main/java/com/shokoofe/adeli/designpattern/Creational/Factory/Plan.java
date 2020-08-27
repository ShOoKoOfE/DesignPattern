package com.shokoofe.adeli.designpattern.Creational.Factory;
/*
Usage of Factory Design Pattern
    When a class doesn't know what sub-classes will be required to create
    When a class wants that its sub-classes specify the objects to be created
    When the parent classes choose the creation of objects to its sub-classes
 */

abstract class Plan{
    protected double rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}