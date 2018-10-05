package com.chisw.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseHelper {

    public static final String BASE_URL = "http://localhost/litecart/admin";
    public static final String BASE_USER = "admin";
    public static final String BASE_PASS = "admin";

    WebDriver driver;

    public BaseHelper(WebDriver driver) {
        this.driver = driver;
    }

    protected void click(WebElement element) {
        element.click();
    }

    protected void type(WebElement element, String text) {
        click(element);
        element.clear();
        element.sendKeys(text);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void open(String url) {
        driver.navigate().to( BASE_URL + url);
    }


}
