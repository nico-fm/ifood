package com.example.gabriel.app_gabo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                            Uri.parse("tel:22406262"));
                    startActivity(i);

                }

                if (position == 1){
                    Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                            Uri.parse("tel:22312804"));
                    startActivity(i);

                }
                if (position == 2){
                    Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                            Uri.parse("tel:22720666"));
                    startActivity(i);

                }
                if (position == 3){
                    Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                            Uri.parse("tel:22226120"));
                    startActivity(i);

                }
                if (position == 4){
                    Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                            Uri.parse("tel:22406433"));
                    startActivity(i);

                }
                if (position == 5){
                    Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                            Uri.parse("tel:22792444"));
                    startActivity(i);

                }
                if (position == 6){
                    Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                            Uri.parse("tel:22111009"));
                    startActivity(i);

                }





            }
        });

    }
}
