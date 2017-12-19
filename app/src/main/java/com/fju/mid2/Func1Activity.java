package com.fju.mid2;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.util.Random;

public class Func1Activity extends AppCompatActivity {
    public Button broll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func1);
        broll = (Button) findViewById(R.id.b_roll);
    }
    public void mid2(View view) {
        int n = new Random().nextInt(6) + 1;
        String num = Integer.toString(n);
        new AlertDialog.Builder(this)
                .setMessage("亂數為" + num)
                .setPositiveButton("OK", null)
                .show();
    }
}