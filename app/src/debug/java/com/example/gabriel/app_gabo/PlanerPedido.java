package com.example.gabriel.app_gabo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PlanerPedido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planer_pedido);

        ListView lista=(ListView)findViewById(R.id.ListPlanetPedido);


        ArrayList<Item> items=new ArrayList<Item>();
        items.add(new Item(0, "Hernando Siels", "22623333", R.drawable.planet));
        items.add(new Item(1, "Avenida Busch", "22623333", R.drawable.planet));
        items.add(new Item(2, "Avenida Sanchez Lima", "22623333", R.drawable.planet));
        items.add(new Item(3, "Avenida Sanchez Lima", "22623333", R.drawable.planet));



        AdaptadorItem adaptador=new AdaptadorItem(PlanerPedido.this, items);

        lista.setAdapter(adaptador);

    }
}
