package com.example.gabriel.app_gabo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class BurgerKing extends AppCompatActivity {

    private Button btnBuscarBurger;
    private Button btnPedidoBurger;
    private Button btnBurgerPagina;

    Spinner spinner1;
    String[] hamburguesa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger);


        spinner1=(Spinner)findViewById(R.id.spinnerBK);
        hamburguesa=getResources().getStringArray(R.array.nombre_lista_BK_hamburguesas);
        ArrayAdapter<String> hamList = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,hamburguesa);
        spinner1.setAdapter(hamList);



            btnPedidoBurger = (Button) findViewById(R.id.btnPedidoBurger);
            btnBuscarBurger = (Button) findViewById(R.id.btnBuscarMapaBurger);
            btnBurgerPagina = (Button) findViewById(R.id.btnBurgerPagina);


            btnBurgerPagina.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    Uri uriUrl = Uri.parse("http://www.burgerking.com.bo/");

                    Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(intent);

                }
            });
        btnBuscarBurger.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {


                Intent inten = new Intent(BurgerKing.this,BurgerKingMapas.class);
                startActivity(inten);
            }
        });
        }
    }






