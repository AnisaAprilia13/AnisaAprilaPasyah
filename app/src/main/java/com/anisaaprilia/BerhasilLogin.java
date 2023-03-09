package com.anisaaprilia;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class BerhasilLogin extends AppCompatActivity {

    private TextView usernameTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.berhasil_login);

        usernameTextView = findViewById(R.id.usernameTextView);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        usernameTextView.setText("Selamat Datang " + username);

    }
}
