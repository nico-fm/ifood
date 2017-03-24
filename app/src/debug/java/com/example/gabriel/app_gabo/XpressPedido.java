package com.example.gabriel.app_gabo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                            Uri.parse("tel:22799398"));
                    startActivity(i);

                }

                if (position == 2){
                    Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                            Uri.parse("tel:22121195"));
                    startActivity(i);

                }

                if (position == 3){
                    Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                            Uri.parse("tel:22148306"));
                    startActivity(i);

                }



            }
        });

    }
}
