package com.example.gabriel.app_gabo;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MenuPrincipal extends AppCompatActivity {


    private Context context;

    private Button btnComidaRapida;
    private Button btnVegetariana;
    private Button btnPromociones;
    private Button btnBuscarRestaurant;
    private Button btnFavoritos;
    private Button btnCerrar;

    private FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);
        firebaseAuth = FirebaseAuth.getInstance();

        if(firebaseAuth.getCurrentUser()==null){
            finish();
            Intent main=new Intent(context,MainActivity.class);
            startActivity(main);
        }

        context=this;


        btnComidaRapida=(Button)findViewById(R.id.btnComidaRapida);
        btnVegetariana=(Button)findViewById(R.id.btnVegetariana);
        btnPromociones=(Button)findViewById(R.id.btnPromociones);
        btnBuscarRestaurant=(Button)findViewById(R.id.btnBuscarRestaurant);
        btnFavoritos=(Button)findViewById(R.id.btnFavoritos);
        btnCerrar=(Button) findViewById(R.id.btnCerrar);


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
                Intent intent=new Intent(context,Vegetariana.class);
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

               AlertDialog.Builder Dialogo =new AlertDialog.Builder(MenuPrincipal.this);
                Dialogo.setTitle("Cerrar Sesion");
                Dialogo.setMessage("Seguro que deseas salir?");
                Dialogo.setIcon(R.drawable.delete);

                Dialogo.setPositiveButton("Si",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                firebaseAuth.signOut();
                                Toast.makeText(getApplicationContext(),"Sesion Cerrada",Toast.LENGTH_SHORT).show();
                                Intent a =new Intent (getApplicationContext(),MainActivity.class);
                                finish();
                                startActivity(a);

                            }});
                Dialogo.setNegativeButton("No",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int which){
                                dialog.cancel();
                            }
                        });
                Dialogo.show();
            }
            });
    }
}
