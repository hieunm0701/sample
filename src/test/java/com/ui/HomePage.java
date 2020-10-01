package com.ui;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage extends UIInteractionSteps {

    static By btnLogin = By.cssSelector("button[class~='login-button']");

    public void navigate(){
        getDriver().get("https://indy-labs.com/ou/#/");
    }
    public void clickSignin(){
        $(btnLogin).click();
    }
    public void isLoggedIn(boolean status) throws InterruptedException {
        int timeout=0;
        while (!getDriver().getCurrentUrl().equalsIgnoreCase("https://indy-labs.com/ou/#/") && timeout<=10000){
            Thread.sleep(1000);
            timeout+=1000;
            if (timeout==10000)
                Assert.assertEquals(getDriver().getCurrentUrl(),"https://indy-labs.com/ou/#/");
        }
        Assert.assertNotEquals($(btnLogin).isCurrentlyVisible(),status);
    }

}