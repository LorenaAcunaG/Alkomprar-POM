package com.alkomprar.steps;

import com.alkomprar.models.CredencialesUsuario;
import com.alkomprar.models.DatosProducto;
import com.alkomprar.pageObject.HomePage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeSteps {
    @Page
    HomePage home;

    @Step("Abrir la pagina")
    public void abrirPagina(){
        home.openUrl("https://www.alkomprar.com/");
    }

    @Step("Realizar hover sobre Mi Cuenta")
    public void realizarHoverLnkMiCuenta() {
        WebElementFacade element = home.find(home.getLnkMiCuenta());
        home.withAction().moveToElement(element).perform();
    }

    @Step("Hacer click en link Iniciar sesión")
    public void realizarClickLnkIniciarSesion() {
        home.getDriver().findElement(home.getLnkMiPerfil())
                .click();
    }

    @Step("Buscar producto en el buscador")
    public void buscarProducto(){
        String producto = DatosProducto.dataProducto().get(0).get("Producto a buscar");
        home.getDriver().findElement(home.getTxtBuscador())
                .click();

        home.getDriver().findElement(home.getTxtBuscador())
                .sendKeys(producto);
    }

    @Step("Dar click en buscar")
    public void aceptarBusqueda(){
        WebDriverWait wait = new WebDriverWait(home.getDriver(), Duration.ofSeconds(10));

        // Espera a que el botón de búsqueda esté habilitado y visible
        WebElement btnBuscar = home.getDriver().findElement(home.getBtnBuscar());
        wait.until(ExpectedConditions.elementToBeClickable(btnBuscar));

        // Ahora el botón está habilitado y se puede hacer click en él
        btnBuscar.click();


    }

}
