package com.codigo;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Cliente {

    String dpi;
    String nombre;
    String apellido;
    String direccion;
    String telefono;
    String correo;
    String ocupacion;
    String ingresosMensuales;

    public Cliente() {
    }

    public Cliente(String dpi, String nombre, String apellido, String direccion, String telefono, String correo, String ocupacion, String ingresosMensuales) {
        this.dpi = dpi;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.ocupacion = ocupacion;
        this.ingresosMensuales = ingresosMensuales;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getIngresosMensuales() {
        return ingresosMensuales;
    }

    public void setIngresosMensuales(String ingresosMensuales) {
        this.ingresosMensuales = ingresosMensuales;
    }
    
    
    public void registrarUser(String dpi, String nombre, String apellido, String direcion, String telefono, String correo,String ocupacion, String ingresosMensuales) {

    String rutaArchivo = System.getProperty("user.dir") + "/RegistroClientes/registros.txt";
    
        FileWriter escritor = null;
        BufferedWriter bw = null;

        try {
            escritor = new FileWriter(rutaArchivo, true);
            bw = new BufferedWriter(escritor);

            String datos = dpi + "," + nombre + "," + apellido + "," + direcion + "," + telefono + "," + correo + "," + ocupacion + "," + ingresosMensuales;

            bw.write(datos);
            bw.newLine();

        } catch (Exception e) {
            System.out.println("Error al guardar el dato: " + e.getMessage());

        } finally {

            try {
                bw.close();

            } catch (Exception e) {
                System.out.println("Error al cerrar el archivo. " + e.getMessage());
            }
        }

    }
    
    public void actualizarUser(String direccion, String telefono, String correo, String ocuapcion, String ingresos){
        
    }

}
