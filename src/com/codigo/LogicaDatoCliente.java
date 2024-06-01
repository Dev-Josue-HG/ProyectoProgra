package com.codigo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jhosu
 */
public class LogicaDatoCliente {
    //leer txt sacar 
    //llenar la lista y buscar archivo cuenta. saldo
    private String numCuentaEn;
    private String saldoCuentaEn;

    public String getNumCuentaEn() {
        return numCuentaEn;
    }

    public void setNumCuentaEn(String numCuentaEn) {
        this.numCuentaEn = numCuentaEn;
    }

    public String getSaldoCuentaEn() {
        return saldoCuentaEn;
    }

    public void setSaldoCuentaEn(String saldoCuentaEn) {
        this.saldoCuentaEn = saldoCuentaEn;
    }
    
    String rutaArchivo = System.getProperty("user.dir") + "/RegistroClientes/aperturaCuentas.txt";
    String saldoAsi;
    
    
    public List<LogicaCliente> lista(){
        List<LogicaCliente> listaClientes = new ArrayList<>();
        
        FileReader lector = null;
        BufferedReader br = null;

        try {
            lector = new FileReader(rutaArchivo);

            br = new BufferedReader(lector);

            String linea;
            while ((linea = br.readLine()) != null) {

                String[] partesLinea = linea.split(",");

                String numCuentab = partesLinea[3];
                
                setNumCuentaEn(numCuentab);
                LogicaCliente clienteN = new LogicaCliente(numCuentaEn, saldoCuentaEn);
                listaClientes.add(clienteN);
                
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
        return listaClientes;
    } 
    
    public void cuentaArchivo(){
        String rutaArchivoCC = System.getProperty("user.dir") + "/RegistroClientes/CuentasCliente/" + numCuentaEn + ".txt";
        
        
        FileReader lector = null;
        BufferedReader br = null;
        
        try {
            lector = new FileReader(rutaArchivoCC);

            br = new BufferedReader(lector);

            String linea2;
            while ((linea2 = br.readLine()) != null) {

                String[] parteLinea2 = linea2.split(",");

                String saldoCuenBus = parteLinea2[3];

                saldoAsi = saldoCuenBus;

            }
            setSaldoCuentaEn(saldoAsi);

        } catch (Exception e) {
            System.out.println("Error al leer el archivo de Cuenta. " + e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar el archivo. " + e.getMessage());
            }
        }   
    }  
}
