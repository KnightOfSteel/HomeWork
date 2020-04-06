package ru.homework.habr.pages;

import org.openqa.selenium.By;
import ru.homework.util.BaseActions;

public class LoginPage {
    BaseActions actions;

    By usernameField = By.id("email_field");
    By passwordField = By.id("password_field");
    By loginButton = By.cssSelector("#login_form > fieldset > div.form__buttons.s-buttons > button");

    public LoginPage(BaseActions actions) {
        this.actions = actions;
    }

    public void loginToHabr(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
        this.clickLoginButton();
    }

    public void setUsername(String username) {
        actions.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password) {
        actions.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton () {
        actions.waitUntilDisplayed(loginButton).click();
    }
}
