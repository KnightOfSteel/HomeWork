package ru.homework.yamarket.pages;

import org.openqa.selenium.By;
import ru.homework.util.BaseActions;

public class MainPage {

    BaseActions actions;
    By electronicsSelector = By.cssSelector("div._381y5orjSo._21NjfY1k45 > div:nth-child(3) > div");
    By comparsionSelector = By.className("header2-menu__item_type_compare");

    public MainPage(BaseActions actions) {
        this.actions = actions;
    }

    public void goToComparsion() {
        actions.clickWhenDisplayed(comparsionSelector);
    }

    public void goToElectronics() {
        actions.clickWhenDisplayed(electronicsSelector);
    }
}
