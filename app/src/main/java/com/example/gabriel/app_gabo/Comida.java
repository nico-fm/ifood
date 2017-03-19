package com.example.gabriel.app_gabo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Comida extends AppCompatActivity {


    ListViewAdapter adapter;
    private Context context;


    String[] titulo = new String[]{
            "Pollos Copacabana",
            "Xpress by Factory",
            "Pizza Eli's",
            "Mr. Pizza",
            "Planet Pizza",
            "BurgerKing King"
    };
    int[] imagenes = {
            R.drawable.pollo,
            R.drawable.xpress,
            R.drawable.elis,
            R.drawable.mrpizza,
            R.drawable.planet,
            R.drawable.burger,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comida);

        context = this;


        final ListView lista = (ListView) findViewById(R.id.ListViewComida);
        adapter = new ListViewAdapter(this, titulo, imagenes);
        lista.setAdapter(adapter);



        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                if (position == 0){
                    Intent intent=new Intent(context,Pollo.class);
                    startActivity(intent);

                }
                if (position == 1){
                    Intent intent=new Intent(context,Xpress.class);
                    startActivity(intent);

                }
                if (position == 2){
                    Intent intent=new Intent(context,Elis.class);
                    startActivity(intent);

                }
                if (position == 3){
                    Intent intent=new Intent(context,Mrpizza.class);
                    startActivity(intent);

                }
                if (position == 4){
                    Intent intent=new Intent(context,Planet.class);
                    startActivity(intent);

                }
                if (position == 5){
                    Intent intent=new Intent(context,BurgerKing.class);
                    startActivity(intent);

                }

            }
        });

    }


}

