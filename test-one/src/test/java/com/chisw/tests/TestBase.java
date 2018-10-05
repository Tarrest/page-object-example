package com.chisw.tests;

import com.chisw.appmanager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected final static ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    public static final String BASE_TITLE = "My Store";

    @BeforeClass
    public void setUp() {
        app.init();
    }

    @AfterClass
    public void tearDown() {
        app.stop();
    }


}
