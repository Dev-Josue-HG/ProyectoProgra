package com.codigo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ActualizarClienteUser {

    private String dpiEnc;
    private String direccionEnconA;
    private String numTeleEnconA;
    private String correoEnconA;
    private String ocupacionEnconA;
    private String ingresosMA;
    private String nombreEncA;
    private String apellidosEncA;

    public ActualizarClienteUser() {
    }

    public ActualizarClienteUser(String dpiEnc, String direccionEnconA, String numTeleEnconA, String correoEnconA, String ocupacionEnconA, String ingresosMA) {
        this.dpiEnc = dpiEnc;
        this.direccionEnconA = direccionEnconA;
        this.numTeleEnconA = numTeleEnconA;
        this.correoEnconA = correoEnconA;
        this.ocupacionEnconA = ocupacionEnconA;
        this.ingresosMA = ingresosMA;
    }

    public String getDpiEnc() {
        return dpiEnc;
    }

    public void setDpiEnc(String dpiEnc) {
        this.dpiEnc = dpiEnc;
    }

    public String getDireccionEnconA() {
        return direccionEnconA;
    }

    public void setDireccionEnconA(String direccionEnconA) {
        this.direccionEnconA = direccionEnconA;
    }

    public String getNumTeleEnconA() {
        return numTeleEnconA;
    }

    public void setNumTeleEnconA(String numTeleEnconA) {
        this.numTeleEnconA = numTeleEnconA;
    }

    public String getCorreoEnconA() {
        return correoEnconA;
    }

    public void setCorreoEnconA(String correoEnconA) {
        this.correoEnconA = correoEnconA;
    }

    public String getOcupacionEnconA() {
        return ocupacionEnconA;
    }

    public void setOcupacionEnconA(String ocupacionEnconA) {
        this.ocupacionEnconA = ocupacionEnconA;
    }

    public String getIngresosMA() {
        return ingresosMA;
    }

    public void setIngresosMA(String ingresosMA) {
        this.ingresosMA = ingresosMA;
    }

    public String getNombreEncA() {
        return nombreEncA;
    }

    public void setNombreEncA(String nombreEncA) {
        this.nombreEncA = nombreEncA;
    }

    public String getApellidosEncA() {
        return apellidosEncA;
    }

    public void setApellidosEncA(String apellidosEncA) {
        this.apellidosEncA = apellidosEncA;
    }
    String rutaArchivo = System.getProperty("user.dir") + "/RegistroClientes/registros.txt";

    public void leerDoc(String dpi) {

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
                if (dpilectura.equals(dpi)) {

                    setNombreEncA(partesLinea[1]);
                    setApellidosEncA(partesLinea[2]);
                    setDireccionEnconA(partesLinea[3]);
                    setNumTeleEnconA(partesLinea[4]);
                    setCorreoEnconA(partesLinea[5]);
                    setOcupacionEnconA(partesLinea[6]);
                    setIngresosMA(partesLinea[7]);
                    break;
                }

//                if (dpilectura.equals(dpi)) {
//
//                    nombreEncontrado = nombreLect;
//                    apellidoEncontrado = apellido;
//                    numCuentaA = numCuenta();
//                }
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

    public void actualizarRegistro(String dpi, String direccion, String numTel, String correo, String ocupacion, String ingresosMes) {

        FileWriter escritor = null;
        BufferedWriter bw = null;

        FileReader lector = null;
        BufferedReader br = null;

        try {
            lector = new FileReader(rutaArchivo);
            br = new BufferedReader(lector);
            StringBuilder contenido = new StringBuilder();
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] partesLinea = linea.split(",");
                String Dpi = partesLinea[0];

                if (Dpi.equals(dpi)) {
                    linea = partesLinea[0] + "," + partesLinea[1] + "," + partesLinea[2] + ","
                            + direccion + "," + numTel + "," + correo + "," + ocupacion + "," + ingresosMes;

                }

                contenido.append(linea).append(System.lineSeparator());
            }

            br.close();

            escritor = new FileWriter(rutaArchivo);
            bw = new BufferedWriter(escritor);
            bw.write(contenido.toString());

        } catch (Exception e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }
}
