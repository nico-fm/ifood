package com.example.gabriel.app_gabo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        TextView goHome = (TextView) findViewById(R.id.home);
        Button register = (Button) findViewById(R.id.reg);

        goHome.setPaintFlags(goHome.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);

        goHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent toMain = new Intent(SignUp.this, MainActivity.class);
                startActivity(toMain);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                DatabaseHandler db = new DatabaseHandler(v.getContext());
                Intent toMain = new Intent(SignUp.this, MainActivity.class);
                EditText user = (EditText) findViewById(R.id.username);
                EditText pass = (EditText) findViewById(R.id.password);
                String userValue = user.getText().toString();
                String passValue = pass.getText().toString();
                int charUserLength = userValue.length();
                int charPassLength = passValue.length();
                boolean userMatch = db.sameUser(userValue);

                if (userMatch) {
                    Toast.makeText(SignUp.this, "El nombre de usuarrio ya existe", Toast.LENGTH_LONG).show();
                }
                else if (userValue.equals("") && passValue.equals("")) {
                    Toast.makeText(SignUp.this, "Campo Vacio", Toast.LENGTH_SHORT).show();
                }
                else if (charUserLength <= 5 && charPassLength <= 5) {
                    Toast.makeText(SignUp.this, "Nombre de usuario demasiado corto", Toast.LENGTH_SHORT).show();
                }
                else {
                    db.addUsers(new Users(userValue, passValue));
                    startActivity(toMain);
                }

            }

        });

    }
}

