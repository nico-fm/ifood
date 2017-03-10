package com.example.gabriel.app_gabo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MenuPrincipal extends AppCompatActivity {


    private Context context;

    private Button btnComidaRapida;
    private Button btnVegetariana;
    private Button btnPromociones;
    private Button btnBuscarRestaurant;
    private Button btnFavoritos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);

        context=this;


        btnComidaRapida=(Button)findViewById(R.id.btnComidaRapida);
        btnVegetariana=(Button)findViewById(R.id.btnVegetariana);
        btnPromociones=(Button)findViewById(R.id.btnPromociones);
        btnBuscarRestaurant=(Button)findViewById(R.id.btnBuscarRestaurant);
        btnFavoritos=(Button)findViewById(R.id.btnFavoritos);



        btnComidaRapida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,Comida.class);
                startActivity(intent);
            }
        });
        btnVegetariana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,Vegetariano.class);
                startActivity(intent);
            }
        });
        btnPromociones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,Promociones.class);
                startActivity(intent);
            }
        });
        btnBuscarRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,BuscarRestaurant.class);
                startActivity(intent);
            }
        });
        btnFavoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,Favoritos.class);
                startActivity(intent);
            }
        });

    }
}
