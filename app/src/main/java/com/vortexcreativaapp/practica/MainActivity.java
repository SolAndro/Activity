package com.vortexcreativaapp.practica;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    public TextView nombre;
    private TextView Fecha;
    private TextView Email;
    private TextView Descripcion;
    private TextView Telefono;

    private Button Editar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Datosgetset valores = new Datosgetset();

        if(valores.getFlag()== null)
        {
            valores.Datosgetsetuno();
        }


        nombre = (TextView) findViewById(R.id.txtNombre);
        Fecha = (TextView) findViewById(R.id.txtFecha);
        Email = (TextView) findViewById(R.id.txtEmail);
        Descripcion = (TextView) findViewById(R.id.txtDescripcion);
        Telefono = (TextView) findViewById(R.id.txtTel);
        Editar = (Button) findViewById(R.id.btnEditar);


        nombre.setText("NOMBRE "+valores.getNombre());
        Fecha.setText("FECHA "+valores.getFecha());
        Email.setText("EMAIL "+valores.getEmail());
        Descripcion.setText("DESCRIPCION "+valores.getDescripcion());
        Telefono.setText("TELEFONO "+valores.getTelefono());

        Editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editar();
            }
        });

        }

    public void Editar()
    {
        Intent i = new Intent(this, Datos.class);
        startActivity(i);
    }






}
