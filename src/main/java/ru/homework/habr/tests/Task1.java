package ru.homework.habr.tests;

import org.testng.annotations.Test;
import ru.homework.habr.pages.LoginPage;
import ru.homework.habr.pages.MainPage;
import ru.homework.util.BaseActions;

/* Задание № 1.
 * Авторизоваться на сайте (можно завести тестовый аккаунт)
 * Найти 2 статьи
 * Добавить в закладки
 * Проверить, что статьи добавлены.
 * Удалить одну статью.
 * Проверить, что осталась одна статья в закладках.
 * */

@Test
public class Task1 {
    BaseActions actions;
    MainPage mainPage;
    LoginPage loginPage;

    //reCapcha мешает авторизоваться
    public void testHabr() {
        actions  = new BaseActions();
        actions.openURL("https://habr.com");
        mainPage = new MainPage(actions);
        mainPage.clickLogin();
        loginPage = new LoginPage(actions);
        loginPage.loginToHabr("login", "password");
        mainPage.addToBookmark(0);
        mainPage.addToBookmark(1);
    }
}
