package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class VerificationPage extends PageObject {


    private final By txtCorreoUsuario = By.id("js-login-email");

    private final By btnContinuar = By.xpath("//button[@id='js-login-continue']");


    public By getTxtCorreoUsuario() {
        return txtCorreoUsuario;
    }

    public By getBtnContinuar() {
        return btnContinuar;
    }

}
