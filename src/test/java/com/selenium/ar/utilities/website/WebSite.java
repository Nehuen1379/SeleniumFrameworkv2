package com.selenium.ar.utilities.website;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class WebSite {

    @Steps(shared = true)
    PageObject selenium;

    @Step("Navegar al sitio web")
    public void navigateTo(String url){
        selenium.setDefaultBaseUrl(url);
        selenium.open();
    }

}
