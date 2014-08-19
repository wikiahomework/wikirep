package com.wikiahomework.pages;

import com.wikiahomework.main.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage extends Main {

    public HomePage(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public void navigation() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        String text = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/wiki/Test-homework_Wiki']"))).getText();
        System.out.println(text);
        Assert.assertEquals(text, "Test-homework Wiki");
    }

    public void hoverMouse() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Actions actions = new Actions(driver);
        WebElement menuHoverLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@id='AccountNavigation']/li/a/img")));
        actions.moveToElement(menuHoverLink).perform();
    }

    public void login() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']"))).sendKeys("wikiahomework");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))).sendKeys("wikiahomework1");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='login-button']"))).click();
        String text = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/wiki/User:Wikiahomework']"))).getText();
        System.out.println(text);
        Assert.assertEquals(text, "Wikiahomework");
    }

    public void contribute() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav[@class='wikia-menu-button contribute secondary combined']/img"))).click();
    }

    public void videoAdd() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/wiki/Special:WikiaVideoAdd']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='wpWikiaVideoAddUrl']"))).sendKeys("https://www.youtube.com/watch?v=qJNlsYh4sfw");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@name='quickaddform']/div/input"))).sendKeys(Keys.RETURN);
        /* I used the sendKeys method instead of click() as for some reason selenium refused to click on the Add btn despite seeing it. */
    }

    public void compare() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        String text = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/wiki/File:Braid_OST_-_Undercurrent']"))).getText();
        System.out.println(text);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/wiki/File:Braid_OST_-_Undercurrent']"))).click();
        text = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//header[@id='WikiaPageHeader']/h1"))).getText();
        System.out.println(text);
        Assert.assertEquals(text, "Braid OST - Undercurrent");
    }
}
