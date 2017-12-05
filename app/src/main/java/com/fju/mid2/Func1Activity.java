package com.fju.mid2;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class Func1Activity extends AppCompatActivity {
    Random random = new Random();
    int ram= random.nextInt(6) + 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func1);
    }
    public void mid2(View view){
        Button roll = (Button) findViewById(R.id.roll);
        new AlertDialog.Builder(this)
                .setMessage(Integer.toString(ram))
                .setPositiveButton("OK", null)
                .show();
    }

}
