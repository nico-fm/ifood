package com.example.gabriel.app_gabo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MrPedidos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mr_pedidos);


        ListView lista=(ListView)findViewById(R.id.ListMrPizzaPedido);


        ArrayList<Item> items=new ArrayList<Item>();
        items.add(new Item(0, "San Miguel", "22111361", R.drawable.mrpizza));
        items.add(new Item(1, "Sopocachi", "22111222", R.drawable.mrpizza));
        items.add(new Item(2, "Miraflores", "22110311", R.drawable.mrpizza));



        AdaptadorItem adaptador=new AdaptadorItem(MrPedidos.this, items);

        lista.setAdapter(adaptador);

    }
}
