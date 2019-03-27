package com.example.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


   EditText nombre;
   EditText edad;
   EditText ofensa;

    Button boton_validar;

    ListView listaEnemigos;
    ArrayAdapter<Enemigo> enemigoAdapter;

    List<Enemigo> enemigos = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.nombre);
        edad = findViewById(R.id.edad);
        ofensa = findViewById(R.id.ofensa);

        listaEnemigos = findViewById(R.id.lista);
       //enemigoAdapter = new ArrayAdapter<Enemigo>(this, enemigos);
        listaEnemigos.setAdapter(enemigoAdapter);

        boton_validar = findViewById(R.id.boton_validar);
        boton_validar = findViewById(R.id.boton_validar);

        boton_validar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivityForResult(intent, 9);
            }
        });

       /*boton_validar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = nombre.getText().toString();
                String edad = edad.getText().toString();
                String ofensa = ofensa.getText().toString();
                Intent intent = new Intent();
                intent.putExtra( "nombre", nombre );
                intent.putExtra( "edad",edad );
                intent.putExtra( "ofensa", ofensa );
                setResult(9, intent);
                finish();
            }
        } );*/

    }

    public void Añadir(View view){

        if (nombre.getText().toString().isEmpty()) {
            Toast.makeText(this, "Añade un nombre", Toast.LENGTH_LONG).show();
        }else{
            if (edad.getText().toString().isEmpty()) {
                Toast.makeText(this, "Escribe la edad entre 0 y 150 años", Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this,"Todo correcto", Toast.LENGTH_LONG).show();
            }
        }
    }





    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);


        if(requestCode == 9) {
            String nombre = intent.getStringExtra("nombre");
            String edad = intent.getStringExtra("edad");
            String ofensa = intent.getStringExtra("ofensa");

            Enemigo enemigo = new Enemigo();
            enemigo.setNombre(nombre);
            enemigo.setEdad(edad);
            enemigo.setOfensa(ofensa);

            enemigos.add(enemigo);
            enemigoAdapter.notifyDataSetChanged();


        }
    }

}