package com.codigo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.Random;

public class AperturaCuentaUser {

    private String dpi;
    String numCuenta;
    String tipoCuenta;
    double montoCuenta;
    private String nombreEncontrado;
    private String apellidoEncontrado;
    private String numCuentaA;
    

    public AperturaCuentaUser() {
    }

    public AperturaCuentaUser(double montoCuenta, String tipoCuenta, String dpi) {
//        this.numCuenta = numCuenta;
        this.montoCuenta = montoCuenta;
        this.tipoCuenta = tipoCuenta;
        this.dpi = dpi;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getMontoCuenta() {
        return montoCuenta;
    }

    public void setMontoCuenta(double montoCuenta) {
        this.montoCuenta = montoCuenta;
    }

    public String getNombreEncontrado() {
        return nombreEncontrado;
    }

    public void setNombreEncontrado(String nombreEncontrado) {
        this.nombreEncontrado = nombreEncontrado;
    }

    public String getApellidoEncontrado() {
        return apellidoEncontrado;
    }

    public void setApellidoEncontrado(String apellidoEncontrado) {
        this.apellidoEncontrado = apellidoEncontrado;
    }

    public String getNumCuentaA() {
        return numCuentaA;
    }

    public void setNumCuentaA(String numCuentaA) {
        this.numCuentaA = numCuentaA;
    }
    
    public String fechaApertura() {
        LocalDate fechaActual = LocalDate.now();
        String fechaComoString = fechaActual.toString();
        return fechaComoString;
    }

    public String numCuenta() {
        Random random = new Random();
        long numeroAleatorio = random.nextLong();
        String numeroAletorioS = String.valueOf(Math.abs(numeroAleatorio));
        String numeroCuenta = numeroAletorioS.substring(0, 10);
        return numeroCuenta;
    }
    
    public String CodCuenta(){
        
        Random random = new Random();
        long numeroAleatorio = random.nextLong();
        String numeroAletorioss = String.valueOf(Math.abs(numeroAleatorio));
        String coddCuenta = numeroAletorioss.substring(0, 8);
        
        return coddCuenta;
    }

    public void guardarRegistro(String dpi, String montoInicial, String tipoCuenta) {
        String rutaArchivo = System.getProperty("user.dir") + "/RegistroClientes/aperturaCuentas.txt";

        FileWriter escritor = null;
        BufferedWriter bw = null;

        String fecha = fechaApertura();
        String numCuenta = numCuenta();
        String codigoCliente = CodCuenta();

        try {
            escritor = new FileWriter(rutaArchivo, true);
            bw = new BufferedWriter(escritor);

            String datos = dpi + "," + montoInicial + "," + tipoCuenta + "," + numCuenta + "," + fecha + "," + codigoCliente;
            setNumCuentaA(numCuenta);
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

    public void apertuarCuenta() {

        String rutaArchivo = System.getProperty("user.dir") + "/RegistroClientes/registros.txt";

        FileReader lector = null;
        BufferedReader br = null;
//        String nombreEncontrado = "";
//        String apellidoEncontrado = "";

        try {
            lector = new FileReader(rutaArchivo);

            br = new BufferedReader(lector);

            String linea;
            while ((linea = br.readLine()) != null) {

                String[] partesLinea = linea.split(",");

                String dpilectura = partesLinea[0];
                String nombreLect = partesLinea[1];
                String apellido = partesLinea[2];

                if (dpilectura.equals(dpi)) {

                    nombreEncontrado = nombreLect;
                    apellidoEncontrado = apellido;
                    numCuentaA = numCuenta();
                }

            }

        } catch (Exception e) {
            System.out.println("Error al leer las tareas. " + e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar el archivo. " + e.getMessage());
            }
        }
    }
    
    
    public void crearArchivoCuenta(){
        String rutaArchivo = System.getProperty("user.dir") + "/RegistroClientes/CuentasCliente/" + numCuentaA + ".txt";

        FileWriter escritor = null;
        BufferedWriter bw = null;

        String fecha = fechaApertura();
  
//        String numCuenta = numCuenta();
//        String codigoCliente = CodCuenta();

        try {
            escritor = new FileWriter(rutaArchivo, true);
            bw = new BufferedWriter(escritor);

            String datos = fecha + "," + "0.0" + "," + "0.0" + "," + montoCuenta;
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
    
    

}
