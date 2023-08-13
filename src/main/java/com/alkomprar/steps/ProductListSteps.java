package com.alkomprar.steps;

import com.alkomprar.pageObject.ProductListPage;
import com.alkomprar.utils.SeleccionRandom;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ProductListSteps {
    @Page
    ProductListPage listaProductos;

    @Step("Selección de un producto")
    public void seleccionarProducto(){

        WebElement producto = SeleccionRandom.seleccion(
                listaProductos.getDriver(),
                listaProductos.getLnkProducto()
        );
        //producto.click();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) listaProductos.getDriver();
        jsExecutor.executeScript("arguments[0].click();", producto);
    }
}
