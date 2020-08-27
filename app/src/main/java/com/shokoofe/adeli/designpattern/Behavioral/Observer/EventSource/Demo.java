package com.shokoofe.adeli.designpattern.Behavioral.Observer.EventSource;

public class Demo {
    EventSource eventSource = new EventSource();
    void Demo(){
        eventSource.addObserver((obj, arg) -> {
            System.out.println("Received response: " + arg);
        });
        new Thread(eventSource).start();
        eventSource.addObserver((obj, arg) -> {
            System.out.println("Received response 1: " + arg);
        });
        eventSource.addObserver((obj, arg) -> {
            System.out.println("Received response 2: " + arg);
        });
        eventSource.addObserver((obj, arg) -> {
            System.out.println("Received response 3: " + arg);
        });
    }
}
