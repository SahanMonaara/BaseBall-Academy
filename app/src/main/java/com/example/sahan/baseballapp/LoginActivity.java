package com.example.sahan.baseballapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import ru.katso.livebutton.LiveButton;

public class LoginActivity extends AppCompatActivity {
    TextView signup;
    EditText userName,password;
    String uname,pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        LiveButton loginBtn = findViewById(R.id.loginBtn);
        signup = findViewById(R.id.signup);
        userName = findViewById(R.id.userName);
        password = findViewById(R.id.password);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uname= userName.getText().toString().trim();
                pwd= password.getText().toString().trim();
                if(uname.equals("test") && pwd.equals("123456")){
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                else {
                    Toast.makeText(LoginActivity.this, "Login Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}