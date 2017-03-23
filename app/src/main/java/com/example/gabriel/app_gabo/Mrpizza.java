package com.example.gabriel.app_gabo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mrpizza extends AppCompatActivity {

//Era la tarea del bayronth hace un mes :(
    private Button btnBuscarMapaMr;
    private Button btnPedidoMr;
    private Button btnMrPagina;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mrpizza);

        btnPedidoMr = (Button) findViewById(R.id.btnPedidoMr);
        btnBuscarMapaMr = (Button) findViewById(R.id.btnBuscarMapaMr);
        btnMrPagina = (Button) findViewById(R.id.btnMrPagina);


        btnMrPagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Uri uriUrl = Uri.parse("https://www.facebook.com/mrpizzalp/");

                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);

            }
        });
        btnBuscarMapaMr.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {


                Intent inten = new Intent(Mrpizza.this,MrPizzaMapas.class);
                startActivity(inten);
            }
        });
    }
}

