package com.wikiahomework.tests;

import com.wikiahomework.main.Main;
import com.wikiahomework.pages.HomePage;
import org.testng.annotations.Test;

public class Homework extends Main {

    @Test
    public void homework1() {
        HomePage homePage = new HomePage(driver);
        homePage.navigation();
        homePage.hoverMouse();
        homePage.login();
    }

    @Test
    public void homework2() {
        HomePage homePage = new HomePage(driver);
        homePage.navigation();
        // homePage.hoverMouse();
        // homePage.login();
        homePage.contribute();
        homePage.videoAdd();
        homePage.compare();

    }
}
