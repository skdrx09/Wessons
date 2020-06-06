package com.example.wessons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Pasar de la pantalla principal a la pantalla Registrar Institucion
    public void RegistrarInstitucion(View view){
        Intent registrar = new Intent(this, RegistrarInstitucionActivity.class);
        startActivity(registrar);
        
    }
}
