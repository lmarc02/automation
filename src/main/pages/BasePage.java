package main.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void typeIntoField(String text, By selector){
        driver.findElement(selector).sendKeys(text);
    }
    public void clickElement(By selector){
        driver.findElement(selector).click();
    }
    public void clickElement(WebElement selector){
        selector.click();
    }

    public void waitForElementVisible(By selector) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
    }
    public String getElementText(By selector){
        return driver.findElement(selector).getText();
    }
    public boolean isElementDisplayed(By selector){
        return driver.findElement(selector).isDisplayed();
    }
    public void closeBrowser(){
        driver.close();
    }
    public void selectDropdown(By selector, String text){
        Select dropdown = new Select(driver.findElement(selector));
        dropdown.selectByValue(text);
    }
    public void scrollToElement(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
