package com.selenium.ar.stepdefinitions;

import com.selenium.ar.pages.LoginPage;
import com.selenium.ar.pages.ValidationPage;
import com.selenium.ar.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class LoginStepDefinitions {

    @Steps(shared = true)
    LoginPage lp;

    @Steps(shared = true)
    ValidationPage vp;

    @Steps(shared = true)
    WebSite url;

    @Given("que el usuario ingresa al sitio web")
    public void navegarAlSitioWeb() {
        url.navigateTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("ingrese sus credenciales validas")
    public void usuarioIngresaCredencialesValidas() {
        lp.ingresarUsuario("Admin");
        lp.ingresarContraseña("admin123");
        lp.hacerClicEnBotonInicioSesion();
    }
    @Then("la aplicacion muestra un mensaje de ingreso exitoso")
    public void validoMensajeDelHome() {
        Assert.assertTrue(vp.verificarTextoDashboard());
    }
}
