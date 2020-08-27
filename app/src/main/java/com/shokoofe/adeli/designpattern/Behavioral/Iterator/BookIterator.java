package com.shokoofe.adeli.designpattern.Behavioral.Iterator;

public class BookIterator implements Iterator{
    private int m_position;
    private String m_titles[] = {"test0","test1","test2","test3","test4"};
    public boolean hasNext(){
        if (m_position < m_titles.length)
            return true;
        else
            return false;
    }
    public Object next(){
        if (this.hasNext())
            return m_titles[m_position++];
        else
            return null;
    }
}