package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//import org.openqa.selenium.By;


public class LoginPage extends ParentPage {

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//*[@class='name' and contains(text(), 'Вход')]")
    private WebElement enterButton;

    @FindBy (xpath = ".//*[@class='h3' and contains(text(), 'Вход')]")
    private WebElement enterElement;

    @FindBy(xpath = ".//*[@name='login']") //(name = "login")
    private WebElement inputLogin; // object should create after new

    @FindBy(name = "password")
    private WebElement inputPass;

    @FindBy(xpath = ".//*[@class='btn-graphite btn-cell' and @type='submit']")
    private WebElement button;



    public void callLoginPage() {
        actionsWithOurElements.clickOnElement(enterButton);
        actionsWithOurElements.isElementPresent(enterElement);
    }

    public void enterTextInToInputLogin(String login) {
//        try{
//            inputLogin.clear();
//            inputLogin.sendKeys(login);
//            System.out.println("Login was input");
//        }catch (Exception e){
//            System.out.println("Can not work with element " +e);
//            Assert.fail("Can not open Login page " + e);
//        }

        actionsWithOurElements.enterTextInToElement(inputLogin, login);
    }

    public void enterTextInToInputPass(String pass) {
//        try{
//            inputPass.clear();
//            inputPass.sendKeys(pass);
//            System.out.println("Password was input");
//        }catch (Exception e){
//            System.out.println("Can not work with element " +e);
//            Assert.fail("Can not open Login page " + e);
//        }
        actionsWithOurElements.enterTextInToElement(inputPass, pass);
    }

    public void clickOnButtonSubmit() {
        try {
            button.click();
            logger.info("Button Submit was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element " + e);
            Assert.fail("Can not open Login page " + e);
        }
    }

    public void clickOnElements() {
        actionsWithOurElements.clickOnElement(button);
    }
}
