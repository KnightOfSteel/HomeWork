package ru.homework.yamarket.tests;

import org.testng.annotations.Test;
import ru.homework.yamarket.pages.ComparsionPage;
import ru.homework.yamarket.pages.MainPage;
import ru.homework.util.BaseActions;
import ru.homework.yamarket.pages.ElectronicsPage;
import ru.homework.yamarket.pages.MobilePhonesPage;

/* Задание № 2
 * Найти телефон марки 1 и добавить к сравнению
 * Найти телефон марки 2 и добавить к сравнению
 * Проверить, что в сравнении два телефона
 */

@Test
public class Task2 {
    BaseActions actions = new BaseActions();
    MainPage mainPage = new MainPage(actions);
    ElectronicsPage electronicsPage = new ElectronicsPage(actions);
    MobilePhonesPage mobilePhonesPage = new MobilePhonesPage(actions);
    ComparsionPage comparsionPage = new ComparsionPage(actions);

    public void testYaMarket() {
        actions.openURL("https://market.yandex.ru");
        mainPage.goToElectronics();
        electronicsPage.goToMobilePhones();
        mobilePhonesPage.selectDevice(0);
        mobilePhonesPage.addToComparsion(0);
        mobilePhonesPage.selectDevice(1);
        mobilePhonesPage.addToComparsion(1);
        mainPage.goToComparsion();
        comparsionPage.isTwoDeviceComparsed();
    }
}
