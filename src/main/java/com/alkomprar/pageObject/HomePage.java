package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    private final By lnkMiCuenta = By.xpath("//li[@id='js-myaccount-header']/a");
    private final By lnkMiPerfil = By.xpath("(//li[@class='js-my-account-menu-item' and @data-name='MyProfileLink']/a)[1]");
    private final By txtBuscador = By.xpath("//input[@id='js-site-search-input']");
    private final By btnBuscar = By.xpath("//button[@id='js-search-button']");

    public By getLnkMiCuenta() {
        return lnkMiCuenta;
    }

    public By getLnkMiPerfil() {
        return lnkMiPerfil;
    }

    public By getTxtBuscador() {
        return txtBuscador;
    }

    public By getBtnBuscar() {
        return btnBuscar;
    }
}