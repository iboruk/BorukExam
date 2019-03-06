package parentTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.InstallationPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class ParentTest {
    public WebDriver webDriver;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected InstallationPage instPage;
//
    @Before
    public void setUp() {
//        File file = new File("./src/drivers/chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        webDriver = new ChromeDriver(); // create object for chrome
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        instPage = new InstallationPage(webDriver);
    }

    @After
    public void tearDown() {
       // webDriver.quit();
    }

    protected void checkExpectedResult (String message, boolean actualResult){
        Assert.assertEquals(message, true, actualResult); // if actualResult = false, than true<>false -> print message
    }

    public void doLogin(String userName, String userPassword){
        loginPage.openPage();
        loginPage.enterTextInToInputLogin(userName);
        loginPage.enterTextInToInputPass(userPassword);
        loginPage.clickOnButtonSubmit();
    }
}
