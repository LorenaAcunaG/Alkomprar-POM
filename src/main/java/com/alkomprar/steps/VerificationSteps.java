package com.alkomprar.steps;

import com.alkomprar.pageObject.VerificationPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class VerificationSteps {

    @Page
    VerificationPage verificacion;

    @Step("Escribir correo del usuario")
    public void enviarCorreoUsuario() {
        verificacion.getDriver().findElement(verificacion.getTxtCorreoUsuario())
                .sendKeys("jirkabalta@gufum.com");
    }

    @Step("Hacer click en botón continuar")
    public void SeleccionarBtnContinuar(){
        verificacion.getDriver().findElement(verificacion.getBtnContinuar())
                .click();
    }


}
