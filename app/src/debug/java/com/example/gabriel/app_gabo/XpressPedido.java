package com.example.gabriel.app_gabo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class XpressPedido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xpress_pedido);

        ListView lista=(ListView)findViewById(R.id.ListXpressPedido);


        ArrayList<Item> items=new ArrayList<Item>();
        items.add(new Item(0, "Arce", "22799398", R.drawable.xpress));
        items.add(new Item(1, "Camacho", "22121195", R.drawable.xpress));
        items.add(new Item(2, "MegaCenter", "22148306", R.drawable.xpress));



        AdaptadorItem adaptador=new AdaptadorItem(XpressPedido.this, items);

        lista.setAdapter(adaptador);

    }
}
