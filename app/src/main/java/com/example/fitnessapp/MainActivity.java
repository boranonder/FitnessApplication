package com.example.fitnessapp;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    String Email;
    String Password;
    Button LoginButton;
    Button RegisterButton;
    TextView EmailText;
    TextView PasswordText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Email = "y.boranonder@gmail.com";
        Password = "boran123";
        LoginButton = (Button) findViewById(R.id.LoginButton);
        RegisterButton = (Button) findViewById(R.id.RegisterButton);
        EmailText = (TextView) findViewById(R.id.Email);
        PasswordText = (TextView) findViewById(R.id.password);
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginButtonAct();
            }
        });

        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RegisterButtonAct();
            }
        });
    }


    public void LoginButtonAct () {
        if ((EmailText.getText().toString().equals(Email)) && (PasswordText.getText().toString().equals(Password))) {
            Intent intent = new Intent(MainActivity.this, introAppActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(getApplicationContext(),"Wrong E-Mail or password",Toast.LENGTH_LONG).show();
        }
    }
        public void RegisterButtonAct () {
            Intent intent = new Intent(MainActivity.this, RegistirationActivity.class);
            startActivity(intent);
        }
    }
