package com.vortexcreativaapp.practica;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class Datos extends AppCompatActivity {

    private DatePicker datePicker;
    private Calendar calendar;
    private int anio, mes, dia;
    private EditText nombre;
    private EditText fecha;
    private EditText email;
    private EditText datos;
    private EditText telefono;
    private Button Editar;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        final Datosgetset valores = new Datosgetset();

        nombre = (EditText) findViewById(R.id.nombreE);
        fecha = (EditText) findViewById(R.id.fechaE);
        email = (EditText) findViewById(R.id.correoE);
        telefono = (EditText) findViewById(R.id.telefonoE);
        datos = (EditText) findViewById(R.id.InformacionE);
        Editar = (Button) findViewById(R.id.Regresar);


        calendar = Calendar.getInstance();
        anio = calendar.get(Calendar.YEAR);

        mes = calendar.get(Calendar.MONTH);
        dia = calendar.get(Calendar.DAY_OF_MONTH);
        showDate(anio, mes + 1, dia);

        nombre.setText(valores.getNombre());
        fecha.setText(valores.getFecha());
        email.setText(valores.getEmail());
        datos.setText(valores.getDescripcion());
        telefono.setText(valores.getTelefono());


        Editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valores.setFlag("2");
                valores.setEmail(nombre.getText().toString());
                valores.setFecha(fecha.getText().toString());
                valores.setEmail(email.getText().toString());
                valores.setDescripcion(datos.getText().toString());
                valores.setTelefono(telefono.getText().toString());
                Editar();



            }
        });
    }


    public void setDate(View view) {
        showDialog(999);
        Toast.makeText(getApplicationContext(), "ingresa fecha", Toast.LENGTH_SHORT)
                .show();
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        // TODO Auto-generated method stub
        if (id == 999) {
            return new DatePickerDialog(this, myDateListener, anio, mes, dia);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener myDateListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker arg0, int arg1, int arg2, int arg3) {
            // TODO Auto-generated method stub
            // arg1 = year
            // arg2 = month
            // arg3 = day
            showDate(arg1, arg2 + 1, arg3);
        }
    };

    private void showDate(int anio, int mes, int dia) {
        fecha.setText(new StringBuilder().append(dia).append("/")
                .append(mes).append("/").append(anio));
    }

    public void Editar()
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
