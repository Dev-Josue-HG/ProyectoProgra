/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codigo;

/**
 *
 * @author jhosu
 */
public class LogicaCliente {

    //constructor con variables
    private String numCuenta;
    private String saldoActualCuenta;

    public LogicaCliente() {
    }

    public LogicaCliente(String numCuenta, String saldoActualCuenta) {
        this.numCuenta = numCuenta;
        this.saldoActualCuenta = saldoActualCuenta;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getSaldoActualCuenta() {
        return saldoActualCuenta;
    }

    public void setSaldoActualCuenta(String saldoActualCuenta) {
        this.saldoActualCuenta = saldoActualCuenta;
    }
}
