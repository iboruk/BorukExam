package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class ActionsWithOurElements {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());

    public ActionsWithOurElements(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void enterTextInToElement(WebElement element, String text) {
        try {
            element.clear();
            element.sendKeys(text);
            logger.info(text + " was input into element");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    private void printErrorAndStopTest(Exception e) {
        logger.error("Cannot work with element" + e);
        Assert.fail("Cannot work with element" + e);
    }

    public void clickOnElement(WebElement element) {
        try {
            element.click();
            logger.info(element + " was clicked");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public boolean isElementPresent(WebElement element) {
        try {
            boolean isDisplayed = element.isDisplayed();
            logger.info("Element " + element + " is displayed = " + isDisplayed);
            return isDisplayed;
        } catch (Exception e) {
            logger.info("Element is displayed = FALSE");
            return false;
        }
    }

    public void selectTextInDropdown(WebElement element, String text) {
        try {
            Select select = new Select(element);
            select.selectByVisibleText(text);
            logger.info(text + "was selected in dropdown");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public void selectValueInDropdown(WebElement element, String value) {
        try {
            Select select = new Select(element);
            select.selectByValue(value);
            logger.info(value + "was selected in dropdown");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public void clickCheckBox(WebElement element) {
        try {
           // Select select = new Select(element);
            if (!element.isSelected()) {
                clickOnElement(element);
                logger.info(element + "checkbox was clicked");
            }
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }


    }
}
