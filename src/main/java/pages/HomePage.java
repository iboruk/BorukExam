package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }


    @FindBy(xpath = ".//*[@class='name ellipsis']") //  and contains(text(), 'BorukG38')")
    private WebElement avatar;


    public void openHomePage() {
        try {
            webDriver.get("https://hotline.ua/");
            logger.info("Login page was opened");
        } catch (Exception e) {
            logger.error("Can not open Login page " + e); // for logger
            Assert.fail("Can not open Login page " + e); // for report
        }
    }



    public boolean isAvatarPresent() {
//        try {
//            return avatar.isDisplayed();
//        } catch (Exception e) {
//            return false;
//        }
        return actionsWithOurElements.isElementPresent(avatar);
    }

}
