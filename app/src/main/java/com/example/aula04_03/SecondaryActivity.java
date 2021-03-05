package com.example.aula04_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

    private static final String CATEGORIA = "COMP_MOVEL";
    private TextView tView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(CATEGORIA, this.getLocalClassName() + ".onCreate() chamado - bundle = " + savedInstanceState);
        tView = new TextView(this);
        tView.setText("Exemplo do ciclo de vida. Vide logcats!");
        setContentView(tView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(CATEGORIA, this.getLocalClassName() + ".onStart() chamado!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(CATEGORIA, this.getLocalClassName() + ".onRestart() chamado!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(CATEGORIA, this.getLocalClassName() + ".onPause() chamado!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(CATEGORIA, this.getLocalClassName() + ".onResume() chamado!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(CATEGORIA, this.getLocalClassName() + ".onStop() chamado!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(CATEGORIA, this.getLocalClassName() + ".onDestroy() chamado!");
        tView = null;
    }
}