package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pages.LoginPage;

public class HomePage {
	public WebDriver driver;
    @FindBy(xpath = "//a[@href='/sign_in']")
    public WebElement signinClick;
    
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    
    public HomePage getHomePage(String baseURL) {
    	this.driver.get(baseURL);
    	return PageFactory.initElements(driver, HomePage.class); 
    }
   
    public LoginPage signinClick() {
    	signinClick.click();
    	return PageFactory.initElements(driver, LoginPage.class);     
    }
    
}
