package com.adidas.test;

import com.adidas.TestBaseAdidas;
import com.adidas.pages.AdidasHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicNavigationWithTestNG extends TestBaseAdidas {

    @Test
    public void testNavigation(){

        AdidasHomePage homePage = new AdidasHomePage();

        homePage.Laptops.click();

        wait.until(ExpectedConditions.visibilityOf((homePage.sonyI5)));

        Assert.assertTrue(homePage.sonyI5.isDisplayed());
        System.out.println("homePage.sonyI5.isDisplayed() = " + homePage.sonyI5.isDisplayed());

//        String title = driver.getTitle();
//
//        System.out.println("title = " + title);
    }
}
