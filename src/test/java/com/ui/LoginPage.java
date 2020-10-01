package com.ui;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class LoginPage extends UIInteractionSteps {


    static By btnSigninFacebook = By.xpath("//div[text()='Signin with Facebook']");
    static By btnSigninGoogle = By.xpath("//div[text()='Signin with Google']");
    static By btnSigninEmail = By.xpath("//div[text()='Signin with Email']");
    static By btnSignupEmail = By.xpath("//a[@href='/ou/#/register']");
    static By txtEmail = By.cssSelector("input[name=email]");
    static By txtPassword = By.cssSelector("input[name=password]");
    static By btnLogin = By.cssSelector("button[type=submit]");
    static By txtGoogleEmail = By.cssSelector("input[type=email]");
    static By txtGooglePassword = By.cssSelector("input[type=password]");
    static By txtGoogleNext = By.xpath("//span[text()='Tiếp theo']");

    static By txtFacebookEmail = By.cssSelector("input[name=email]");

    public void navigate(){
        getDriver().get("https://indy-labs.com/ou/#/login-with");
    }
    public void loginWithFacebook() throws InterruptedException {
        String winHandleBefore= getDriver().getWindowHandle();
        $(btnSigninFacebook).click();
        Thread.sleep(20000);
        for(String winHandle : getDriver().getWindowHandles()){
            getDriver().switchTo().window(winHandle);
        }
        $(txtFacebookEmail).waitUntilVisible().sendKeys("b@b.bc");
        getDriver().close();
        getDriver().switchTo().window(winHandleBefore);
    }
    public void loginWithGoogle(String username, String password) throws InterruptedException {
        String winHandleBefore= getDriver().getWindowHandle();
        $(btnSigninGoogle).click();
        Thread.sleep(10000);
        for(String winHandle : getDriver().getWindowHandles()){
            getDriver().switchTo().window(winHandle);
        }
        $(txtGoogleEmail).waitUntilVisible().sendKeys(username);
        $(txtGoogleEmail).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        $(txtGooglePassword).waitUntilVisible().sendKeys(password);
        $(txtGooglePassword).sendKeys(Keys.ENTER);
        getDriver().switchTo().window(winHandleBefore);
    }
    public void loginWithEmail(String username, String password) {
        $(btnSigninEmail).click();
        $(txtEmail).sendKeys(username);
        $(txtPassword).sendKeys(password);
        $(btnLogin).click();
    }
    public void signupWithEmail() {
        $(btnSigninEmail).click();
        $(btnSignupEmail).click();
    }
}
