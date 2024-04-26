package com.selenium.ar.stepdefinitions;

import com.selenium.ar.pages.AdminPage;
import com.selenium.ar.pages.ValidationPage;
import com.selenium.ar.utilities.website.WebSite;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class AdminStepDefinitions {

    @Steps(shared = true)
    LoginPage lp;

    @Steps(shared = true)
    ValidationPage vp;

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    AdminPage ap;

    @And("hace click en el boton Admin")
    public void clickEnElModuloAdmin() {
        ap.hacerClicEnBtnAdmin();
    }

    @And("hace click en el boton Add")
    public void clickEnElBotonAdd() {
        ap.hacerClicEnBtnAdd();
    }
    @When("completa el formulario de carga de usuario")
    public void completaFormularioAltaDeUsuario() {
        ap.seleccionarOpcionEnCmbUserRol("Admin");
        ap.ingresarValorEnTxtEmployeeName("Teresa");
        ap.hacerClickEnDisplayEmployeeName();
        ap.seleccionarOpcionEnCmbStatus("Enabled");
        ap.ingresarValorEnTxtUsername("banana34");
        ap.ingresarValorEnTxtPassword("1234");
        ap.ingresarValorEnTxtConfirmPassword("1234");
        ap.hacerClicEnBtnSave();
    }

}
