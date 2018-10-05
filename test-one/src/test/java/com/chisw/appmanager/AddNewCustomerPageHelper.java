package com.chisw.appmanager;

import com.chisw.data.CustomersData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPageHelper extends BaseHelper {

    @FindBy(name = "company")
    private WebElement companyInput;

    @FindBy (name = "firstname")
    private WebElement firstnameInput;

    @FindBy (name = "lastname")
    private WebElement lastnameInput;

    @FindBy (name = "save")
    private WebElement saveCustomer;

    public AddNewCustomerPageHelper(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillAndSendCustomerForm(CustomersData customersData){
        type(firstnameInput, customersData.getFirstName());
        type(lastnameInput, customersData.getSecondName());
        type(companyInput, customersData.getCompany());
    }

    public void submitCustomer() {
        click(saveCustomer);
    }

}
