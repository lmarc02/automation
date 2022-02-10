
import main.pages.AccountPage;
import org.testng.Assert;

public class AccountTest extends BaseTest {
    AccountPage accountTest = new AccountPage(driver);

    @org.testng.annotations.Test
    public void checkMyAccountPageElements(){
        Assert.assertEquals(accountTest.isCartDisplayed(), true, "Shopping cartPage is not displayed");
        Assert.assertEquals(accountTest.getHeadingText(), "MY ACCOUNT", "Incorrect heading text on Authentication page.");
        Assert.assertEquals(accountTest.isHeadingTextDisplayed(), true, "Authentication heading text is not displayed.");
    }



}

