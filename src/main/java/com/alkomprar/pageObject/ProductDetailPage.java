package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductDetailPage extends PageObject {
    private final By btnCarrito = By.xpath("//button[@id='addToCartButton']");

    public By getBtnCarrito() {
        return btnCarrito;
    }
}
