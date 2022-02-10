package com.emag;
import com.emag.base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class FirstTest extends BaseTest {


        @Test
        public void FirstTestMethod(){

            WebDriver driver = new FirefoxDriver();

            //open emag.ro
            driver.get("https://www.emag.ro/");
            System.out.println("emag opened. Test passed");

        }


}
