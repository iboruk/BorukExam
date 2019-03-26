package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CellPhonePage extends ParentPage {

    @FindBy(id = "installed_spares_lastSpareIsGood")
    private WebElement clickChekBoxOn;

    public CellPhonePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "installation")
    private WebElement clickInsallationItem;

    @FindBy(xpath = "//i[@class='fa fa-plus']")
    private WebElement clickPlus;

    @FindBy(xpath = "//tr[@onclick]")
    private WebElement clickForEdit;


    public void goToInstallationPage() {
        actionsWithOurElements.clickOnElement(clickInsallationItem);
    }
    public void clickPlus() {
        actionsWithOurElements.clickOnElement(clickPlus);
    }

    public void selectItemForEditing() {
        actionsWithOurElements.clickOnElement(clickForEdit);
    }


    public void clickCheckBox() {
        actionsWithOurElements.clickCheckBox(clickChekBoxOn);
    }
}
