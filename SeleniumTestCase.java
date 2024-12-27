// Maven Dependency Issues.
package tests;

import base.BaseTest;
import org.example.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginWithValidCredentials() {
        WebDriver driver;
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("validUsername", "validPassword");

        // Add assertions to verify if the login is successful
        // Example: Check if a logout button appears or the user is redirected
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }

    @Test
    public void testLoginWithInvalidCredentials() {
        WebDriver driver;
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("invalidUsername", "invalidPassword");

        // Check if an error message appears
        WebElement errorMessage = driver.findElement(By.id("error"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }
}
