package com.example.exercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText user, pass;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            btn = findViewById(R.id.btn);
            user = findViewById(R.id.user);
            pass = findViewById(R.id.pass);
            txt = findViewById(R.id.txt);
        }

        public void Login(View view)
    {

            String username=user.getText().toString();
            String password =pass.getText().toString();

            if ((password.equals("pass")) && (username.equals("user")))
            {
                Intent intent =new Intent(MainActivity.this, LoginOk.class);
                startActivity(intent);
            } else {
                Intent intent =new Intent(MainActivity.this, LoginErrado.class);
                startActivity(intent);
            }
        }

    }
