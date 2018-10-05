package com.chisw.tests;

import com.chisw.data.CustomersData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCustomersActions extends TestBase {


    @Test
    public void checkLoginToAdminPanel() {
        app.loginPage().open("/login.php");
        app.loginPage().loginAsAdmin();
        Assert.assertTrue(app.mainPage().getPageTitle().contains(BASE_TITLE));
    }


    @Test(dependsOnMethods = "checkLoginToAdminPanel")
    public void checkCreatingUser() throws InterruptedException {
        app.mainPage().open("/?app=customers&doc=customers");
        Assert.assertTrue(app.customersPage().getPageTitle().contains("Customers"));
        int before = app.customersPage().getCustomersCount();
        app.customersPage().clickCreateCustomer();
        app.addNewCustomerPage().fillAndSendCustomerForm(new CustomersData("John1", "Rembo1", "War Inc."));
        app.addNewCustomerPage().submitCustomer();
        int after = app.customersPage().getCustomersCount();
        Assert.assertEquals(after, before + 1);
    }

    @Test
    public void checkDisableUser() {

    }

}
