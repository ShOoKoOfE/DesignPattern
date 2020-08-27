package com.shokoofe.adeli.designpattern.Behavioral.Observer;

public class HexObserver extends Observer {
    Subject subject;
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }
    public void update() {
        System.out.print(" " + Integer.toHexString(subject.getState()));
    }
}