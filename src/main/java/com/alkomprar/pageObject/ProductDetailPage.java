package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductDetailPage extends PageObject {

    private final By txtNombreProducto = By.xpath("(//div[@class='new-container__header__title']/h1)[1]");
    private final By btnCarrito = By.xpath("//button[@class='button-primary js-add-to-cart js-enable-btn text-default']");


    public By getTxtNombreProducto() {
        return txtNombreProducto;
    }

    public By getBtnCarrito() {
        return btnCarrito;
    }

}
