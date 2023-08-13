package com.alkomprar.utils;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;


public class SeleccionRandom {


    public static WebElement seleccion(WebDriver driver, By elementoWeb){
        List<WebElement> coleccion = driver.findElements(elementoWeb);
        Random random= new Random();
        int indexRandom= random.nextInt(coleccion.size());
        return coleccion.get(indexRandom);

    }
}
