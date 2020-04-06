package ru.homework.yamarket.pages;

import org.openqa.selenium.By;
import ru.homework.util.BaseActions;

public class MobilePhonesPage {
    BaseActions actions;
    By devicesLocator = By.className("n-snippet-cell2");
    By comparsionSelector = By.className("image_name_compare");

    public MobilePhonesPage(BaseActions actions) {
        this.actions = actions;
    }

    public void selectDevice(int index) {
        actions.moveToElement(actions.getElementFromList(devicesLocator, index));
    }

    public void addToComparsion(int index) {
        actions.getElementFromList(comparsionSelector, index).click();
    }
}
