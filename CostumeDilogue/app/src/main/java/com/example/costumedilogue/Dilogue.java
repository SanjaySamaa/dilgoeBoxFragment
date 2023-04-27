package com.example.costumedilogue;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class Dilogue extends Dialog {
    private EditText t1;
    private EditText t2;
    private Button btn;
    public Dilogue(@NonNull Context context) {
        super(context);
        setContentView(R.layout.diloguebox);
        t1 = findViewById(R.id.number1);
        t2 = findViewById(R.id.number2);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });



    }
}
