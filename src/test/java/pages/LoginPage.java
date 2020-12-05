package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class LoginPage extends BaseClass{
	public WebDriver driver;

    @FindBy (xpath = "//input[@id = 'user_email']")
    public WebElement userEmail;
    @FindBy(xpath = "//input[@id = 'user_password']")
    public WebElement userPassword;
   
 
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void userEmail(String name) {
    	userEmail.sendKeys(name);
    	    	
    }
    
    public void userPassword(String userpassword) {
    	userPassword.sendKeys(userpassword); 	    	
    }

}
