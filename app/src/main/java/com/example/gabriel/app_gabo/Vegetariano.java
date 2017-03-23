package com.example.gabriel.app_gabo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class Vegetariano extends AppCompatActivity {


    ListViewAdapter adapter;
    private Context context;


    String[] titulo = new String[]{

            "Vinapho",
            "Namas Te",
            "Tomate Cafe",
            "Casa del Sol"
    };

    int[] imagenes = {

            R.drawable.vinapho,
            R.drawable.namaste,
            R.drawable.tomatecafe,
            R.drawable.casadelsol,


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetariano);

        context = this;


        final ListView lista = (ListView) findViewById(R.id.ListViewVegaetariana);
        adapter = new ListViewAdapter(this, titulo, imagenes);
        lista.setAdapter(adapter);



        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                if (position == 0){
                    Intent intent=new Intent(context,Vinapho.class);
                    startActivity(intent);

                }
                if (position == 1){
                    Intent intent=new Intent(context,Namaste.class);
                    startActivity(intent);

                }
                if (position == 2){
                    Intent intent=new Intent(context,TomateCafe.class);
                    startActivity(intent);

                }
                if (position == 3){
                    Intent intent=new Intent(context,CasadelSol.class);
                    startActivity(intent);

                }


            }
        });

    }


}