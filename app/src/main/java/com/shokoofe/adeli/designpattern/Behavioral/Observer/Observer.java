package com.shokoofe.adeli.designpattern.Behavioral.Observer;

import javax.security.auth.Subject;

abstract class Observer {
    protected Subject subject;
    public abstract void update();
}