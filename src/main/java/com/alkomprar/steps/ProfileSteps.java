package com.alkomprar.steps;

import com.alkomprar.pageObject.ProfilePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class ProfileSteps {

    @Page
    ProfilePage profile;

    @Step("validar Mensaje Mi Cuenta en pantalla")
    public void ValidarMensaje(){

        Assert.assertTrue(
                profile.MensajeMiCuenta.isDisplayed()
        );
    }

}
