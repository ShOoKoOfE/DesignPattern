package com.shokoofe.adeli.designpattern.Creational.AbstractFactory;

public class HDFC implements Bank {
    private final String BNAME;
    public HDFC(){
        BNAME="HDFC BANK";
    }
    public String getBankName() {
        return BNAME;
    }
}