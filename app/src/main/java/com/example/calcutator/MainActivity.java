package com.example.calcutator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0;
    ImageView btn_dot,btn_eq,btn_proc,btn_clear,btn_minus,btn_plus,btn_x,btn_dev,btn_pm;

    TextView inputTxt,inputOutPut;
    String data;
    int num1,num2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputTxt=findViewById(R.id.inputTxt);
        inputOutPut=findViewById(R.id.inputOutPut);

        btn_0=findViewById(R.id.btn_0);
        btn_1=findViewById(R.id.btn_1);
        btn_2=findViewById(R.id.btn_2);
        btn_3=findViewById(R.id.btn_3);
        btn_4=findViewById(R.id.btn_4);
        btn_5=findViewById(R.id.btn_5);
        btn_6=findViewById(R.id.btn_6);
        btn_7=findViewById(R.id.btn_7);
        btn_8=findViewById(R.id.btn_8);
        btn_9=findViewById(R.id.btn_9);

        btn_dot=findViewById(R.id.btn_dot);
        btn_eq=findViewById(R.id.btn_eq);
        btn_proc=findViewById(R.id.btn_proc);
        btn_clear=findViewById(R.id.btn_clear);
        btn_minus=findViewById(R.id.btn_minus);
        btn_plus=findViewById(R.id.btn_plus);
        btn_x=findViewById(R.id.btn_x);
        btn_dev=findViewById(R.id.btn_dev);
        btn_pm=findViewById(R.id.btn_pm);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data+"0");
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data+"1");
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data+"2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data+"3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data+"4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data+"5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data+"6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data+"7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data+"8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data+"9");
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data+".");
            }
        });
        btn_proc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data+"%");
            }
        });
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputTxt.setText("");
                inputOutPut.setText("");
            }
        });
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data+"+");
            }
        });
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data+"-");
            }
        });
        btn_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data+"x");
            }
        });
        btn_dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputTxt.getText().toString();
                inputTxt.setText(data+"÷");
            }
        });
        btn_eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputTxt.getText().toString();

                data=data.replaceAll("x","*");
                data=data.replaceAll("%","/100");
                data=data.replaceAll("÷","/");

                Toast.makeText(MainActivity.this, ""+data, Toast.LENGTH_SHORT);
                Log.e("@@@@@","onClick: "+data);
                inputOutPut.setText(data);

            }
        });
    }
}