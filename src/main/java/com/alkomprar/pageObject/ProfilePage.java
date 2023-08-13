package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends PageObject {

    @FindBy(xpath = "//div[@class='account-section-header visible module-title']")
    public WebElementFacade MensajeMiCuenta;
}
