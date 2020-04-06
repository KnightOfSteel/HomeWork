package ru.homework.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseActions extends BaseClass {

    Actions actions = new Actions(driver);

    public WebDriver openURL(String url) {
        driver.get(url);
        setPropertyWindow(driver);
        return driver;
    }

    public WebElement findElement(By elementSelector) {
        return driver.findElement(elementSelector);
    }

    public WebElement waitUntilDisplayed(By elementSelector) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(elementSelector));
    }

    public void clickWhenDisplayed(By elementSelector) {
        waitUntilDisplayed(elementSelector).click();
    }

    public void moveToElement(WebElement elementSelector) {
        actions.moveToElement(elementSelector).perform();
    }

    public WebElement getElementFromList(By elementSelector, int index) {
        return driver.findElements(elementSelector).get(index);
    }

    public int getNumberOfElements(By elementSelector) {
        return driver.findElements(elementSelector).size();
    }
}
