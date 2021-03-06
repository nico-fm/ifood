package com.example.gabriel.app_gabo;

import android.app.ProgressDialog;
import android.content.Intent;
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

public class Registro extends AppCompatActivity implements View.OnClickListener{

    private Button reg;
    private EditText editTextEmail ;
    private EditText editTextPassword;
    private EditText editTextName;
    private EditText editTextConfirmPassword;
    private TextView home;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


        firebaseAuth = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(this);

        reg = (Button)findViewById(R.id.reg);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        editTextName=(EditText)findViewById(R.id.editTextName);
        editTextConfirmPassword=(EditText)findViewById(R.id.editTextConfirmPassword);

        home = (TextView) findViewById(R.id.home);
        reg.setOnClickListener(this);
        home.setOnClickListener(this);

    }

    private void validacionUsuario(){
        String email = editTextEmail.getText().toString().trim();
        String password= editTextPassword.getText().toString().trim();
        String confirmarPass= editTextConfirmPassword.getText().toString().trim();
        String nombre = editTextName.getText().toString().trim();

        if(TextUtils.isEmpty(email)){
            Toast.makeText(this,"Ingresa tu email",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(password)){
            Toast.makeText(this,"Ingresa un password",Toast.LENGTH_SHORT).show();
            return;
        }
        if(!TextUtils.equals(password,confirmarPass)){
            Toast.makeText(this,"Las contraseñas no coinciden",Toast.LENGTH_SHORT).show();
            return;
        }

        progressDialog.setMessage("Registrando Usuario....");
        progressDialog.show();
        firebaseAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {

                                finish();
                                Intent Men = new Intent(Registro.this,MenuPrincipal.class);
                                startActivity(Men);
                            Toast.makeText(Registro.this, "Registrado Correctamente", Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(Registro.this, "No pudo registrarse, por favor intente de nuevo", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
}

    @Override
    public void onClick(View view) {
    if(view == reg){
        validacionUsuario();
    }
    if(view == home){
        Intent Main = new Intent(Registro.this,MainActivity.class);
        startActivity(Main);

    }

    }
}
