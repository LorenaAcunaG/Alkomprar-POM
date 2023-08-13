package com.alkomprar.steps;

import com.alkomprar.pageObject.RegistrationPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class RegistrationSteps {

    @Page
    RegistrationPage registro;

    @Step("Enviar nombre del usuario")
    public void enviarNombreUsuario() {
        registro.getDriver().findElement(registro.getTxtNombreUsuario())
                .sendKeys("Pepito");
    }

    @Step("Escribir apellidos del usuario")
    public void enviarApellidosUsuario() {
        registro.getDriver().findElement(registro.getTxtApellidosUsuario())
                .sendKeys("Perez Garcia");
    }

    @Step("Escribir teléfono del usuario")
    public void enviarTelefonoUsuario() {
        registro.getDriver().findElement(registro.getNumTelefonoUsuario())
                .sendKeys("3000000002");
    }

    @Step("Hacer click checkbox términos y condiciones")
    public void SeleccionarCheckboxTermCond(){
        registro.getDriver().findElement(registro.getCheckTermCondiciones())
                .click();
    }

    @Step("Hacer click en boton continuar para registrar usuario")
    public void SeleccionarBtnContinuarRegistro(){
        registro.getDriver().findElement(registro.getBtnRegistrar())
                .click();
    }
}
