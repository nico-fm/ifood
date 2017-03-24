package com.example.gabriel.app_gabo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                            Uri.parse("tel:22111361"));
                    startActivity(i);

                }

                if (position == 1){
                    Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                            Uri.parse("tel:22111222"));
                    startActivity(i);

                }

                if (position == 2){
                    Intent i = new Intent(android.content.Intent.ACTION_DIAL,
                            Uri.parse("tel:22110311"));
                    startActivity(i);

                }



            }
        });
    }
}
