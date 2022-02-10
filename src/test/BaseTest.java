import main.pages.Common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    WebDriver driver;
    private Common common;
    BaseTest(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Acer\\IdeaProjects\\Automation3\\src\\main\\geckodriver.exe");
        driver = new FirefoxDriver();
//        driver.manage().window().maximize();
        this.common = new Common(driver);
        common.goToUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @BeforeClass
   public void setUp() throws InterruptedException {
        common.logIn("lore@email.com", "password");
        Thread.sleep(10000);
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }




}
