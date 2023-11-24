package id.co.test;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TampilanMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnHelloWorld = findViewById(R.id.btnHelloWorld);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnScrollSianida = findViewById(R.id.btnScrollSianida);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnActivitySatu = findViewById(R.id.btnActivitySatu);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnFibonacci = findViewById(R.id.btnFibonacci);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnAlert = findViewById(R.id.btnAlert);

        btnHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aksi untuk membuka Hello World
                // Gantilah HelloActivity dengan kelas aktivitas yang sesuai
                startActivity(new Intent( TampilanMain.this, HelloWorld.class));
            }
        });

        btnScrollSianida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aksi untuk membuka Scroll Sianida
                startActivity(new Intent( TampilanMain.this, ScrollActivity.class));
            }
        });

        btnActivitySatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aksi untuk membuka Activity Satu
                startActivity(new Intent( TampilanMain.this, AktivitasSatu.class));
            }
        });

        btnFibonacci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aksi untuk membuka Fibonacci
                startActivity(new Intent( TampilanMain.this, Fibonacci.class));
            }
        });

        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aksi untuk menampilkan Alert
                // Gantilah AlertActivity dengan kelas aktivitas yang sesuai
                startActivity(new Intent( TampilanMain.this, ActivityAlarm.class));
            }
        });
    }
}

