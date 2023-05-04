package com.example.testgit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void testK() {
        Log.d("gggTAG", "testK: ");
    }
    public void testA() {
        Log.d("gggTAG", "testK: ");
    }

}