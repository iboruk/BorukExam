package pages;

import org.junit.Test;
import parentTest.ParentTest;

public class LoginWithPageObject extends ParentTest {
    @Test
    public void validLogin(){
        doLogin("Student", "909090");
        checkExpectedResult("Avatar is not presented", homePage.isAvatarPresent()
        );
    }
    @Test
    public void invalidLogin(){
        doLogin("tttt", "909090");
        checkExpectedResult("Avatar should not be presented", !homePage.isAvatarPresent());
    }
}
