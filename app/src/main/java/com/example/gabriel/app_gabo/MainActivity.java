package com.example.gabriel.app_gabo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText txtUsuario;
    private EditText txtPassword;
    private Button btnIniciar;
    private TextView lblRegistro;
    private Context context;

    String nombre_ingresado;
    String password_ingresado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context=this;
        SharedPreferences prefs = getSharedPreferences("MisPreferencias",Context.MODE_PRIVATE);

        String usuario_almacenado= prefs.getString("usuario","no");
        String password_almacenado= prefs.getString("password","no");

        if(usuario_almacenado.compareTo("no")!=0 &&password_almacenado.compareTo("no")!=0 ){
            Intent a=new Intent(getApplicationContext(),MenuPrincipal.class);
            finish();
            startActivity(a);
        }

        txtUsuario=(EditText)findViewById(R.id.txtUsuario);
        txtPassword=(EditText)findViewById(R.id.txtPassword);
        btnIniciar=(Button)findViewById(R.id.btnIniciar);
        lblRegistro=(TextView) findViewById(R.id.lblRegistro);

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                nombre_ingresado = txtUsuario.getText().toString();
                password_ingresado = txtPassword.getText().toString();
                SharedPreferences prefs = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("usuario", nombre_ingresado);
                editor.putString("password", password_ingresado);
                editor.commit();

                Toast.makeText(getApplicationContext(), "Usuario" + nombre_ingresado, Toast.LENGTH_SHORT).show();

                Intent a = new Intent(getApplicationContext(),MenuPrincipal.class);
                startActivity(a);
                finish();
            }});

        lblRegistro.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(context, Registro.class);
                startActivity(intent);
            }
        });



    }}


