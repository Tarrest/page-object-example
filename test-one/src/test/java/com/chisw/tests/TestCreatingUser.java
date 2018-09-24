package com.chisw.tests;

import com.chisw.appmanager.LoginPageHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.chisw.data.Constants.BASE_TITLE;

public class TestCreatingUser extends TestBase {

    @Test
    public void checkCreatingUser() {
        app.loginPage().open("/login.php");
        app.loginPage().loginAsAdmin();
        Assert.assertTrue(app.mainPage().getPageTitle().contains(BASE_TITLE));
        app.mainPage().open("/?app=customers&doc=customers");
        Assert.assertTrue(app.customersPage().getPageTitle().contains("Customers"));
        app.customersPage().clickCreateCustomer();
        app.addNewCustomerPage().fillAndSendCustomerForm();
    }

}
