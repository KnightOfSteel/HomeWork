package ru.homework.habr.pages;

import org.openqa.selenium.By;
import ru.homework.util.BaseActions;

public class MainPage {
    BaseActions actions;
    By loginButton = By.id("login");
    By bookmarkButton = By.className(".btn bookmark-btn");
    By profileButton = By.className(".btn_navbar_user-dropdown");

    public MainPage(BaseActions actions) {
        this.actions = actions;
    }

    public void clickLogin() {
        actions.waitUntilDisplayed(loginButton).click();
    }

    public void addToBookmark(int index) {
        actions.moveToElement(actions.getElementFromList(bookmarkButton, 0));
        actions.clickWhenDisplayed(bookmarkButton);
    }

}
