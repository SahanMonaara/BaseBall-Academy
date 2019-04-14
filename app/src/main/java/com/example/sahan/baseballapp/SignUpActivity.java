package com.example.sahan.baseballapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ru.katso.livebutton.LiveButton;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        LiveButton signupBtn = findViewById(R.id.signupBtn);
        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
