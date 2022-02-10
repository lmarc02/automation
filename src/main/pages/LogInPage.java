package main.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage extends BasePage {
    public LogInPage(WebDriver driver) {
        super(driver);
    }
    public void waitForPageToLoad() {
        waitForElementVisible(By.id("SubmitCreate"));
    }
    public static String getCurrentDate(){
        return "";
    }
    public String getCreateAnAccountBtnText() {
        waitForElementVisible(By.id("SubmitCreate"));
        return getElementText(By.id("SubmitCreate"));
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
    public void logIn(String email, String password){
        waitForElementVisible(By.id("email"));
        typeIntoField(email, By.id("email"));
        typeIntoField(password, By.id("passwd"));
        clickElement(By.id("SubmitLogin"));
    }

}
