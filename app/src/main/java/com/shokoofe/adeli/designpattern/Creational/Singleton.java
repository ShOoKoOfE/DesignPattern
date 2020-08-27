package com.shokoofe.adeli.designpattern.Creational;

public class Singleton {
  private static Singleton _me = null;
  private Singleton() {  }
  public static Singleton getInstance() {
    if( _me == null ){
      _me = new Singleton();
    }
    return _me;
  }
}
//Singleton single = Singleton.getInstance();