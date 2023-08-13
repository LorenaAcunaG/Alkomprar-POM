package com.alkomprar.steps;

import com.alkomprar.models.CredencialesUsuario;
import com.alkomprar.pageObject.RegistrationPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class RegistrationSteps {

    @Page
    RegistrationPage registro;

    @Step("Enviar nombre del usuario")
    public void enviarNombreUsuario() {
        String nombreUsuario = CredencialesUsuario.dataUsuario().get(0).get("nombre");

        registro.getDriver().findElement(registro.getTxtNombreUsuario())
                .sendKeys(nombreUsuario);
    }

    @Step("Escribir apellidos del usuario")
    public void enviarApellidosUsuario() {
        String apellidosUsuario = CredencialesUsuario.dataUsuario().get(0).get("apellidos");
        registro.getDriver().findElement(registro.getTxtApellidosUsuario())
                .sendKeys(apellidosUsuario);
    }

    @Step("Escribir teléfono del usuario")
    public void enviarTelefonoUsuario() {
        String telefonoUsuario = CredencialesUsuario.dataUsuario().get(0).get("telefono");
        registro.getDriver().findElement(registro.getNumTelefonoUsuario())
                .sendKeys(telefonoUsuario);
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
