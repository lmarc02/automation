package main.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;


public class IndexPage extends main.pages.BasePage {
main.pages.BasePage basePage;
    public IndexPage(WebDriver driver) {
        super(driver);
    }

    public void waitForPageToLoad() {
    isElementDisplayed(By.className("homefeatured"));
    }

    public void addProductToTheCart() throws InterruptedException {
        waitForElementVisible(By.cssSelector("img[class^='logo']"));
        clickElement(By.cssSelector("img[class^='logo']"));

        waitForElementVisible(By.cssSelector(".product_img_link"));
        scrollToElement(driver.findElements(By.cssSelector(".product_img_link")).get(0));
        waitForElementVisible(By.cssSelector(".product_img_link"));
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElements(By.cssSelector(".product_img_link")).get(0)).build().perform();
        waitForElementVisible(By.cssSelector(".ajax_block_product .btn"));
        clickElement(driver.findElements(By.cssSelector(".ajax_block_product .btn")).get(0));
        waitForElementVisible(By.cssSelector(".layer_cart_row"));
    }

    public void clickProceedToCheckout(){
        WebElement proceedToCheckout = driver.findElement(By.cssSelector("a[title='Proceed to checkout']"));
        scrollToElement(proceedToCheckout);
        waitForElementVisible(By.cssSelector("a[title='Proceed to checkout']"));
        clickElement(By.cssSelector("a[title='Proceed to checkout']"));
    }


}
