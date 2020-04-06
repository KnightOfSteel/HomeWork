package ru.homework.yamarket.pages;

import org.openqa.selenium.By;
import ru.homework.util.BaseActions;

public class ElectronicsPage {

    BaseActions actions;
    By mobilePhonesSelector = By.cssSelector("div:nth-child(1) > div._3VMnEHDoVX > ul > li:nth-child(1) > div > a");

    public ElectronicsPage(BaseActions actions) {
        this.actions = actions;
    }

    public void goToMobilePhones() {
        actions.clickWhenDisplayed(mobilePhonesSelector);
    }
}
