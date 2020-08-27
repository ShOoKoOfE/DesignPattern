package com.shokoofe.adeli.designpattern.Behavioral.Memento;

import com.shokoofe.adeli.designpattern.Behavioral.Memento.Memento;

import java.util.ArrayList;

public class Caretaker {
  private ArrayList<Memento> mementos = new ArrayList<>();
  public void addMemento(Memento m) {
    mementos.add(m);
  }
  public Memento getMemento() {
    return mementos.get(1);
  }
}
