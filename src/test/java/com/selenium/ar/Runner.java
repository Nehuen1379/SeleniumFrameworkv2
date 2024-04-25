package com.selenium.ar;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.selenium.ar.stepdefinitions",
        tags = "@Prueba3"
)

public class Runner {
}
