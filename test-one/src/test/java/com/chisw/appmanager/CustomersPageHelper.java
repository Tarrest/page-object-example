package com.chisw.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomersPageHelper extends BaseHelper {

    @FindBy(xpath = "//a[@class='button']")
    private WebElement createCustomerBtn;

    public CustomersPageHelper(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickCreateCustomer() {
        click(createCustomerBtn);
    }


}
