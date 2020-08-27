package com.shokoofe.adeli.designpattern.Behavioral.Observer;

public class OctObserver extends Observer {
    Subject subject;
    public OctObserver(Subject subject) {
        this.subject = subject;
        this.subject.add( this );
    }
    public void update() {
        System.out.print(" " + Integer.toOctalString(subject.getState()));
    }
}
