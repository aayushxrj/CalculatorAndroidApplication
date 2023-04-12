package com.example.calculatorandroidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtFirstNumber,edtSecondNumber;
    Button btnAdd,btnSub,btnMul,btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtFirstNumber = findViewById(R.id.edt_first_number);
        edtSecondNumber = findViewById(R.id.edt_second_number);


        btnAdd = findViewById(R.id.btn_add);
        btnSub = findViewById(R.id.btn_sub);
        btnMul = findViewById(R.id.btn_mul);
        btnDiv = findViewById(R.id.btn_div);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtFirstNumber!=null && edtFirstNumber.getText().length()>0){
                    if(edtSecondNumber!=null && edtSecondNumber.getText().length()>0){
                        String firstnumber = edtFirstNumber.getText().toString();
                        String secondnumber = edtSecondNumber.getText().toString();
                        Double result = Double.valueOf(firstnumber)+Double.valueOf(secondnumber);
                        Toast.makeText(getApplicationContext(),"Result="+String.valueOf(result),Toast.LENGTH_SHORT).show();



                    }
                    else {
                        edtSecondNumber.setError("This Field can't be blank");
                        Toast.makeText(getApplicationContext(),"This Field Can't be blank",Toast.LENGTH_SHORT).show(); }
                }
                else {
                    edtFirstNumber.setError("This Field can't be blank");
                    Toast.makeText(getApplicationContext(),"This Field Can't be blank",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtFirstNumber!=null && edtFirstNumber.getText().length()>0){
                    if(edtSecondNumber!=null && edtSecondNumber.getText().length()>0){
                        String firstnumber = edtFirstNumber.getText().toString();
                        String secondnumber = edtSecondNumber.getText().toString();
                        Double result = Double.valueOf(firstnumber)-Double.valueOf(secondnumber);
                        Toast.makeText(getApplicationContext(),"Result="+String.valueOf(result),Toast.LENGTH_SHORT).show();



                    }
                    else {
                        edtSecondNumber.setError("This Field can't be blank");
                        Toast.makeText(getApplicationContext(),"This Field Can't be blank",Toast.LENGTH_SHORT).show(); }
                }
                else {
                    edtFirstNumber.setError("This Field can't be blank");
                    Toast.makeText(getApplicationContext(),"This Field Can't be blank",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtFirstNumber!=null && edtFirstNumber.getText().length()>0){
                    if(edtSecondNumber!=null && edtSecondNumber.getText().length()>0){
                        String firstnumber = edtFirstNumber.getText().toString();
                        String secondnumber = edtSecondNumber.getText().toString();
                        Double result = Double.valueOf(firstnumber)*Double.valueOf(secondnumber);
                        Toast.makeText(getApplicationContext(),"Result="+String.valueOf(result),Toast.LENGTH_SHORT).show();



                    }
                    else {
                        edtSecondNumber.setError("This Field can't be blank");
                        Toast.makeText(getApplicationContext(),"This Field Can't be blank",Toast.LENGTH_SHORT).show(); }
                }
                else {
                    edtFirstNumber.setError("This Field can't be blank");
                    Toast.makeText(getApplicationContext(),"This Field Can't be blank",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtFirstNumber!=null && edtFirstNumber.getText().length()>0){
                    if(edtSecondNumber!=null && edtSecondNumber.getText().length()>0){
                        String firstnumber = edtFirstNumber.getText().toString();
                        String secondnumber = edtSecondNumber.getText().toString();
                        Double result = Double.valueOf(firstnumber)/Double.valueOf(secondnumber);
                        Toast.makeText(getApplicationContext(),"Result="+String.valueOf(result),Toast.LENGTH_SHORT).show();



                    }
                    else {
                        edtSecondNumber.setError("This Field can't be blank");
                        Toast.makeText(getApplicationContext(),"This Field Can't be blank",Toast.LENGTH_SHORT).show(); }
                }
                else {
                    edtFirstNumber.setError("This Field can't be blank");
                    Toast.makeText(getApplicationContext(),"This Field Can't be blank",Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}