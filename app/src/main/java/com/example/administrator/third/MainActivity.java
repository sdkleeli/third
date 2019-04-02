package com.example.administrator.third;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView out;
    TextView team;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        team =  (TextView) findViewById(R.id.txt);
        out = (TextView) findViewById(R.id.txtout);

        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        Button btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.i(" main", " onClick msg. ....");
        String sum = out.getText().toString();
        int c = Integer.parseInt(sum);
        int su = 0;
        switch (v.getId()) {
            case R.id.btn1:
                su = c + 1;
                out.setText(su + "");
                break;
            case R.id.btn2:
                su = c + 2;
                out.setText(su + "");
                break;
            case R.id.btn3:
                su = c + 3;
                out.setText(su + "");
                break;
            case R.id.btn4:
                out.setText(su + "");
                break;
        }
    }
}