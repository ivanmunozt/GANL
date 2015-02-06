package com.example.ivan.ganl;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by ivanmunozt on 5/02/15.
 */
public class primitvaC extends Activity {

    private EditText num1;
    private EditText num2;
    private EditText num3;
    private EditText num4;
    private EditText num5;
    private EditText num6;
    private int n;
    private Button actualizar;


    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.primitival);

        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
        num3=(EditText)findViewById(R.id.num3);
        num4=(EditText)findViewById(R.id.num4);
        num5=(EditText)findViewById(R.id.num5);
        num6=(EditText)findViewById(R.id.num6);

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
        n=6;
        ArrayList<String> num = new ArrayList<>();
        Random al= new Random();
        do {
            String aux=""+al.nextInt(50);
            if(!num.contains(aux)){
                num.add(aux);
            }
        }while(num.size()<6);

        Collections.sort(num);

        num1.setText(num.get(0));
        num2.setText(num.get(1));
        num3.setText(num.get(2));
        num4.setText(num.get(3));
        num5.setText(num.get(4));
        num6.setText(num.get(5));

    }
}
