package com.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.steps"})
@RunWith(CucumberWithSerenity.class)
public class Runner {

}
