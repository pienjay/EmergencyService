package com.example.pienjay.basic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void health(View v){
        Intent i= new Intent(this,health.class);
        startActivity(i);
    }
    public void housing(View v){
        Intent i= new Intent(this,housing.class);
        startActivity(i);
    }
}
