package com.vortexcreativaapp.practica;

/**
 * Created by Vortex on 11/09/2016.
 */
public class Datosgetset {



    public void Datosgetsetuno() {

            this.Nombre ="Jose Castro";
            this.Fecha ="20/01/1980";
            this.Email="jose@gmail.com";
            this.Descripcion="del trabajo";
            this.Telefono="5512345678";
            this.flag = "1";


    }
    public void Datosgetsetdos() {

    }


    public static String flag;
    public static String Nombre;
    public static String Fecha;
    public static String Email;
    public static String Descripcion;

    public static String getFlag() {
        return flag;
    }

    public static void setFlag(String flag) {
        Datosgetset.flag = flag;
    }

    public static String Telefono;


    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }


    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }


}
