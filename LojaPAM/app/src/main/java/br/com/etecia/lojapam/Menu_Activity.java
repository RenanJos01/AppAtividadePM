package br.com.etecia.lojapam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Menu_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);
        //criando tool bar
        Toolbar = findViewById(R.id.toolBarMenu);
        setSupportActionBar(toolBar);

    }

    //Instanciando o menu da tool bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);

        return true;
    }
    //ações de click nos itens menu

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int escolha = item.getItemId();
        switch (escolha) {
            case R.id.mArquivo:
               startActivity(new Intent(getApplicationContext(), Splash_Activity.class));
                break;
            case R.id.mEditar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Editar...",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mExcluir:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em excluir...",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSalvar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em salvar...",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSair:
                //chamando metodo para fechar a janela do app (finish)
                finish();
                break;
        }

        return true;
    }
}
