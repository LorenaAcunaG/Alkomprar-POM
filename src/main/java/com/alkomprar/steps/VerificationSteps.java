package com.alkomprar.steps;

import com.alkomprar.models.CredencialesUsuario;
import com.alkomprar.pageObject.VerificationPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class VerificationSteps {

    @Page
    VerificationPage verificacion;

    @Step("Escribir correo del usuario")
    public void enviarCorreoUsuario() {
        String correoUsuario = CredencialesUsuario.dataUsuario().get(0).get("correo");
        verificacion.getDriver().findElement(verificacion.getTxtCorreoUsuario())
                .sendKeys(correoUsuario);
    }

    @Step("Hacer click en botón continuar")
    public void SeleccionarBtnContinuar(){
        verificacion.getDriver().findElement(verificacion.getBtnContinuar())
                .click();
    }


}
