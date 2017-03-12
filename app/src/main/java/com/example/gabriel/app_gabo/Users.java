package com.example.gabriel.app_gabo;

public class Users {

    int _id; // Just to have it.
    String _userName;
    String _passWord;

    // Empty constructor
    public Users(){

    }
    public Users(String userName, String _passWord){
        this._userName = userName;
        this._passWord = _passWord;
    }

    public String getUser(){
        return this._userName;
    }

    public String getPassword(){
        return this._passWord;
    }
}