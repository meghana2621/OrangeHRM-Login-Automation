package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;
import utils.TestListener;

@Listeners(TestListener.class)
public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        LoginPage login = new LoginPage(driver);
        login.enterUserName("Admin");
        login.enterPassword("admin123");
        login.clickLogin();
        System.out.println("Login successful...");
    }

    @Test
    public void testInvalidPassword() {
        LoginPage login = new LoginPage(driver);
        login.enterUserName("Admin");
        login.enterPassword("wrongpass");
        login.clickLogin();
        String error = login.getErrorMessage();
        Assert.assertTrue(error.contains("Invalid"), "Error message not displayed!");
        System.out.println("Invalid login test case passed"); 
    }
    
    @Test
    public void testBlankUsername() {
        LoginPage login = new LoginPage(driver);
        login.enterUserName("");
        login.enterPassword("admin123");
        login.clickLogin();
        String error = login.getErrorMessageForRequired();
        Assert.assertTrue(error.contains("Required"), "Error message not displayed for blank username!");
    }
}
