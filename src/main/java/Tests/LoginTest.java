package Tests;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Util.Utils;

public class LoginTest {

    private static final WebDriver driver = new ChromeDriver();

    @BeforeTest
    public  void setup() {
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
    }

    @Test(description = "Validate Login")
    public static void ValidateLoginTest(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserName(Utils.userName);
        loginPage.enterPassword(Utils.password);
        loginPage.pressSubmitButton();
    }

    @AfterTest
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }

}
