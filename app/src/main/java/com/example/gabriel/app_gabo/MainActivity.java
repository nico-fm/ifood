package com.example.gabriel.app_gabo;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Paint;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends Activity {

    private Users users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Iniciar = (Button) findViewById(R.id.btnIniciar);
        TextView Registrarse = (TextView) findViewById(R.id.txtRegistrarse);
        ImageView imageView4 = (ImageView)findViewById(R.id.imageView4);

        Registrarse.setPaintFlags(Registrarse.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);


        Iniciar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                DatabaseHandler db = new DatabaseHandler(v.getContext());
                EditText user = (EditText) findViewById(R.id.txtUsuario);
                EditText pass = (EditText) findViewById(R.id.txtPassword);
                String userValue = user.getText().toString();
                String passValue = pass.getText().toString();
                boolean accountMatch = db.validateUser(userValue,passValue);
                int charUserLength = userValue.length();
                int charPassLength = passValue.length();

                if(accountMatch){
                    Intent toSuc = new Intent(MainActivity.this,MenuPrincipal.class);
                    startActivity(toSuc);
                }
                else if(userValue.equals("") && passValue.equals("")){
                    Toast.makeText(MainActivity.this,"Campo Vacio", Toast.LENGTH_SHORT).show();
                }
                else if(charUserLength < 5 && charPassLength < 5){ // At least 6 characters anything less is too short
                    Toast.makeText(MainActivity.this,"Nombre de Usuario o Contraseña demasiado corto", Toast.LENGTH_SHORT).show();
                }
                else{Toast.makeText(MainActivity.this, "Contraseña o Usuario Incorrecto", Toast.LENGTH_SHORT).show();}
            }
        });
        Registrarse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toSign = new Intent(MainActivity.this, SignUp.class);
                startActivity(toSign);
            }
        });

    }
}







