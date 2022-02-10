package main.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {
    public AccountPage(WebDriver driver) {
        super(driver);
    }
    public void waitForPageToLoad() {
        waitForElementVisible(By.cssSelector("a[href$='controller=my-account']"));
    }
    public boolean isCartDisplayed(){
        waitForElementVisible(By.className("shopping_cart"));
        return isElementDisplayed(By.className("shopping_cart"));
    }
    public String getHeadingText(){
        waitForElementVisible(By.className("page-heading"));
        return getElementText(By.className("page-heading"));
    }
    public boolean isHeadingTextDisplayed(){
        waitForElementVisible(By.className("page-heading"));
        return isElementDisplayed(By.className("page-heading"));
    }
}
