package com.skillbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class TestChromeDriver {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        String userAgent = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.517 Safari/537.36";
        options.addArguments(String.format("user-agent=%s", userAgent));
        options.addArguments("start-maximized");
        options.addArguments("--disable-blink-features=AutomationControlled");
        System.setProperty("webdriver.chrome.driver", "/Users/aruytehno/IdeaProjects/phone-verification/src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
        driver.get("http://www.beeline.ru/");
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

//        System.out.println(driver.findElement(By.className("zodJeH")).getTagName());
        driver.findElement(By.className("zodJeH")).click();
        System.out.println(driver.getPageSource());
        driver.close();
    }
}
