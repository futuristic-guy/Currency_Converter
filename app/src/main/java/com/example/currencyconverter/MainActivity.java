package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Button dollar,euro,pound,yen,dinar,bitcoin,rubel,ausDollar,canDollar;
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dollar = findViewById(R.id.dollar);
        euro = findViewById(R.id.euro);
        pound = findViewById(R.id.pound);
        yen = findViewById(R.id.yen);
        dinar = findViewById(R.id.dinar);
        bitcoin = findViewById(R.id.btc);
        rubel = findViewById(R.id.rubel);
        ausDollar = findViewById(R.id.ausDollar);
        canDollar = findViewById(R.id.canDollar);

        textView = findViewById(R.id.text);
        editText = findViewById(R.id.editText1);


        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                textView.setText(null);
                if(TextUtils.isEmpty(z)){
                    editText.setError("Please Enter Number");
                }else {
                    float output = (float)(Float.parseFloat(z) * 0.014);
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+ decimalFormat.format(output));
                }
            }
        });


        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                textView.setText(null);
                if(TextUtils.isEmpty(z)){
                    editText.setError("Please Enter Number");
                }else {
                    float output = (float)(Float.parseFloat(z) * 0.011);
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+ decimalFormat.format(output));
                }
            }
        });


        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                textView.setText(null);
                if(TextUtils.isEmpty(z)){
                    editText.setError("Please Enter Number");
                }else {
                    float output = (float)(Float.parseFloat(z) * 0.0098);
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+ decimalFormat.format(output));
                }
            }
        });


        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                textView.setText(null);
                if(TextUtils.isEmpty(z)){
                    editText.setError("Please Enter Number");
                }else {
                    float output = (float)(Float.parseFloat(z) * 1.47);
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+ decimalFormat.format(output));
                }
            }
        });


        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                textView.setText(null);
                if(TextUtils.isEmpty(z)){
                    editText.setError("Please Enter Number");
                }else {
                    float output = (float)(Float.parseFloat(z) * 0.0042);
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+ decimalFormat.format(output));
                }
            }
        });


        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                textView.setText(null);
                if(TextUtils.isEmpty(z)){
                    editText.setError("Please Enter Number");
                }else {
                    float output = (float)(Float.parseFloat(z) * 0.000026);
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+ decimalFormat.format(output));
                }
            }
        });


        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                textView.setText(null);
                if(TextUtils.isEmpty(z)){
                    editText.setError("Please Enter Number");
                }else {
                    float output = (float)(Float.parseFloat(z) * 1.01);
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+ decimalFormat.format(output));
                }
            }
        });

        ausDollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                textView.setText(null);
                if(TextUtils.isEmpty(z)){
                    editText.setError("Please Enter Number");
                }else {
                    float output = (float)(Float.parseFloat(z) * 0.018);
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+ decimalFormat.format(output));
                }
            }
        });


        canDollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                textView.setText(null);
                if(TextUtils.isEmpty(z)){
                    editText.setError("Please Enter Number");
                }else {
                    float output = (float)(Float.parseFloat(z) * 0.017);
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+ decimalFormat.format(output));
                }
            }
        });


    }
}