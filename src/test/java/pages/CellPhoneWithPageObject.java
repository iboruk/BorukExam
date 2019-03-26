package pages;

import org.junit.Test;
import parentTest.ParentTest;

import static org.junit.Assert.*;

public class CellPhoneWithPageObject extends ParentTest {
    @Test
    public void installationPageOpen(){
        doLogin("Student", "909090");
        instPage.goToInstallationPage();
    }

    @Test
    public void editInstallationPage(){
        doLogin("Student", "909090");
        instPage.goToInstallationPage();
        instPage.clickPlus(); // go to InstallationEdit page
        //instPage.selectItemForEditing();
        instPage.clickPlus(); // go to Installed_spares/edit page
        instPage.clickCheckBox();
    }
}