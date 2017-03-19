package com.example.gabriel.app_gabo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


//no hay una lista de restaurantes vegetariano como comidarapida estoy comentando eso
public class Vegetariana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetariano);
    }
}

/**
 * import android.content.Context;
 import android.content.Intent;
 import android.os.Bundle;
 import android.support.v7.app.AppCompatActivity;
 import android.view.View;
 import android.widget.AdapterView;
 import android.widget.ListView;


 //vegetariano
 public class Vegetariana extends AppCompatActivity {


 ListViewAdapter adapter;
 private Context context;


 String[] titulo = new String[]{
 "VINAPHO",
 "Namas Té",
 "Casa Del Sol",
 "Maphrao On",


 };
 int[] imagenes = {
 R.drawable.vinapho,
 R.drawable.Namas te,
 R.drawable.Casa del sol,
 R.drawable.maphrao on,
 };

 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_comida);

 context = this;


 final ListView lista = (ListView) findViewById(R.id.ListViewComida);
 adapter = new ListViewAdapter(this, titulo, imagenes);
 lista.setAdapter(adapter);



 lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
 @Override
 public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


 if (position == 0){
 Intent intent=new Intent(context,vinapho.class);
 startActivity(intent);

 }
 if (position == 1){
 Intent intent=new Intent(context,namas te.class);
 startActivity(intent);

 }
 if (position == 2){
 Intent intent=new Intent(context,casa del sol.class);
 startActivity(intent);

 }
 if (position == 3){
 Intent intent=new Intent(context,maphrao on.class);
 startActivity(intent);

 }
 }
 });

 }


 }
 */

