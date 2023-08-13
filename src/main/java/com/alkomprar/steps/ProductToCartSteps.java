package com.alkomprar.steps;

import com.alkomprar.pageObject.ProductToCartPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class ProductToCartSteps {
    @Page
    ProductToCartPage productoCarrito;

    @Step("Validar que el producto fue agregado al carrito")
    public void validarProductoEnCarrito(){
        Assert.assertTrue(
                productoCarrito.getDriver().findElement(
                        productoCarrito.txtProductoEnCarrito
                ).isDisplayed()
        );
    }

}
