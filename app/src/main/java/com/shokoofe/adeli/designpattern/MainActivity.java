package com.shokoofe.adeli.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.shokoofe.adeli.designpattern.Behavioral.Memento.Caretaker;
import com.shokoofe.adeli.designpattern.Behavioral.Memento.Originator;
import com.shokoofe.adeli.designpattern.Creational.Singleton;

public class MainActivity extends AppCompatActivity {
  //Save and restore instance state  - save state through configuration changes
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    savedInstanceState.putString("MY_KEY","ShokoofeAdeli");
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

  }

  @Override
  protected void onRestoreInstanceState(Bundle savedInstanceState){
    super.onRestoreInstanceState(savedInstanceState);
    String MY_KEY = savedInstanceState.getString("MY_KEY");
  }
}
