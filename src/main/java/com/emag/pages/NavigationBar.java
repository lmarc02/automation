package com.emag.pages;

import com.emag.base.BasePageObj;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NavigationBar extends BasePageObj {

    private By MainnavBar = By.cssSelector("#masthead");
    private By mainSearchField = By.cssSelector("#searchboxTrigger");
    public By myAccountButton = By.id("my_account");
    private By navBarLogo = By.cssSelector(".navbar-brand");
    private By navBarFavoriteBtn = By.cssSelector("#my_wishlist");
    private By navBarMyCart = By.cssSelector("#my_cart");

    public NavigationBar(WebDriver driver) {
        super(driver);
    }
    public void waitForNavBarToLoad() {
        System.out.println("wait for navBar to load");
        waitForVisibilityOf(mainSearchField);
    }

    public MyAccountPage clickMyAccount(){
        findElementBy(myAccountButton).click();
        return new MyAccountPage(driver);
    }
    protected void openMyAccountMenu() {
        Actions builder = new Actions(driver);
        WebElement myAccount = driver.findElement(myAccountButton);
        builder.moveToElement(myAccount).perform();
    }
}
