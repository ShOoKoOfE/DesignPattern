package com.shokoofe.adeli.designpattern.Behavioral.Memento;

import android.util.Log;

import com.shokoofe.adeli.designpattern.Behavioral.Memento.Memento;

public class Originator {
  private String state;
  public void setState(String state) {
    Log.i("LOG","Originator: Setting state to " + state);
    this.state = state;
  }
  public Memento save() {
    Log.i("LOG","Originator: Saving to Memento.");
    return new Memento(state);
  }
  public void restore(Memento m) {
    state = m.getState();
    Log.i("LOG","Originator: State after restoring from Memento: " + state);
  }
}
