package com.alkomprar.stepDefinitions;

import com.alkomprar.steps.HomeSteps;
import com.alkomprar.steps.ProductDetailSteps;
import com.alkomprar.steps.ProductListSteps;
import com.alkomprar.steps.ProductToCartSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class AgregarProductoCarritoStepDefinitions {
    @Steps
    HomeSteps homeSteps;

    @Steps
    ProductListSteps listaPdctosSteps;

    @Steps
    ProductDetailSteps detallePdctoSteps;

    @Steps
    ProductToCartSteps productoCarritoSteps;

    @Cuando("cuando el usuario busque un producto en el buscador")
    public void cuandoElUsuarioBusqueUnProductoEnElBuscador() {
        homeSteps.buscarProducto();
        homeSteps.aceptarBusqueda();
    }
    @Cuando("seleccione un producto aleatoriamente de la lista de productos")
    public void seleccioneUnProductoAleatoriamenteDeLaListaDeProductos() {

        listaPdctosSteps.seleccionarProducto();
    }
    @Cuando("pulse en el botón de agregar al carrito")
    public void pulseEnElBotonDeAgregarAlCarrito() {
        detallePdctoSteps.validarNombreProducto();
        detallePdctoSteps.AgregarProductoCarrito();
    }
    @Entonces("el usuario podra ver un mensaje del producto agregado exitosamente al carrito.")
    public void elUsuarioPodraVerUnMensajeDelProductoAgregadoExitosamenteAlCarrito() {
        productoCarritoSteps.validarProductoEnCarrito();
    }
}
