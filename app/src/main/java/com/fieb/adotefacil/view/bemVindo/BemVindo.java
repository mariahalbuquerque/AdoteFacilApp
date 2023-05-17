package com.fieb.adotefacil.view.bemVindo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.fieb.adotefacil.R;
import com.fieb.adotefacil.view.login_cadastro.Login;

public class BemVindo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mostrarLogin();
            }
        },2000);

    }
    private void mostrarLogin(){
        Intent intent = new Intent(BemVindo.this, Login.class);
        startActivity(intent);
        finish();
    }

}