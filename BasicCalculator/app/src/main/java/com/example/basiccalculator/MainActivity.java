package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Results r;
    EditText t1,t2;
    Button b1,b2,b3,b4;
    int a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r = new Results();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentResults,r).commit();
        t1 = findViewById(R.id.num1);
        t2 = findViewById(R.id.num2);
        b1=findViewById(R.id.add);
        b2=findViewById(R.id.sub);
        b3=findViewById(R.id.mul);
        b4=findViewById(R.id.div);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setData();
                r.showData(String.valueOf(a+b));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setData();
                r.showData(String.valueOf(a-b));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setData();
                r.showData(String.valueOf(a*b));
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View View){
            setData();
            r.showData(String.valueOf(a/b));
            }
        });
    }
    public void setData(){
        a= Integer.parseInt(String.valueOf(t1.getText()));
        b= Integer.parseInt(String.valueOf(t2.getText()));
    }
}