package com.example.gabriel.app_gabo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

public class Xpress extends AppCompatActivity {

    private Button btnBuscarMapaXpress;
    private Button btnPedidoXpress;
    private Button btnXpressPagina;

        Spinner hamburguesas;
        Spinner alitas;
        Spinner sandwiches;
        Spinner salsas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xpress);

        btnPedidoXpress=(Button)findViewById(R.id.btnPedidoXpress);
        btnBuscarMapaXpress=(Button)findViewById(R.id.btnBuscarMapaXpress);
        btnXpressPagina=(Button)findViewById(R.id.btnXpressPagina);

        hamburguesas = (Spinner) findViewById(R.id.Xpressbg);

        alitas = (Spinner)findViewById(R.id.xpressAlitas);

        sandwiches=(Spinner) findViewById(R.id.xpressSandwiches);

        salsas =(Spinner)findViewById(R.id.xpressSalsas);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.hamburguesas, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.alitas, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,R.array.sandwiches, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,R.array.salsas, android.R.layout.simple_spinner_item);

        hamburguesas.setAdapter(adapter);
        alitas.setAdapter(adapter2);
        sandwiches.setAdapter(adapter3);
        salsas.setAdapter(adapter4);



        btnXpressPagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uriUrl = Uri.parse("https://www.facebook.com/XpressbyFactory/");

                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);

            }
        });
        btnBuscarMapaXpress.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {


                Intent inten = new Intent(Xpress.this,XpressMapas.class);
                startActivity(inten);
            }
        });

        btnPedidoXpress.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {


                Intent inten = new Intent(Xpress.this,XpressPedido.class);
                startActivity(inten);
            }
        });
    }
}
