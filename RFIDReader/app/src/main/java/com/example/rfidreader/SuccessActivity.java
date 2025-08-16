package com.example.rfidreader;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SuccessActivity extends AppCompatActivity {

    Button button;
    TextView cardUID;

    String currentUID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        button = findViewById(R.id.button);
        cardUID = findViewById(R.id.cardUID);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("CARD_UID")) {
            currentUID = intent.getStringExtra("CARD_UID");
            cardUID.setText(currentUID); }

        button.setOnClickListener(v -> {
            Intent intent2 = new Intent(SuccessActivity.this, MainActivity.class);
            startActivity(intent2);
        });
    }
}