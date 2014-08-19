package com.wikiahomework.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

public class Main {

    public String title;

    public WebDriver driver;
    public WebDriverWait wait;
    public WebElement Element;
    public FirefoxProfile firefoxProfile;

    @BeforeMethod
    public void start() {
        firefoxProfile = new FirefoxProfile();
        driver = new FirefoxDriver();
        driver.get("http://testhomework.wikia.com/");
        //title = driver.getTitle();
        //System.out.println(title);
        //WebDriver driver = new RemoteWebDriver("http://localhost:9515", DesiredCapabilities.chrome());
        //driver = new ChromeDriver();
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\waleskaa\\Downloads\\chromedriver\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        //driver.get("http://etmf-dev.roche.com/D2/#d2");
    }

    //@AfterMethod
    public void finish() {
        driver.close();
        driver.quit();
    }
}
