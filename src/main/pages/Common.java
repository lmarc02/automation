package main.pages;
import org.openqa.selenium.WebDriver;


public class Common {
    private WebDriver driver;
    public Common(WebDriver driver) {
      this.driver = driver;
    }


    public void logIn(String email, String password){
       LogInPage logInPage = new LogInPage(driver);
        logInPage.logIn(email,password);
    }

    public void goToUrl(String url){
        driver.get(url);
    }

// register, create order, cancel order etc

}
