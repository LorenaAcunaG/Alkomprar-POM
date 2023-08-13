package com.alkomprar.steps;

import com.alkomprar.pageObject.ProductDetailPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class ProductDetailSteps {

    @Page
    ProductDetailPage detalleProducto;

    @Step("Agregar producto a carrito de compras")
    public void AgregarProductoCarrito(){
        detalleProducto.getDriver().findElement(detalleProducto.getBtnCarrito())
                .click();
    }

}
