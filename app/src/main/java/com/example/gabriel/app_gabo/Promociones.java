package com.example.gabriel.app_gabo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Promociones extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promociones);

        ListView lista=(ListView)findViewById(R.id.ListPromociones);


        ArrayList<Item> items=new ArrayList<Item>();
        items.add(new Item(1, "Pollos Copacaban", "VEN Y DISFRUTA EL DIA DEL PADRE CON UN DESCUENTO ESPECIAL", R.drawable.pollo));
        items.add(new Item(1, "Burguer King", "LLEVATE 1 COMBO STACKER(DOBLE) POR 38 Bs.", R.drawable.burger));
        items.add(new Item(1, "Pollos Copacaban", "¡DISFRUTA LOS SENSACIONALES TECNO RELOJES! PIDELOS JUNTO A TU COMBO COPITO", R.drawable.pollo));
        items.add(new Item(1, "Pollos Copacaban", "CELEBRA CON NOSOTRSOS TU CUMPLE(SOLO EN CINE CENTER)", R.drawable.pollo));
        items.add(new Item(1, "Pollos Copacaban", " QUE TU HAMBRE SE VAYA VOLANDO (LLEVATE 10 ALITAS AL PRECIO DE 8) ", R.drawable.pollo));
        items.add(new Item(1, "Pollos Copacaban", " ¡TECNOSORBENTER! (PIDELOS JUNTO CON COMBO COPITO) ", R.drawable.pollo));
        items.add(new Item(1, "Burguer King", "LLEVATE LA NNUEVA KING A TAN SOLO 17Bs. ", R.drawable.burger));
        items.add(new Item(1, "Burguer King", "LLVATE NUESTRAS GALLETAS OtisSPunkmeyer AL PRECIO DE 8Bs.", R.drawable.burger));
        items.add(new Item(1, "Pizaa Eli's", "LLEVATE 1 COCA COLA DE REGALO DE 2L POR LLEVAR UN JUMBO FAMILIAR.", R.drawable.elis));
        items.add(new Item(1, "Xpress by Factory", "AHORA PODRAS LLEVAR  UN COWBOY Y UN SWISS A LA MITAD DE PRECIO .", R.drawable.xpress));
        items.add(new Item(1, "Xpress by Factory", "CELEBRA TU CUMPLEAÑOS EN NUESTRAS SUCURSALES.", R.drawable.xpress));
        items.add(new Item(1, "Mr. Pizaa", "CONOCE NUESTRA NUEVA SUCURSAL EXPRESS EN ARANJUEZ.", R.drawable.mrpizza));
        items.add(new Item(1, "Mr. Pizaa", "LLEVATE NUESTRA NUEVA PIZZA JUMBO POR 30Bs (PORCION MEDIANA).", R.drawable.mrpizza));



        AdaptadorItem adaptador=new AdaptadorItem(Promociones.this, items);

        lista.setAdapter(adaptador);



    }
}
