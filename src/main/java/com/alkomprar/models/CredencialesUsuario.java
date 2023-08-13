package com.alkomprar.models;



import com.alkomprar.utils.Excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;


public class CredencialesUsuario {
    private static ArrayList<Map<String, String>> credenciales= new ArrayList<>();

    public static ArrayList<Map<String, String>> dataUsuario(){

        try {
            credenciales = Excel.leerDatosDeHojaDeExcel("src/test/resources/data/Data.xlsx", "Credenciales");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return credenciales;
    }
}
