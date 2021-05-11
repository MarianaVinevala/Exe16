package com.example.exercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginErrado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_errado);
    }

   public void Onclick(View v){

    Intent intent =new Intent(LoginErrado.this, MainActivity.class);
    startActivity(intent);
}
}