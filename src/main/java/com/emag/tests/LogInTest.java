package com.emag.tests;

import com.emag.base.BaseTest;
import com.emag.pages.MyAccountPage;
import com.emag.pages.NavigationBar;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {
    @Test
    public void positiveLogInTest(){

        NavigationBar navigationBar = new NavigationBar(driver);
        MyAccountPage myAccountPage = navigationBar.clickMyAccount();
        myAccountPage.waitForMyAccountPageToLoad();
        //verifications
        //verify title eMAG Favorites
        System.out.println("verification");

        //correct name
       // Assert.assertEquals(myAccountPage.getNameFieldText(), "Date Personale"," name field value is not expected");
    }
}




















