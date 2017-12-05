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
    int ram= new Random().nextInt(6) + 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func1);
        broll = (Button) findViewById(R.id.b_roll);
        broll.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.b_roll) {
                    new AlertDialog.Builder(Func1Activity.this)
                            .setMessage("亂數為" + ram)
                            .setPositiveButton("OK", null)
                            .show();
                }
            }
    });
    }
}