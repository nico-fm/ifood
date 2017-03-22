package com.example.gabriel.app_gabo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Promociones extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promociones);

        ListView lista=(ListView)findViewById(R.id.ListPromociones);

        //Agregamos algunas filas
        ArrayList<Item> items=new ArrayList<Item>();
        items.add(new Item(1, "Pollos Copacaban", "VEN Y DISFRUTA EL DIA DEL PADRE CON UN DESCUENTO ESPECIAL", R.drawable.pollo));
        items.add(new Item(1, "Burguer King", "LLEVATE 1 COMBO STACKER(DOBLE) POR 38 Bs.", R.drawable.burger));


        //Instanciamos el adaptador
        AdaptadorItem adaptador=new AdaptadorItem(Promociones.this, items);
        //Utilizamos el adaptador
        lista.setAdapter(adaptador);



    }
}
