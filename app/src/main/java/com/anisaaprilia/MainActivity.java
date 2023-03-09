package com.anisaaprilia;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private EditText UsernameEditText;
    private EditText PasswordEditText;
    private Button LoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UsernameEditText = findViewById(R.id.username_edittext);
        PasswordEditText = findViewById(R.id.password_edittext);
        LoginButton = findViewById(R.id.login_button);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = UsernameEditText.getText().toString();
                String password = PasswordEditText.getText().toString();

                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Mohon lengkapi semua field!", Toast.LENGTH_SHORT).show();
                } else {

                    Intent i = new Intent(MainActivity.this, BerhasilLogin.class);
                    i.putExtra("username", username);
                    startActivity(i);
                }


            }
        });
    }
}