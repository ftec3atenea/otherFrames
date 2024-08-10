package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // enlazar el mundo visual con el mundo lógico
        Button button = findViewById(R.id.button);

        button.setOnClickListener(v -> {
            // hacer algo cuando se presione el botón
            Intent intent = new Intent(this, MainActivity2.class);
            // iniciamos el intent para que se ejecute
            startActivity(intent);
            // ejecutamos la animación de cambio de pantallas
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });
    }
}