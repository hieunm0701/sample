package com.steps;

import com.ui.HomePage;
import com.ui.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.ui.LoginPage;
import net.thucydides.core.annotations.Steps;

import java.util.Random;

public class LoginSteps {
    @Steps
    private HomePage homePage;
    private LoginPage loginPage;
    private RegisterPage registerPage;

    @When("I open Operative Underground web app")
    public void iOpenOperativeUndergroundWebApp() {
        homePage.navigate();
    }
    @When("I open Operative Underground web app login page")
    public void iOpenOperativeUndergroundWebAppLoginPage() {
        loginPage.navigate();
    }
    @And("I register new account with email successfully")
    public void iRegisterNewAccountWithEmailSuccessfully() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        String username = "hieunguyen";
        String email = username + randomInt + "@gmail.com";
        String password = "123456";
        homePage.clickSignin();
        loginPage.signupWithEmail();
        registerPage.register(username, email, password);
    }

    @And("I login to app by (.*) with (.*) and (.*)")
    public void iLoginToAppByLoginType(String logintype, String username, String password) throws InterruptedException {
        if (logintype.equalsIgnoreCase("facebook"))
                loginPage.loginWithFacebook();
        else if (logintype.equalsIgnoreCase("google"))
                loginPage.loginWithGoogle(username,password);
        else if (logintype.equalsIgnoreCase("email"))
                loginPage.loginWithEmail(username,password);

    }

    @Then("I will log in and redirect to home screen automatically")
    public void iWillLogInAndRedirectToHomeScreenAutomatically() throws InterruptedException {
        homePage.isLoggedIn(true);
    }



}

