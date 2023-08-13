package com.alkomprar.steps;

import com.alkomprar.pageObject.ProductDetailPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductDetailSteps {

    @Page
    ProductDetailPage detalleProducto;

    @Step("Validar el nombre del producto")
    public void validarNombreProducto(){
        Assert.assertTrue(
                detalleProducto.getDriver().findElement(
                        detalleProducto.getTxtNombreProducto()
                ).isDisplayed()
        );
    }

    @Step("Agregar producto a carrito de compras")
    public void AgregarProductoCarrito(){
        WebDriverWait wait = new WebDriverWait(detalleProducto.getDriver(), Duration.ofSeconds(20));
        WebElement btnCarrito = detalleProducto.getDriver().findElement(detalleProducto.getBtnCarrito());
        wait.until(ExpectedConditions.elementToBeClickable(detalleProducto.getBtnCarrito()));

        JavascriptExecutor jsExecutor = (JavascriptExecutor) detalleProducto.getDriver();
        jsExecutor.executeScript("arguments[0].click()", btnCarrito);
    }

}
