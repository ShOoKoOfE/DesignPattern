package com.shokoofe.adeli.designpattern.Behavioral.Iterator;

public class BooksCollection implements Container{

    public Iterator createIterator(){
        BookIterator result = new BookIterator();
        return result;
    }
}