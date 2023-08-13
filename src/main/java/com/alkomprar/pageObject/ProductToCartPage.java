package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductToCartPage extends PageObject {
    public final By txtProductoEnCarrito = By.xpath("//div[@class='sucess-message sucess-message-alkomprar']");

    public By getTxtProductoEnCarrito() {
        return txtProductoEnCarrito;
    }
}
