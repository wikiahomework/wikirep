package com.wikiahomework.tests;

import com.wikiahomework.main.Main;
import com.wikiahomework.pages.HomePage;
import org.testng.annotations.Test;

public class Homework extends Main {

    /*comment */
    @Test
    public void homework1() {
        HomePage homePage = new HomePage(driver);
        homePage.navigation();
        homePage.hoverMouse();
        homePage.login();
    }
}
