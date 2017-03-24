package com.example.gabriel.app_gabo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ElisPedido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elis_pedido);

        ListView lista=(ListView)findViewById(R.id.ListElisPedido);


        ArrayList<Item> items=new ArrayList<Item>();
        items.add(new Item(0, "Monje Campero", "22335566", R.drawable.elis));
        items.add(new Item(1, "Calle Comercio", "22906692", R.drawable.elis));
        items.add(new Item(2, "MultiCine", "22146116", R.drawable.elis));
        items.add(new Item(3, "Plaza Avaroa", "22434411", R.drawable.elis));
        items.add(new Item(4, "MegaCenter", "22147777", R.drawable.elis));
        items.add(new Item(5, "San Miguel", "22770582", R.drawable.elis));
        items.add(new Item(6, "Achumani", "22710505", R.drawable.elis));
        items.add(new Item(7, "Ciudad Satelite", "22815454", R.drawable.elis));




        AdaptadorItem adaptador=new AdaptadorItem(ElisPedido.this, items);

        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                            Uri.parse("tel:22335566"));
                    startActivity(i);

                }

                if (position == 1){
                    Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                            Uri.parse("tel:22906692"));
                    startActivity(i);

                }
                if (position == 2){
                    Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                            Uri.parse("tel:22146116"));
                    startActivity(i);

                }
                if (position ==3){
                    Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                            Uri.parse("tel:22434411"));
                    startActivity(i);

                }
                if (position == 4){
                    Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                            Uri.parse("tel:22147777"));
                    startActivity(i);

                }
                if (position == 5){
                    Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                            Uri.parse("tel:22770582"));
                    startActivity(i);

                }
                if (position == 6){
                    Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                            Uri.parse("tel:22710505"));
                    startActivity(i);

                }
                if (position == 7){
                    Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                            Uri.parse("tel:22815454"));
                    startActivity(i);

                }






            }
        });

    }
}
