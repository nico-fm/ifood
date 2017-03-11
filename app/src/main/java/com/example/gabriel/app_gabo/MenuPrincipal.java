package com.example.gabriel.app_gabo;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MenuPrincipal extends AppCompatActivity {


    private Context context;

    private Button btnComidaRapida;
    private Button btnVegetariana;
    private Button btnPromociones;
    private Button btnBuscarRestaurant;
    private Button btnFavoritos;
    private Button btnCerrar;


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
        btnCerrar=(Button) findViewById(R.id.btnCerrar);

        SharedPreferences prefs = getSharedPreferences("MisPreferencias",Context.MODE_PRIVATE);
        String usuario_almacenado = prefs.getString("usuario","no");


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
                Intent intent = new Intent(getApplicationContext(), Promociones.class);

                PendingIntent pIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, 0);

                Notification notificacion = new android.support.v4.app.NotificationCompat.Builder(MenuPrincipal.this)
                        .setContentTitle("iFood")
                        .setContentText("Compra la nueva super king!!!")
                        .setSmallIcon(R.drawable.icon_app)
                        .setContentIntent(pIntent)
                        .setDefaults(Notification.DEFAULT_SOUND)
                        .build();

                NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                notificationManager.notify(0, notificacion);
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

        btnCerrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Sesion Cerrada", Toast.LENGTH_SHORT).show();
                SharedPreferences prefs = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);

                SharedPreferences.Editor editor = prefs.edit();
                editor.clear();
                editor.commit();
                Intent a = new Intent(getApplicationContext(), MainActivity.class);
                finish();
                startActivity(a);
            }
            });
    }
}
