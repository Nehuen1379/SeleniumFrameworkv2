package com.selenium.ar.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebTablesPage extends PageObject {

    @FindBy(xpath = "//button[@id='addNewRecordButton']")
    protected WebElementFacade btnAdd;

    @FindBy(xpath = "//input[@id='firstName']")
    protected WebElementFacade txtFirstName;

    @FindBy(xpath = "//input[@id='lastName']")
    protected WebElementFacade txtLastName;

    @FindBy(xpath = "//input[@id='userEmail']")
    protected WebElementFacade txtUserEmail;

    @FindBy(xpath = "//input[@id='age']")
    protected WebElementFacade txtAge;

    @FindBy(xpath = "//input[@id='salary']")
    protected WebElementFacade txtSalary;

    @FindBy(xpath = "//input[@id='department']")
    protected WebElementFacade txtDepartment;

    @FindBy(xpath = "//button[@id='submit']")
    protected WebElementFacade btnSubmit;

    @Step("Hacer click en el boton 'Add'")
    public void hacerClickEnElBotonAdd() {
        btnAdd.click();
    }


    @Step("Completar formulario de Web Tables")
    public void ingresarFormularioWebTables(String firstname, String lastname, String email, String age, String salary, String department) {
        btnAdd.click();
        txtFirstName.sendKeys(firstname);
        txtLastName.sendKeys(lastname);
        txtUserEmail.sendKeys(email);
        txtAge.sendKeys(age);
        txtSalary.sendKeys(salary);
        txtDepartment.sendKeys(department);
        btnSubmit.click();
    }


}
