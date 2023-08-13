package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegistrationPage extends PageObject {

    private final By txtNombreUsuario = By.xpath("//input[@id='register.firstName']");
    private final By txtApellidosUsuario = By.xpath("//input[@id='register.lastName']");
    private final By numTelefonoUsuario = By.xpath("//input[@id='register.mobileNumber']");
    private final By checkTermCondiciones = By.xpath("//label[@for='registerChkTermsConditions']");
    private final By btnRegistrar = By.xpath("//button[@class='button-primary btn-block js-btn-register-myaccount']");

    public By getTxtNombreUsuario() {
        return txtNombreUsuario;
    }

    public By getTxtApellidosUsuario() {
        return txtApellidosUsuario;
    }

    public By getNumTelefonoUsuario() {
        return numTelefonoUsuario;
    }

    public By getCheckTermCondiciones() {
        return checkTermCondiciones;
    }

    public By getBtnRegistrar() {
        return btnRegistrar;
    }
}
