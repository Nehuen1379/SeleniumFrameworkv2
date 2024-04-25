package com.selenium.ar.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AdminPage extends PageObject {

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Admin']")
    protected WebElementFacade btnAdmin;

    @FindBy(xpath = "//button[@type='button' and text()=' Add ']")
    protected WebElementFacade btnAdd;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div")
    protected WebElementFacade cmbUserRol;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")
    protected WebElementFacade txtEmployeeName;

    @FindBy(xpath = "//div[@role='listbox']")
    protected WebElementFacade displayEmployeeName;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div")
    protected WebElementFacade cmbStatus;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
    protected WebElementFacade txtUsername;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")
    protected WebElementFacade txtPassword;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
    protected WebElementFacade txtConfirmPassword;

    @FindBy(xpath = "//button[@type='submit']//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
    protected WebElementFacade btnSave;


    @Step("Hacer click en el boton 'Admin'")
    public void hacerClicEnBtnAdmin() {
        btnAdmin.click();
    }

    @Step("Hacer click en el boton 'Add'")
    public void hacerClicEnBtnAdd() {
        btnAdd.click();
    }

    @Step("Hacer click en el boton comboBox 'User rol'")
    public void seleccionarOpcionEnCmbUserRol(String opcionUserRol) {
        cmbUserRol.click();
        cmbUserRol.selectByVisibleText(opcionUserRol);
    }

    @Step("Ingresar un valor en el campo 'Employee name'")
    public void ingresarValorEnTxtEmployeeName(String employeeName) {
        txtEmployeeName.sendKeys(employeeName);
    }

    @Step("Hacer click en el display 'Employee name'")
    public void hacerClickEnDisplayEmployeeName() {
        waitForElement().until(ExpectedConditions.visibilityOf(displayEmployeeName));
        displayEmployeeName.click();
    }

    @Step("Hacer click en el boton comboBox 'Status'")
    public void seleccionarOpcionEnCmbStatus(String opcionStatus) {
        cmbStatus.click();
        cmbStatus.selectByVisibleText(opcionStatus);
    }

    @Step("Ingresar un valor en el campo 'Username'")
    public void ingresarValorEnTxtUsername(String username) {
        txtUsername.sendKeys(username);
    }

    @Step("Ingresar un valor en el campo 'Password'")
    public void ingresarValorEnTxtPassword(String password) {
        txtPassword.sendKeys(password);
    }

    @Step("Ingresar un valor en el campo 'Confirm password'")
    public void ingresarValorEnTxtConfirmPassword(String confirmPassword) {
        txtConfirmPassword.sendKeys(confirmPassword);
    }

    @Step("Hacer click en el boton 'Admin'")
    public void hacerClicEnBtnSave() {
        btnSave.click();
    }


}
