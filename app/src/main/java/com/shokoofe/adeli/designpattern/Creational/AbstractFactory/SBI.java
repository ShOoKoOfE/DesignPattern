package com.shokoofe.adeli.designpattern.Creational.AbstractFactory;

public class SBI implements Bank{
    private final String BNAME;
    public SBI(){
        BNAME="SBI BANK";
    }
    public String getBankName(){
        return BNAME;
    }
}