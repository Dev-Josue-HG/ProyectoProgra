/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codigo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author jhosu
 */
public class ReportExcel {

    LogicaDatoCliente datosClientes = new LogicaDatoCliente();

    public void generarRepo() {
        List<LogicaCliente> listaClientesE = new ArrayList<>();

        // Obtener los datos
        listaClientesE = datosClientes.lista();

        // Establecer el nombre del reporte
        String nombreReporte = System.getProperty("user.dir") + "/reporte.xlsx";

        // Crear un nuevo libro de trabajo
        Workbook workbook = new XSSFWorkbook();

        // Crear una hoja
        Sheet hoja = workbook.createSheet("Reporte");

        // Establecer los titulos del encabezado
        String[] titulos = {"NO DE CUENTA", "SALDO ACTUAL"};

        // Crear la fila del encabezado
        Row filaEncabezados = hoja.createRow(0);

        // Llenar la fila del encabezado
        for (int i = 0; i < titulos.length; i++) {
            Cell celda = filaEncabezados.createCell(i);
            celda.setCellValue(titulos[i]);
            hoja.autoSizeColumn(i);
        }

        // Llenar el resto de datos
        for (int i = 0; i < listaClientesE.size(); i++) {

            Row filaDatos = hoja.createRow(i + 1);

            for (int dato = 0; dato < titulos.length; dato++) {

                Cell celdaDato = filaDatos.createCell(dato);

                String noCuenta = listaClientesE.get(i).getNumCuenta() != null ? listaClientesE.get(i).getNumCuenta() : "";
                String saldoAc = listaClientesE.get(i).getSaldoActualCuenta() != null ? listaClientesE.get(i).getSaldoActualCuenta() : "";

                switch (dato) {
                    case 0: {
                        celdaDato.setCellValue(noCuenta);
                        break;
                    }
                    case 1: {
                        celdaDato.setCellValue(saldoAc);
                        break;
                    }
                }

                hoja.autoSizeColumn(dato);

            }

        }

        // Guardar el libro de trabajo en un archivo
        try (FileOutputStream fileOut = new FileOutputStream(nombreReporte)) {
            workbook.write(fileOut);
            System.out.println("Archivo Excel creado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Cerrar el libro de trabajo
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
