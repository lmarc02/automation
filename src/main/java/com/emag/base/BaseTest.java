package com.emag.base;

import com.emag.pages.LogInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {
   protected WebDriver driver;



    @BeforeClass
    protected void setUp(){
        System.out.println("Set up test class");
        System.setProperty("webdriver.gecko.driver", "src\\geckodriver.exe");
        driver = new FirefoxDriver();
        logIn("loredanamarc15@gmail.com", "gameea4");
    }
    @AfterClass
    protected void tearDown(){
        System.out.println("Tear down test class");
        // todo: add logOut method
        driver.quit();
    }

    protected void logIn(String email, String password){
        LogInPage logInPage = new LogInPage(driver);
        logInPage.openLogInPage();
        logInPage.fillUpEmail(email);
        logInPage.pushSignInButton();
        logInPage.fillUpPassword(password);
        logInPage.pushSignInButton();
    }

}
