package com.emag.pages;

import com.emag.base.BasePageObj;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexPage extends BasePageObj {
    public By leftNavigationMenu = By.cssSelector(".megamenu-list");


    public IndexPage(WebDriver driver) {
        super(driver);
    }

    public boolean isElementDisplayed(By element){
        return findElementBy(element).isDisplayed();
    }

    public void waitForIndexPageToLoad(){
        System.out.println("waiting for Index page to load");
        waitForVisibilityOf(leftNavigationMenu);

    }

}
