package com.selenium.ar.stepdefinitions;

import com.selenium.ar.pages.ValidationPage;
import com.selenium.ar.pages.WebTablesPage;
import com.selenium.ar.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class WebTablesStepDefinitions {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    WebTablesPage wp;

    @Steps(shared = true)
    ValidationPage vp;

    @Given("que el usuario ingresa a Web Tables")
    public void usuarioIngresaAWebTables() {
        url.navigateTo("https://demoqa.com/webtables");
    }
    @When("completa el formulario")
    public void usuarioCompletaFormularioWebTables() {
        wp.ingresarFormularioWebTables("Test","Test","test@gmail.com","10","1000","Test");
    }

    @Then("^el usuario verá que el usuario \"([^\"]*)\" está presente en la grilla de usuarios$")
    public void validoCorrectoRegistroDelUsuario(String firstname) {
        boolean resultado = vp.verificarCargaUsuarioWebTables(firstname);
        System.out.println("El usuario " + (resultado ? "sí" : "no") + " está en la grilla.");
    }
}
