package stepDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import testBase.BaseClass;

public class LoginPageSteps extends BaseClass{
	
	private BaseClass base;
	LoginPage loginPage = null;
	HomePage homePage;
	public LoginPageSteps(BaseClass base) {
		this.base = base;
	}
	
	@Given("^I navigate to url \"([^\"]*)\"$") 
	public void i_navigate_to_url_something(String baseURL) throws Throwable {
		homePage = new HomePage(base.driver);
		homePage = homePage.getHomePage(baseURL);
	}
	
	 @When("^I click on login link$") public void i_click_on_login_link() throws Throwable { 
		 loginPage = homePage.signinClick();	  
	  }
		  
	  @And("^I enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	  public void i_enter_username_something_and_password_something(String name, String userpassword) throws Throwable {
	     loginPage.userEmail(name);
	     loginPage.userPassword(userpassword);
	     System.out.println("The name is:" + name);
	     System.out.println("The password is:" + userpassword);
	  }
	
	  @And("^I click on login button$")
	  public void i_click_on_login_button() throws Throwable {
	
	  }
	
  
}
