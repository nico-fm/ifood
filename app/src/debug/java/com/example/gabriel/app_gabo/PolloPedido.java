package com.example.gabriel.app_gabo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PolloPedido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pollo_pedido);

        ListView lista=(ListView)findViewById(R.id.ListPolloPedido);


        ArrayList<Item> items=new ArrayList<Item>();
        items.add(new Item(0, "Socabaya", "22406262", R.drawable.pollo));
        items.add(new Item(1, "El Prado", "22312804", R.drawable.pollo));
        items.add(new Item(2, "MegaCenter", "22720666", R.drawable.pollo));
        items.add(new Item(3, "Miraflores", "22226120", R.drawable.pollo));
        items.add(new Item(4, "Comercio", "22406433", R.drawable.pollo));
        items.add(new Item(5, "Calacoto", "22792444", R.drawable.pollo));
        items.add(new Item(6, "MultiCine", "22111009", R.drawable.pollo));

        AdaptadorItem adaptador=new AdaptadorItem(PolloPedido.this, items);

        lista.setAdapter(adaptador);

    }
}
