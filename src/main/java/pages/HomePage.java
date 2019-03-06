package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }


    @FindBy(xpath = ".//*[@class='pull-left image']")
    private WebElement avatar;

    public boolean isAvatarPresent() {
//        try {
//            return avatar.isDisplayed();
//        } catch (Exception e) {
//            return false;
//        }
        return actionsWithOurElements.isElementPresent(avatar);
    }

}