package com.emag.pages;

import com.emag.base.BasePageObj;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePageObj<LogInPage> {

    private static final String URL = "https://www.emag.ro/user/login?not-keep=true";

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailField;

    private By emailFild = By.xpath("//input[@id='email']");
    private By passwordFild = By.xpath("//input[@id='password']");
    private By signInButton = By.xpath("//button[@class='gui-btn auth-btn-primary auth-submit']");
    private By LogInPageEmagLogo = By.className("auth-logo");
    private By LogInPageSalut = By.xpath("//div[contains(@class, 'step1')]/h1");
    // check with evaluate expresion driver.findElement()
    private By LogInPageGuidMsj = By.cssSelector(".gui-form-row.step1 > p" );
    //  By.xpath("//div[@class= 'gui-form-row step1']/p");
    private By LogInPageLogInFbBtn = By.cssSelector(".social-name");
    private By LogInPageLogInGgleBtn = By.cssSelector(".social-google.linkItem.googleV2Login");
    private By LogInPageHelpBtn = By.cssSelector(".auth-center.large-margin > a");
    private By LogInPageClientInfPersonalDataCookie = By.cssSelector("#links");

    public LogInPage(WebDriver driver){
        super(driver);
    }

    public void openLogInPage(){
        getPage(URL);
    }

    public void fillUpEmail(String email){
        typeIntoField(email, emailFild);
    }

    public void fillUpPassword(String password){
        waitForVisibilityOf(passwordFild);
        typeIntoField(password, passwordFild);
    }

    protected void click(By element){
        findElementBy(element).click();
        }

    public MyAccountPage pushSignInButton(){
        System.out.println("clicking on Sign in button");
        click(signInButton);
        return  new MyAccountPage(driver);
    }

}
