package com.selenium.ar.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ValidationPage extends PageObject {

    @FindBy(xpath = "//h6[text()='Dashboard']")
    protected WebElementFacade lblDashboard;

    @FindBy(xpath = "//div[@class='rt-table']")
    protected WebElementFacade dgvWebTables;

    @FindBy(xpath = "//*[@for='impressiveRadio']")
    protected WebElementFacade rdbImpressive;

    @FindBy(xpath = "//span[@class='text-success']")
    protected WebElementFacade lblTextYes;



    @Step("Validar que el texto 'Dashboard' se encuentre visible para verificar login exitoso")
    public Boolean verificarTextoDashboard(){
        return lblDashboard.isDisplayed();
    }

    @Step("Validar que el valor ingresado se encuentre en la grilla")
    public Boolean verificarCargaUsuarioWebTables(String firstname) {
        List<WebElementFacade> gridCells = dgvWebTables.thenFindAll("//div[@class='rt-td']");
        for (WebElement cell : gridCells) {
            if (cell.getText().equals(firstname)) {
                return true;
            }
        }
        return false;
    }

    @Step("Validar que el radioButton 'Impressive' se encuentre habilitado")
    public boolean estaHabilitadoRdbImpressive() {
        return rdbImpressive.isEnabled();
    }

    @Step("Validar que el radioButton 'Impressive' se encuentre habilitado")
    public boolean estaDeshabilitadoRdbNo() {
        return rdbImpressive.isDisabled();
    }

    @Step("Validar que el texto Yes se encuentre presente")
    public Boolean validarQueElTextoYesSeEncuentrePresente(){
        return lblTextYes.isVisible();
    }

}

