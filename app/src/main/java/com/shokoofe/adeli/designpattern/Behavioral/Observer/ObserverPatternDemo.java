package com.shokoofe.adeli.designpattern.Behavioral.Observer;

import java.util.Scanner;

public class ObserverPatternDemo {
    Subject sub = new Subject();
    void Demo(){
        new HexObserver(sub);
        new OctObserver(sub);
        new BinObserver(sub);
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("\nEnter a number: ");
            sub.setState(scan.nextInt());
        }
    }
}
