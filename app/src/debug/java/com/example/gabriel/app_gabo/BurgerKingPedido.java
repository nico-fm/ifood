package com.example.gabriel.app_gabo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class BurgerKingPedido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger_king_pedido);


        ListView lista=(ListView)findViewById(R.id.ListBurguerKingPedido);

        ArrayList<Item> items=new ArrayList<Item>();
        items.add(new Item(0, "Socabaya", "22408888", R.drawable.burger));
        items.add(new Item(1, "Calle 19", "22796867", R.drawable.burger));

        AdaptadorItem adaptador=new AdaptadorItem(BurgerKingPedido.this, items);

        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                            Uri.parse("tel:22408888"));
                    startActivity(i);

                }

                if (position == 1){
                    Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                            Uri.parse("tel:22796867"));
                    startActivity(i);

                }





            }
        });
    }
}
