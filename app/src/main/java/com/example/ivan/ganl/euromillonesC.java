package com.example.ivan.ganl;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by ivan on 6/02/15.
 */
public class euromillonesC extends Activity {
    private EditText num1;
    private EditText num2;
    private EditText num3;
    private EditText num4;
    private EditText num5;
    private EditText est1;
    private EditText est2;
    private int n;
    private Button actualizar;

    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.euromillonesl);

        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
        num3=(EditText)findViewById(R.id.num3);
        num4=(EditText)findViewById(R.id.num4);
        num5=(EditText)findViewById(R.id.num5);
        est1=(EditText)findViewById(R.id.est1);
        est2=(EditText)findViewById(R.id.est2);

        calcularNumeros();

        actualizar=(Button) findViewById(R.id.actualizarPri);
        actualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularNumeros();
            }
        });

    }

    public void calcularNumeros(){
        n=5;
        ArrayList<String> num = new ArrayList<>();
        Random al= new Random();
        do {
            String aux=""+al.nextInt(49);
            if(!num.contains(aux)){
                num.add(aux);
            }
        }while(num.size()<n);

        Collections.sort(num);
        num1.setText(num.get(0));
        num2.setText(num.get(1));
        num3.setText(num.get(2));
        num4.setText(num.get(3));
        num5.setText(num.get(4));

        n=2;
        ArrayList<String> num2 = new ArrayList<>();
        al= new Random();
        do {
            String aux=""+al.nextInt(11);
            if(!num2.contains(aux)){
                num2.add(aux);
            }
        }while(num2.size()<n);

        Collections.sort(num);
        est1.setText(num2.get(0));
        est2.setText(num2.get(1));

    }
}
