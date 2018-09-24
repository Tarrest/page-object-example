package com.chisw.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.BrowserType;

public class ApplicationManager {

    WebDriver driver;
    private String browser;
    private LoginPageHelper loginPageHelper;
    private CustomersPageHelper customersPageHelper;
    private MainPageHelper mainPageHelper;
    private AddNewCustomerPageHelper addNewCustomerPageHelper;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        if (browser.equals(BrowserType.FIREFOX)) {
            FirefoxOptions options = new FirefoxOptions();
            options.setCapability("unexpectedAlertBehaviour", "dismiss");
            driver = new FirefoxDriver(options);
        } else if (browser.equals(BrowserType.CHROME)) {
            ChromeOptions options = new ChromeOptions();
            options.setCapability("unexpectedAlertBehaviour", "dismiss");
            driver = new ChromeDriver(options);
        } else if (browser.equals(BrowserType.EDGE)) {
            EdgeOptions options = new EdgeOptions();
            options.setCapability("unexpectedAlertBehaviour", "dismiss");
            driver = new EdgeDriver(options);
        }
        loginPageHelper = new LoginPageHelper(driver);
        customersPageHelper = new CustomersPageHelper(driver);
        mainPageHelper = new MainPageHelper(driver);
        addNewCustomerPageHelper = new AddNewCustomerPageHelper(driver);
        driver.manage().window().maximize();
    }

    public void stop() {
        driver.close();
    }

    public LoginPageHelper loginPage() {
        return loginPageHelper;
    }

    public CustomersPageHelper customersPage() {
        return customersPageHelper;
    }

    public MainPageHelper mainPage() {
        return mainPageHelper;
    }

    public AddNewCustomerPageHelper addNewCustomerPage() {
        return addNewCustomerPageHelper;
    }

}
