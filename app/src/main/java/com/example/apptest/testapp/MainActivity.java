package com.example.apptest.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test();
    }

    void test(){
        Toast.makeText(this, "Hola",Toast.LENGTH_LONG);
        Toast.makeText(this, "UPDATE!!!!!!!!!!",Toast.LENGTH_LONG);
    }
}
