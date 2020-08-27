package com.shokoofe.adeli.designpattern.Creational.AbstractFactory;

abstract class AbstractFactory{
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}