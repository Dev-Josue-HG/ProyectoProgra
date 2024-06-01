package com.codigo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;

public class DepositosRetiros {

    private String dpi;
    private double monto;
    private String numCuentaA;
    private double saldoEn;
    private double saldoT;
    private String fechaBus;

    public DepositosRetiros() {
    }
    
    public DepositosRetiros(double monto, String numCuenta) {
        this.monto = monto;
        this.numCuentaA = numCuenta;

    }

    public String getNumCuentaA() {
        return numCuentaA;
    }

    public void setNumCuentaA(String numCuenta) {
        this.numCuentaA = numCuenta;
    }
    
    public double getSaldoEn() {
        return saldoEn;
    }

    public void setSaldoEn(double saldoEn) {
        this.saldoEn = saldoEn;
    }

    public String getFechaBus() {
        return fechaBus;
    }

    public void setFechaBus(String fechaBus) {
        this.fechaBus = fechaBus;
    }
    

    double saldoAEcontrar;

    public void leerDoc() {
        String rutaArchivo = System.getProperty("user.dir") + "/RegistroClientes/CuentasCliente/" + numCuentaA + ".txt";

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

//                String fechaB = partesLinea[0];
                String saldoBus = partesLinea[3];
                
                saldoAEcontrar = Double.parseDouble(saldoBus);
//                fechaBus = fechaB;

            }
            setSaldoEn(saldoAEcontrar);

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

    public void depositar() {
        saldoAEcontrar = saldoAEcontrar + monto;
//        String deposito = String.valueOf(saldoAEcontrar);

        String rutaArchivo = System.getProperty("user.dir") + "/RegistroClientes/CuentasCliente/" + numCuentaA + ".txt";

        FileWriter escritor = null;
        BufferedWriter bw = null;

        fechaBus = String.valueOf(LocalDate.now());

//        String numCuenta = numCuenta();
//        String codigoCliente = CodCuenta();
        try {
            escritor = new FileWriter(rutaArchivo, true);
            bw = new BufferedWriter(escritor);

            String datos = fechaBus + "," + monto + "," + "0.0" + "," + saldoAEcontrar;
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

    public void retirar() {
        if (monto <= saldoAEcontrar) {
            
            saldoAEcontrar = saldoAEcontrar - monto;
        }

        String rutaArchivo = System.getProperty("user.dir") + "/RegistroClientes/CuentasCliente/" + numCuentaA + ".txt";

        FileWriter escritor = null;
        BufferedWriter bw = null;
        
        fechaBus = String.valueOf(LocalDate.now());

        try {
            escritor = new FileWriter(rutaArchivo, true);
            bw = new BufferedWriter(escritor);

            String datos = fechaBus + "," + "0.0" + "," + monto + "," + saldoAEcontrar;
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
