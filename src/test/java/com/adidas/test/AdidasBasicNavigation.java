package com.adidas.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdidasBasicNavigation {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com/index.html");

        WebDriverWait wait = new WebDriverWait(driver,10);

        WebElement locatorLaptop = driver.findElement(By.xpath("//a[.='Laptops']"));


        String title = driver.getTitle();
        System.out.println("title = " + title);

        driver.close();
    }
}
