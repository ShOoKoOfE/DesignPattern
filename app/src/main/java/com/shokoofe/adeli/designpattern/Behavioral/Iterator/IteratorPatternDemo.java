package com.shokoofe.adeli.designpattern.Behavioral.Iterator;

public class IteratorPatternDemo {
    Iterator iterator = new BooksCollection().createIterator();
    void showResult(){
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
