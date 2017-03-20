package com.example.gabriel.app_gabo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BurgerKing extends AppCompatActivity {

    private Button btnBuscarBurger;
    private Button btnPedidoBurger;
    private Button btnBurgerPagina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger);





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






