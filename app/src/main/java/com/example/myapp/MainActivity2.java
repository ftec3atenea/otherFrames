package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        Button button2 = findViewById(R.id.button2);

        button2.setOnClickListener(v -> {
            // hacer algo cuando se presione el botón
            Intent intent = new Intent(this, MainActivity.class);
            // iniciamos el intent para que se ejecute
            startActivity(intent);
            // ejecutamos la animación de cambio de pantallas
            overridePendingTransition(R.anim.page_in, R.anim.page_out);
        });

    }
}