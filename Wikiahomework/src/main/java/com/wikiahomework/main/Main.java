package com.wikiahomework.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class Main {

    public String title;
    public WebDriver driver;
    public WebDriverWait wait;
    public WebElement Element;
    public FirefoxProfile firefoxProfile;

    @BeforeClass
    public void start() {
        firefoxProfile = new FirefoxProfile();
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\waleskaa\\Adam\\WikiaRepo\\chromedriver.exe");
        //driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver.get("http://testhomework.wikia.com/");
    }

    //@AfterMethod
    public void finish() {
        driver.close();
        driver.quit();
    }
}
