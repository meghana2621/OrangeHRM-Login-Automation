package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	private WebDriver driver;
	
	private By usernameTextBox = By.xpath("//input[@name='username']");
	private By passwordTextBox = By.xpath("//input[@name='password']");
    private By loginButton     = By.xpath("//button[@type='submit']");
    private By errorMessage    = By.cssSelector(".oxd-alert-content-text");
    private By requiredFieldError = By.cssSelector(".oxd-input-field-error-message");
    
    public LoginPage(WebDriver driver) {
    	this.driver=driver;
    }
    
    public void enterUserName(String username) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameTextBox));
        driver.findElement(usernameTextBox).sendKeys(username);
        System.out.println("Entered username: " + username);
    }
    public void enterPassword(String password) {
    	driver.findElement(passwordTextBox).clear();
    	driver.findElement(passwordTextBox).sendKeys(password);
    	 System.out.println("Entered password: " + password);
    }
    
    public void clickLogin() {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         WebElement button = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
         button.click();
         System.out.println("Clicked Login button");
    }
    
    public String getErrorMessage() {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         WebElement error = wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
         String msg = error.getText();
         System.out.println("Error message displayed: " + msg);
         return msg;
    }
    public String getErrorMessageForRequired() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement error = wait.until(ExpectedConditions.visibilityOfElementLocated(requiredFieldError));
        return error.getText();
    }
}
