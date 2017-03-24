package com.example.gabriel.app_gabo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Promociones extends AppCompatActivity {

    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promociones);

        context = this;

        ListView lista=(ListView)findViewById(R.id.ListPromociones);


        ArrayList<Item> items=new ArrayList<Item>();

        items.add(new Item(0, "Pollos Copacaban", "VEN Y DISFRUTA EL DIA DEL PADRE CON UN DESCUENTO ESPECIAL", R.drawable.pollo));
        items.add(new Item(1, "Burguer King", "LLEVATE 1 COMBO STACKER(DOBLE) POR 38 Bs.", R.drawable.burger));
        //items.add(new Item(1, "Burguer King", "LLEVATE 1 COMBO STACKER(DOBLE) POR 38 Bs.", R.drawable.burger));
        items.add(new Item(2, "Pollos Copacaban", "¡DISFRUTA LOS SENSACIONALES TECNO RELOJES! PIDELOS JUNTO A TU COMBO COPITO", R.drawable.pollo));
        items.add(new Item(3, "Pollos Copacaban", "CELEBRA CON NOSOTRSOS TU CUMPLE(SOLO EN CINE CENTER)", R.drawable.pollo));
        items.add(new Item(4, "Pollos Copacaban", " QUE TU HAMBRE SE VAYA VOLANDO (LLEVATE 10 ALITAS AL PRECIO DE 8) ", R.drawable.pollo));
        items.add(new Item(5, "Pollos Copacaban", " ¡TECNOSORBENTER! (PIDELOS JUNTO CON COMBO COPITO) ", R.drawable.pollo));
        items.add(new Item(6, "Burguer King", "LLEVATE LA NNUEVA KING A TAN SOLO 17Bs. ", R.drawable.burger));
        items.add(new Item(7, "Burguer King", "LLVATE NUESTRAS GALLETAS OtisSPunkmeyer AL PRECIO DE 8Bs.", R.drawable.burger));
        items.add(new Item(8, "Pizza Eli's", "LLEVATE 1 COCA COLA DE REGALO DE 2L POR LLEVAR UN JUMBO FAMILIAR.", R.drawable.elis));
        items.add(new Item(9, "Xpress by Factory", "AHORA PODRAS LLEVAR  UN COWBOY Y UN SWISS A LA MITAD DE PRECIO .", R.drawable.xpress));
        items.add(new Item(10, "Xpress by Factory", "CELEBRA TU CUMPLEAÑOS EN NUESTRAS SUCURSALES.", R.drawable.xpress));
        items.add(new Item(11, "Mr. Pizza", "CONOCE NUESTRA NUEVA SUCURSAL EXPRESS EN ARANJUEZ.", R.drawable.mrpizza));
        items.add(new Item(12, "Mr. Pizza", "LLEVATE NUESTRA NUEVA PIZZA JUMBO POR 30Bs (PORCION MEDIANA).", R.drawable.mrpizza));

        AdaptadorItem adaptador=new AdaptadorItem(Promociones.this, items);

        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                if (position == 0){
                    Intent intent=new Intent(context,PolloMapas.class);
                    startActivity(intent);

                }
                if (position == 1){
                    Intent intent=new Intent(context,BurgerKingMapas.class);
                    startActivity(intent);

                }
                if (position == 2){
                    Intent intent=new Intent(context,PolloMapas.class);
                    startActivity(intent);

                }
                if (position == 3){
                    Intent intent=new Intent(context,PolloMapas.class);
                    startActivity(intent);

                }
                if (position == 4){
                    Intent intent=new Intent(context,PolloMapas.class);
                    startActivity(intent);

                }
                if (position == 5){
                    Intent intent=new Intent(context,PolloMapas.class);
                    startActivity(intent);

                }
                if (position == 6){
                    Intent intent=new Intent(context,BurgerKingMapas.class);
                    startActivity(intent);

                }
                if (position == 7){
                    Intent intent=new Intent(context,BurgerKingMapas.class);
                    startActivity(intent);

                }
                if (position == 8){
                    Intent intent=new Intent(context,ElisMapas.class);
                    startActivity(intent);

                }
                if (position == 9){
                    Intent intent=new Intent(context,XpressMapas.class);
                    startActivity(intent);

                }
                if (position == 10){
                    Intent intent=new Intent(context,XpressMapas.class);
                    startActivity(intent);

                }
                if (position == 11){
                    Intent intent=new Intent(context,MrPizzaMapas.class);
                    startActivity(intent);

                }
                if (position == 12){
                    Intent intent=new Intent(context,MrPizzaMapas.class);
                    startActivity(intent);

                }

            }
        });



    }
}
