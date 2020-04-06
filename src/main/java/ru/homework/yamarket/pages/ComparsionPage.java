package ru.homework.yamarket.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import ru.homework.util.BaseActions;

public class ComparsionPage {
    BaseActions actions;
    By deviceSelector = By.className("n-compare-head__image");

    public ComparsionPage(BaseActions actions) {
        this.actions = actions;
    }

    public void isTwoDeviceComparsed() {
        Assert.assertEquals(actions.getNumberOfElements(deviceSelector), 2, "Телефонов в сравнении не два");
    }
}
