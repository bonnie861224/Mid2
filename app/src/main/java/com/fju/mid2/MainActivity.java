package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final static int FUNC3 = 3;
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            Toast.makeText(this, "特殊功能", Toast.LENGTH_LONG).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}
        /*Button b1 = (Button) findViewById((R.id.button));
        b1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                Intent a = new Intent();
                a.setClass(MainActivity.this, Func1Activity.class);
                startActivity(a);
            }
        });*/

    public void fun1(View view) {
        Intent intent = new Intent(this, Func1Activity.class);
        startActivity(intent);
    }

    public void fun2(View view) {
        Intent intent = new Intent(this, Func2Activity.class);
        startActivity(intent);
    }

    public void fun3(View view) {
        Intent intent = new Intent(this, Func3Activity.class);
        startActivityForResult(intent, FUNC3);
    }

    public void fun4(View view) {
        Intent intent = new Intent(this, Func4Activity.class);
        startActivity(intent);
    }

    public void fun5(View view) {
        Intent intent = new Intent(this, Func5Activity.class);
        startActivity(intent);
    }

    public void fun6(View view) {
        Intent intent = new Intent(this, Func6Activity.class);
        startActivity(intent);
    }

    public void fun7(View view) {
        Intent intent = new Intent(this, Func7Activity.class);
        startActivityForResult(intent, FUNC3);
    }

    public void fun8(View view) {
        Intent intent = new Intent(this, Func8Activity.class);
        startActivityForResult(intent, FUNC3);
    }
}
