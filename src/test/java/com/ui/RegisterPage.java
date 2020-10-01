package com.ui;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;

public class RegisterPage extends UIInteractionSteps {


    static By txtUsername = By.cssSelector("input[name=username]");
    static By txtEmail = By.cssSelector("input[name=email]");
    static By txtPassword = By.cssSelector("input[name=password]");
    static By txtConfirmPassword = By.cssSelector("input[name=confirmPassword]");
    static By btnJoin = By.cssSelector("button[type=submit]");


    public void register(String username, String email, String password) {
        $(txtUsername).sendKeys(username);
        $(txtEmail).sendKeys(email);
        $(txtPassword).sendKeys(password);
        $(txtConfirmPassword).sendKeys(password);
        $(btnJoin).click();
    }
}
