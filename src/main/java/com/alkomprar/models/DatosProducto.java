package com.alkomprar.models;

import com.alkomprar.utils.Excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class DatosProducto {
    private static ArrayList<Map<String, String>> datosProducto= new ArrayList<>();

    public static ArrayList<Map<String, String>> dataProducto(){

        try {
            datosProducto = Excel.leerDatosDeHojaDeExcel("src/test/resources/data/Data.xlsx", "Producto");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return datosProducto;
    }
}
