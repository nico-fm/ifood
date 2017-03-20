package com.example.gabriel.app_gabo;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
//hola

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtUsuario;
    private EditText txtPassword;
    private Button btnIniciar;
    private TextView txtRegistrarse;
    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth = FirebaseAuth.getInstance();

        if(firebaseAuth.getCurrentUser() != null){
            finish();
            Intent Men = new Intent(MainActivity.this,MenuPrincipal.class);
            startActivity(Men);
        }

        txtUsuario = (EditText)findViewById(R.id.txtUsuario);
        txtPassword = (EditText)findViewById(R.id.txtPassword);
        btnIniciar = (Button) findViewById(R.id.btnIniciar);
        txtRegistrarse = (TextView) findViewById(R.id.txtRegistrarse);

        progressDialog = new ProgressDialog(this);

        btnIniciar.setOnClickListener(this);
        txtRegistrarse.setOnClickListener(this);
    }

    private void userLogin(){
        String email = txtUsuario.getText().toString().trim();
        String password = txtPassword.getText().toString().trim();
        if(TextUtils.isEmpty(email)){
            Toast.makeText(this,"Ingresa tu email",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(password)){
            Toast.makeText(this,"Ingresa un password",Toast.LENGTH_SHORT).show();
            return;
        }
        progressDialog.setMessage("Iniciando Sesion....");
        progressDialog.show();

        firebaseAuth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            finish();
                            Intent Men = new Intent(MainActivity.this,MenuPrincipal.class);
                            startActivity(Men);

                        }
                    }
                });
    }

    @Override
    public void onClick(View view) {
        if(view== btnIniciar){
            userLogin();
        }
        if(view==txtRegistrarse){
            Intent Reg = new Intent(MainActivity.this,Registro.class);
            startActivity(Reg);
        }
    }
}





