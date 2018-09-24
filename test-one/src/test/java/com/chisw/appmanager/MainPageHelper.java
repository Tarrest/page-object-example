package com.chisw.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPageHelper extends BaseHelper {

    public MainPageHelper(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
