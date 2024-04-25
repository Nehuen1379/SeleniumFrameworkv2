package com.selenium.ar.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(xpath = "//input[@name='username']")
    protected WebElementFacade txtUsername;

    @FindBy(xpath = "//input[@name='password']")
    protected WebElementFacade txtPassword;

    @FindBy(xpath = "//button[@type='submit']")
    protected WebElementFacade btnSubmit;

    @Step("Ingresar usuario")
    public void ingresarUsuario(String usuario) {
        txtUsername.sendKeys(usuario);
    }

    @Step("Ingresar contraseña")
    public void ingresarContraseña(String contraseña) {
        txtPassword.sendKeys(contraseña);
    }

    @Step("Hacer click en el botón 'Submit' del Login")
    public void hacerClicEnBotonInicioSesion() {
        btnSubmit.click();
    }

}
