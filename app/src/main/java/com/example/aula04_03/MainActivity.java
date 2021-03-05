package com.example.aula04_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends SecondaryActivity {

    private static final String CATEGORIA = "COMP_MOVEL";
    private TextView tValor1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(CATEGORIA, this.getLocalClassName() + ".onCreate() chamado - bundle = " + savedInstanceState);
        tValor1 = new TextView(this);
        tValor1.setText("Exemplo do ciclo de vida. Vide logcats!");
        tValor1 = (TextView) findViewById(R.id.valor1);
    }

    @Override
    protected void onStart() {
        super.onStart();
        tValor1.setText(CATEGORIA+ this.getLocalClassName() + ".onStart() chamado!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        tValor1.setText(CATEGORIA+ this.getLocalClassName() + ".onRestart() chamado!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        tValor1.setText(CATEGORIA+ this.getLocalClassName() + ".onPause() chamado!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        tValor1.setText(CATEGORIA+ this.getLocalClassName() + ".onResume() chamado!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        tValor1.setText(CATEGORIA+ this.getLocalClassName() + ".onStop() chamado!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        tValor1.setText(CATEGORIA+ this.getLocalClassName() + ".onDestroy() chamado!");
        tValor1 = null;
    }

}