package com.emag.pages;

import com.emag.base.BasePageObj;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePageObj {

    private By MyAccMaleGenderRadio = By.cssSelector("#accountGenderMale");
    private By MyAccFemaleGenderRadio = By.cssSelector("#accountGenderFemale");
    private By myAccountNameField = By.cssSelector(".gui-form-control.-wide");

    public MyAccountPage(WebDriver driver){
        super(driver);
    }

    public void waitForMyAccountPageToLoad(){
        System.out.println("waiting for MyAccount page to load");
        waitForVisibilityOf(myAccountNameField, 30);
    }


    public String getNameFieldText(){
        return getText(myAccountNameField);
    }
}

























