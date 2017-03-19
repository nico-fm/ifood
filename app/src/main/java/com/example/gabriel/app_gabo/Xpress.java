package com.example.gabriel.app_gabo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Xpress extends AppCompatActivity {

    private Button btnBuscarMapaXpress;
    private Button btnPedidoXpress;
    private Button btnXpressPagina;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xpress);

        btnPedidoXpress=(Button)findViewById(R.id.btnPedidoXpress);
        btnBuscarMapaXpress=(Button)findViewById(R.id.btnBuscarMapaXpress);
        btnXpressPagina=(Button)findViewById(R.id.btnXpressPagina);





        btnXpressPagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                //https://www.facebook.com/factorylapaz
                //https://factory.com.bo


                Uri uriUrl = Uri.parse("https://www.facebook.com/XpressbyFactory/");

                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);

            }
        });
    }
}
