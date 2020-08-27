package com.shokoofe.adeli.designpattern.Behavioral.Observer;

public class BinObserver extends Observer {
    Subject subject;
    public BinObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }
    public void update() {
        System.out.print(" " + Integer.toBinaryString(subject.getState()));
    }
}