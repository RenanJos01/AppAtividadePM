package br.com.etecia.lojapam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);
    }

    public void abrirJanela(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        //Fechar a janela atual
        finish();
    }
}
