package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductListPage extends PageObject {

    private final By lnkProducto = By.xpath("//li[@class='ais-InfiniteHits-item product__item js-product-item js-algolia-product-click']");

    public By getLnkProducto() {
        return lnkProducto;
    }
}
