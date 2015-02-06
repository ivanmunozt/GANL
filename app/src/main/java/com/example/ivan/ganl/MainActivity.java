package com.example.ivan.ganl;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by ivanmunozt on 5/02/15.
 */

public class MainActivity extends Activity {

    private Button bPrimitiva;
    private Button bEuromillones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bPrimitiva=(Button) findViewById(R.id.bprimitiva);
        bPrimitiva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarPrimitivaC();
            }
        });

        bEuromillones=(Button) findViewById(R.id.beuromillones);
        bEuromillones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarEuromillonesC();
            }
        });
    }


    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/

    public void lanzarPrimitivaC(){
        Intent i= new Intent(this, primitvaC.class);
        startActivity(i);
    }

    public void lanzarEuromillonesC(){
        Intent i= new Intent(this, euromillonesC.class);
        startActivity(i);
    }
}
