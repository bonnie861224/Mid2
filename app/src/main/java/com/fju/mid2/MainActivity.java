package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 =(Button) findViewById((R.id.button));
        b1.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent a =new Intent();
                a.setClass(MainActivity.this,Func1Activity.class);
                startActivity(a);
            }
        });
        Button b2 =(Button) findViewById((R.id.button2));
        b2.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent b =new Intent();
                b.setClass(MainActivity.this,Func2Activity.class);
                startActivity(b);
            }
        });
        Button b3 =(Button) findViewById((R.id.button3));
        b3.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent c =new Intent();
                c.setClass(MainActivity.this,Func3Activity.class);
                startActivity(c);
            }
        });
        Button b4 =(Button) findViewById((R.id.button4));
        b4.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent d =new Intent();
                d.setClass(MainActivity.this,Func4Activity.class);
                startActivity(d);
            }
        });
        Button b5 =(Button) findViewById((R.id.button5));
        b5.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent e =new Intent();
                e.setClass(MainActivity.this,Func5Activity.class);
                startActivity(e);
            }
        });
        Button b6 =(Button) findViewById((R.id.button6));
        b6.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent f =new Intent();
                f.setClass(MainActivity.this,Func6Activity.class);
                startActivity(f);
            }
        });
        Button b7 =(Button) findViewById((R.id.button7));
        b7.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent g =new Intent();
                g.setClass(MainActivity.this,Func7Activity.class);
                startActivity(g);
            }
        });
        Button b8 =(Button) findViewById((R.id.button8));
        b8.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent h =new Intent();
                h.setClass(MainActivity.this,Func8Activity.class);
                startActivity(h);
            }
        });
}
}