package com.anisaaprilia;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class BerhasilLogin extends AppCompatActivity implements DialogInput.InputDialogListener {

    private TextView usernameTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.berhasil_login);

        usernameTextView = findViewById(R.id.usernameTextView);
        Button homeButton = findViewById(R.id.homeButton);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        usernameTextView.setText("Selamat Datang " + username);
        homeButton.setOnClickListener(v -> {
            DialogInput dialog = new DialogInput(BerhasilLogin.this);
            dialog.show(getSupportFragmentManager(), "InputDialogFragment");
            FragmentManager fragmentManager = getSupportFragmentManager();

        });
    }

    @Override
    public void onInputText(String inputText) {
        Toast.makeText(this, "Welcome " + inputText, Toast.LENGTH_SHORT).show();

    }
}
