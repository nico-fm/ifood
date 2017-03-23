package com.example.gabriel.app_gabo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;

public class SucursalPollos extends SQLiteOpenHelper  {
    String sqlCreate = "CREATE TABLE Alumnos (codigo INTEGER, nombre TEXT)";
    String sqlCreate2 = "CREATE TABLE Alumnos (codigo INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, direccion TEXT)";

    public SucursalPollos(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {

db.execSQL(sqlCreate);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//se elimina la version anterior de la tabla
        db.execSQL("DROP TABLE IF EXISTS Alumnos");
        //se crea la nueva version de la tabla
        db.execSQL(sqlCreate2);



    }
}
