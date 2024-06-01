package com.codigo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
/**
 *
 * @author jhosu
 */
public class ReportesMesDia {

    private String numCuentaA;
    private String nombreEncon;
    private String apellidoEncon;
    private String dpiReportes;
    private String fechaReportes;
    private String tipoCuentaReportes;
    private String nombreEncontrado;
    private String apellidosEncontrado;
    private String direccionEncontrada;
    private String numTelEncontrado;
    private String correoEncontrado;
    private String ocupacionEncontrada;
    private String rutaArchivoNoCuenta;
    private String fechaTranEnc;
    private String depositoTransEnc;
    private String retiroTransEnc;
    private String saldoTransEnc;
    private String avisoNoCueIn = "";
    private boolean valCuenExiEn = true;
    private String rutaArchivoRepDia;
    private String fechaDia;
    private String fechaDiaEnc;
    private double depositoDiaEnc;
    private double retiroDiaEnc;
    private double totalDepoDia = 0;
    private double totalRetiDia = 0;
    private String cantiDepDia;
    private String cantiRetDia;

    public ReportesMesDia() {
    }

    public ReportesMesDia(String numCuentaA) {
        this.numCuentaA = numCuentaA;
    }
    
    public String getNumCuentaA() {
        return numCuentaA;
    }

    public void setNumCuentaA(String numCuentaA) {
        this.numCuentaA = numCuentaA;
    }

    public String getNombreEncon() {
        return nombreEncon;
    }

    public void setNombreEncon(String nombreEncon) {
        this.nombreEncon = nombreEncon;
    }

    public String getApellidoEncon() {
        return apellidoEncon;
    }

    public void setApellidoEncon(String apellidoEncon) {
        this.apellidoEncon = apellidoEncon;
    }

    public String getDpiReportes() {
        return dpiReportes;
    }

    public void setDpiReportes(String dpiReportes) {
        this.dpiReportes = dpiReportes;
    }

    public String getFechaReportes() {
        return fechaReportes;
    }

    public void setFechaReportes(String fechaReportes) {
        this.fechaReportes = fechaReportes;
    }

    public String getTipoCuentaReportes() {
        return tipoCuentaReportes;
    }

    public void setTipoCuentaReportes(String tipoCuentaReportes) {
        this.tipoCuentaReportes = tipoCuentaReportes;
    }

    public String getNombreEncontrado() {
        return nombreEncontrado;
    }

    public void setNombreEncontrado(String nombreEncontrado) {
        this.nombreEncontrado = nombreEncontrado;
    }

    public String getApellidosEncontrado() {
        return apellidosEncontrado;
    }

    public void setApellidosEncontrado(String apellidosEncontrado) {
        this.apellidosEncontrado = apellidosEncontrado;
    }

    public String getDireccionEncontrada() {
        return direccionEncontrada;
    }

    public void setDireccionEncontrada(String direccionEncontrada) {
        this.direccionEncontrada = direccionEncontrada;
    }

    public String getNumTelEncontrado() {
        return numTelEncontrado;
    }

    public void setNumTelEncontrado(String numTelEncontrado) {
        this.numTelEncontrado = numTelEncontrado;
    }

    public String getCorreoEncontrado() {
        return correoEncontrado;
    }

    public void setCorreoEncontrado(String correoEncontrado) {
        this.correoEncontrado = correoEncontrado;
    }

    public String getOcupacionEncontrada() {
        return ocupacionEncontrada;
    }

    public void setOcupacionEncontrada(String ocupacionEncontrada) {
        this.ocupacionEncontrada = ocupacionEncontrada;
    }

    public String getRutaArchivoNoCuenta() {
        return rutaArchivoNoCuenta;
    }

    public void setRutaArchivoNoCuenta(String rutaArchivoNoCuenta) {
        this.rutaArchivoNoCuenta = rutaArchivoNoCuenta;
    }

    public String getFechaTranEnc() {
        return fechaTranEnc;
    }

    public void setFechaTranEnc(String fechaTranEnc) {
        this.fechaTranEnc = fechaTranEnc;
    }

    public String getDepositoTransEnc() {
        return depositoTransEnc;
    }

    public void setDepositoTransEnc(String depositoTransEnc) {
        this.depositoTransEnc = depositoTransEnc;
    }

    public String getRetiroTransEnc() {
        return retiroTransEnc;
    }

    public void setRetiroTransEnc(String retiroTransEnc) {
        this.retiroTransEnc = retiroTransEnc;
    }

    public String getSaldoTransEnc() {
        return saldoTransEnc;
    }

    public void setSaldoTransEnc(String saldoTransEnc) {
        this.saldoTransEnc = saldoTransEnc;
    }

    public String getAvisoNoCueIn() {
        return avisoNoCueIn;
    }

    public void setAvisoNoCueIn(String avisoNoCueIn) {
        this.avisoNoCueIn = avisoNoCueIn;
    }

    public boolean isValCuenExiEn() {
        return valCuenExiEn;
    }

    public void setValCuenExiEn(boolean valCuenExiEn) {
        this.valCuenExiEn = valCuenExiEn;
    }

    public String getRutaArchivoRepDia() {
        return rutaArchivoRepDia;
    }

    public void setRutaArchivoRepDia(String rutaArchivoRepDia) {
        this.rutaArchivoRepDia = rutaArchivoRepDia;
    }

    public String getFechaDia() {
        return fechaDia;
    }

    public void setFechaDia(String fechaDia) {
        this.fechaDia = fechaDia;
    }

    public String getFechaDiaEnc() {
        return fechaDiaEnc;
    }

    public void setFechaDiaEnc(String fechaDiaEnc) {
        this.fechaDiaEnc = fechaDiaEnc;
    }

    public double getDepositoDiaEnc() {
        return depositoDiaEnc;
    }

    public void setDepositoDiaEnc(double depositoDiaEnc) {
        this.depositoDiaEnc = depositoDiaEnc;
    }

    public double getRetiroDiaEnc() {
        return retiroDiaEnc;
    }

    public void setRetiroDiaEnc(double retiroDiaEnc) {
        this.retiroDiaEnc = retiroDiaEnc;
    }

    public double getTotalDepoDia() {
        return totalDepoDia;
    }

    public void setTotalDepoDia(double totalDepoDia) {
        this.totalDepoDia = totalDepoDia;
    }

    public double getTotalRetiDia() {
        return totalRetiDia;
    }

    public void setTotalRetiDia(double totalRetiDia) {
        this.totalRetiDia = totalRetiDia;
    }

    public String getCantiDepDia() {
        return cantiDepDia;
    }

    public void setCantiDepDia(String cantiDepDia) {
        this.cantiDepDia = cantiDepDia;
    }

    public String getCantiRetDia() {
        return cantiRetDia;
    }

    public void setCantiRetDia(String cantiRetDia) {
        this.cantiRetDia = cantiRetDia;
    }

    public boolean isCuentaExiste() {
        return cuentaExiste;
    }

    public void setCuentaExiste(boolean cuentaExiste) {
        this.cuentaExiste = cuentaExiste;
    }

    public boolean isVerificarDpi() {
        return verificarDpi;
    }

    public void setVerificarDpi(boolean verificarDpi) {
        this.verificarDpi = verificarDpi;
    }

    public String getRutaArchivoRE() {
        return rutaArchivoRE;
    }

    public void setRutaArchivoRE(String rutaArhchivoRE) {
        this.rutaArchivoRE = rutaArhchivoRE;
    }

    public String getRutaArchivoAperturas() {
        return rutaArchivoAperturas;
    }

    public void setRutaArchivoAperturas(String rutaArchivoAperturas) {
        this.rutaArchivoAperturas = rutaArchivoAperturas;
    }

    boolean cuentaExiste = true;
    boolean verificarDpi = true;
    String rutaArchivoRE = System.getProperty("user.dir") + "/RegistroClientes/registros.txt";
    String rutaArchivoAperturas = System.getProperty("user.dir") + "/RegistroClientes/aperturaCuentas.txt";

    public void crearEstadoCuenta() {

        String rutaArchivoEstadoC = System.getProperty("user.dir") + "/RegistroClientes/EstadosDeCuentas/" + "estadoCuenta" + numCuentaA + ".txt";
        String rutaArchivoDC = System.getProperty("user.dir") + "/RegistroClientes/CuentasCliente/" + numCuentaA + ".txt";

        FileReader lector = null;
        BufferedReader br = null;

        if (valCuenExiEn == false) {
            setAvisoNoCueIn("El número de cuenta ingresado no es válido");
        } else {
            try {
                lector = new FileReader(rutaArchivoRE);

                br = new BufferedReader(lector);

                String linea2;
                while ((linea2 = br.readLine()) != null) {

                    String[] parteLinea2 = linea2.split(",");

                    String busquedaDpi = parteLinea2[0];
                    String busquedaNombre = parteLinea2[1];
                    String busquedaApellidos = parteLinea2[2];
                    String busquedaDireccion = parteLinea2[3];
                    String busquedaNumeroTel = parteLinea2[4];
                    String busquedaCorreo = parteLinea2[5];
                    String busquedaOcupacion = parteLinea2[6];

                    if (busquedaDpi.equals(dpiReportes)) {
                        nombreEncontrado = busquedaNombre;
                        apellidosEncontrado = busquedaApellidos;
                        direccionEncontrada = busquedaDireccion;
                        numTelEncontrado = busquedaNumeroTel;
                        correoEncontrado = busquedaCorreo;
                        ocupacionEncontrada = busquedaOcupacion;
                        verificarDpi = true;
                    } else {
                        verificarDpi = false;
                    }
                }

            } catch (Exception e) {
                System.out.println("Error al buscar los datos. " + e.getMessage());
            } finally {
                try {
                    br.close();
                } catch (Exception e) {
                    System.out.println("Error al cerrar el archivo. " + e.getMessage());
                }
            }

        }

        FileWriter escritor = null;
        BufferedWriter bw = null;
        if (valCuenExiEn == false) {

        } else {

            try {
                escritor = new FileWriter(rutaArchivoEstadoC, true);
                bw = new BufferedWriter(escritor);

                String datostxt = "NUMERO DE CUENTA: \t" + numCuentaA + "\n"
                        + "TIPO DE CUENTA: \t" + tipoCuentaReportes + "\n"
                        + "NUMERO DE DPI: \t\t" + dpiReportes + "\n"
                        + "NOMBRE:  \t\t" + nombreEncontrado + " " + apellidosEncontrado + "\n"
                        + "DIRECCION: \t\t" + direccionEncontrada + "\n"
                        + "TELEFONO: \t\t" + numTelEncontrado + "\n"
                        + "CORREO: \t\t" + correoEncontrado + "\n"
                        + "OCUPACION: \t\t" + ocupacionEncontrada + "\n\n";
                String titulos = "= \t" + "FECHA" + "\t\t = \t" + "DEPOSITO" + " = \t" + "RETIRO" + "\t = \t" + "SALDO" + "\t =";

                bw.write(datostxt);
                bw.newLine();
                bw.write(titulos);
                bw.newLine();

            } catch (Exception e) {
                System.out.println("Error al duardar los datos del cliente:  " + e.getMessage());
            } finally {

                try {
                    bw.close();
                } catch (Exception e) {
                    System.out.println("Error al guardar el archivo. " + e.getMessage());
                }
            }

            try {
                lector = new FileReader(rutaArchivoDC);

                br = new BufferedReader(lector);

                String linea3;
                while ((linea3 = br.readLine()) != null) {

                    String[] parteLinea3 = linea3.split(",");

                    String fechaTransBus = parteLinea3[0];
                    String depositoTransBus = parteLinea3[1];
                    String retiroTransBus = parteLinea3[2];
                    String saldoTransBus = parteLinea3[3];

                    saldoTransEnc = saldoTransBus;

                    try {
                        escritor = new FileWriter(rutaArchivoEstadoC, true);
                        bw = new BufferedWriter(escritor);

                        String registros = "| \t" + fechaTransBus + "\t = \t" + depositoTransBus + "\t | \t" + retiroTransBus + "\t | \t" + saldoTransBus + "\t |";

                        bw.write(registros);
                        bw.newLine();

                    } catch (Exception e) {
                        System.out.println("Error al guardar los datos del registro " + e.getMessage());
                    } finally {

                        try {
                            bw.close();
                        } catch (Exception e) {
                            System.out.println("Error al guardar el archivo. " + e.getMessage());
                        }
                    }
                }

                try {
                    escritor = new FileWriter(rutaArchivoEstadoC, true);
                    bw = new BufferedWriter(escritor);

                    String saldoFinal = "\n\n" + "SALDO ACTUAL: " + saldoTransEnc;
                    bw.write(saldoFinal);

                    bw.newLine();

                } catch (Exception e) {
                    System.out.println("Error al guardar los datoss: " + e.getMessage());
                } finally {

                    try {
                        bw.close();
                    } catch (Exception e) {
                        System.out.println("Error al guardar el archivo. " + e.getMessage());
                    }
                }

            } catch (Exception e) {
                System.out.println("Error al leer los datos. " + e.getMessage());
            } finally {
                try {
                    br.close();
                } catch (Exception e) {
                    System.out.println("Error al cerrar el archivo. " + e.getMessage());
                }
            }
        }

    }

    public void leerTxtCuenta() {

//        String rutaArchivo = System.getProperty("user.dir") + "/RegistroClientes/CuentasCliente/" + numCuentaA + ".txt";
        FileReader lector = null;
        BufferedReader br = null;

        try {
            lector = new FileReader(rutaArchivoAperturas);

            br = new BufferedReader(lector);

            String linea;
            while ((linea = br.readLine()) != null) {

                String[] partesLinea = linea.split(",");

                String dpiBus = partesLinea[0];
                String tipoCuentaB = partesLinea[1];
                String numCuentaB = partesLinea[2];
                String fechaB = partesLinea[3];

                if (numCuentaB.equals(numCuentaA)) {
                    dpiReportes = dpiBus;
                    tipoCuentaReportes = tipoCuentaB;
                    fechaReportes = fechaB;
                    cuentaExiste = true;
                    setRutaArchivoNoCuenta(numCuentaA);
                } else {
                    valCuenExiEn = false;
                }
            }
            if (valCuenExiEn == false) {
                setValCuenExiEn(true);
            } else {
                setValCuenExiEn(false);
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

    String rutaArchivoAperturaC = System.getProperty("user.dir") + "/RegistroClientes/aperturaCuentas.txt";
    String saldoAT;
    String rutaArchivoReportDay = System.getProperty("user.dir") + "/RegistroClientes/operacionesdia" + LocalDate.now() + ".txt";

    public void reportOpDia() {

        FileReader lector = null;
        BufferedReader br = null;
        FileWriter escritor = null;
        BufferedWriter bw = null;

        try {
            escritor = new FileWriter(rutaArchivoReportDay, true);
            bw = new BufferedWriter(escritor);

            String datosDia = "REGISTROS DEL DÍA " + LocalDate.now() + "\n\n"
                    + "| \t" + "Fecha" + "\t\t | \t" + "Depositos" + "\t | \t" + "Restiros" + "\t |";

            bw.write(datosDia);
            bw.newLine();

        } catch (Exception e) {
            System.out.println("Error al guardar los datos del registro " + e.getMessage());
        } finally {

            try {
                bw.close();
            } catch (Exception e) {
                System.out.println("Error al guardar el archivo. " + e.getMessage());
            }
        }
        try {
            lector = new FileReader(this.rutaArchivoAperturaC);

            br = new BufferedReader(lector);

            String linea;
            while ((linea = br.readLine()) != null) {

                String[] parteLinea = linea.split(",");

                String noCuentaBus = parteLinea[2];

                setRutaArchivoRepDia(noCuentaBus);

                buscarArchivoCuentaD();

            }

            try {
                escritor = new FileWriter(rutaArchivoReportDay, true);
                bw = new BufferedWriter(escritor);

                String totalDia = "\n\n TOTAL DEPOSITADO: \t" + totalDepoDia
                        + "\n TOTAL RETIRADO: \t" + totalRetiDia;

                bw.write(totalDia);
                bw.newLine();

            } catch (Exception e) {
                System.out.println("Error al guardar los datos del registro " + e.getMessage());
            } finally {

                try {
                    bw.close();
                } catch (Exception e) {
                    System.out.println("Error al guardar el archivo. " + e.getMessage());
                }
            }

        } catch (Exception e) {
            System.out.println("Error al leer el archivo de apertura cuenta. " + e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar el archivo. " + e.getMessage());
            }
        }
    }

    public void buscarArchivoCuentaD() {

        String rutaArchivoDRE = System.getProperty("user.dir") + "/RegistroClientes/CuentasCliente/" + rutaArchivoRepDia + ".txt";

        FileReader lector = null;
        BufferedReader br = null;
        FileWriter escritor = null;
        BufferedWriter bw = null;

        try {
            lector = new FileReader(rutaArchivoDRE);

            br = new BufferedReader(lector);
            fechaDia = String.valueOf(LocalDate.now());
            String linea2;
            while ((linea2 = br.readLine()) != null) {

                String[] parteLinea2 = linea2.split(",");

                String fechaDiaBus = parteLinea2[0];
                String depositoDiaBus = parteLinea2[1];
                String retiroDiaBus = parteLinea2[2];

                if (fechaDiaBus.equals(fechaDia)) {
                    fechaDiaEnc = fechaDiaBus;
                    depositoDiaEnc = Double.parseDouble(depositoDiaBus);
                    retiroDiaEnc = Double.parseDouble(retiroDiaBus);

                    setFechaDiaEnc(fechaDiaBus);
                    setCantiDepDia(depositoDiaBus);
                    setCantiRetDia(retiroDiaBus);

                    System.out.println(fechaDiaBus + " = " + depositoDiaBus + " = " + retiroDiaBus);

                    totalDepoDia = totalDepoDia + depositoDiaEnc;
                    totalRetiDia = totalRetiDia + retiroDiaEnc;

                    try {
                        escritor = new FileWriter(rutaArchivoReportDay, true);
                        bw = new BufferedWriter(escritor);

                        String registrosDia = "| \t" + fechaDiaBus + "\t | \t" + depositoDiaBus + "\t\t | \t" + retiroDiaBus + "\t\t |";

                        bw.write(registrosDia);
                        bw.newLine();

                    } catch (Exception e) {
                        System.out.println("Error al guardar los datos del registro " + e.getMessage());
                    } finally {

                        try {
                            bw.close();
                        } catch (Exception e) {
                            System.out.println("Error al guardar el archivo. " + e.getMessage());
                        }
                    }
                } else {
                    setFechaDiaEnc("--------");
                    setCantiDepDia("Txt");
                    setCantiRetDia("0.0");
                }

            }

            setTotalDepoDia(totalDepoDia);
            setTotalRetiDia(totalRetiDia);

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
