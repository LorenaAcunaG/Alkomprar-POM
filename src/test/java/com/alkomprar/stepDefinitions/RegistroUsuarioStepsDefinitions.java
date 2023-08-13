package com.alkomprar.stepDefinitions;

import com.alkomprar.steps.HomeSteps;
import com.alkomprar.steps.ProfileSteps;
import com.alkomprar.steps.RegistrationSteps;
import com.alkomprar.steps.VerificationSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class RegistroUsuarioStepsDefinitions {

    @Steps
    HomeSteps homeSteps;

    @Steps
    VerificationSteps verificationSteps;

    @Steps
    RegistrationSteps registrationSteps;

    @Steps
    ProfileSteps profileSteps;

    @Dado("que el usuario abre la pagina alkomprar")
    public void queElUsuarioAbreLaPaginaAlkomprar() {

        homeSteps.abrirPagina();
    }
    @Cuando("cuando el usuario haga hover en mi cuenta y selecciona mi perfil")
    public void cuandoElUsuarioHagaHoverEnMiCuentaYSeleccionaMiPerfil() {
        homeSteps.realizarHoverLnkMiCuenta();
        homeSteps.realizarClickLnkIniciarSesion();
    }
    @Cuando("el usuario ingresa un correo no registrado, da click en siguiente")
    public void elUsuarioIngresaUnCorreoNoRegistradoDaClickEnSiguiente() {
        verificationSteps.enviarCorreoUsuario();
        verificationSteps.SeleccionarBtnContinuar();

    }

    @Cuando("el usuario ingresa los campos solicitados, acepta terminos y condiciones y da click en continuar")
    public void elUsuarioIngresaLosCamposSolicitadosAceptaTerminosYCondicionesYDaClickEnSiguiente(){
        registrationSteps.enviarNombreUsuario();
        registrationSteps.enviarApellidosUsuario();
        registrationSteps.enviarTelefonoUsuario();
        registrationSteps.SeleccionarCheckboxTermCond();
        registrationSteps.SeleccionarBtnContinuarRegistro();
    }
    @Entonces("el usuario podra ver un mensaje de mi cuenta en la plataforma.")
    public void elUsuarioPodraVerUnMensajeDeMiCuentaEnLaPlataforma() {
        profileSteps.ValidarMensaje();
    }

}
