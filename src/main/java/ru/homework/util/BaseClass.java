package ru.homework.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

//Инициализируем и настраиваем браузер
public class BaseClass {
    WebDriver driver = new ChromeDriver();

    @BeforeTest
    private WebDriver initializeDriver() {
        System.getProperty("webdriver.chrome.driver", "chromedriver");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    @AfterTest
    private void closeBrowser() {
        driver.quit();
    }

    public WebDriver setPropertyWindow(WebDriver driver) {
        driver.manage().window().maximize();
        return driver;
    }
}
