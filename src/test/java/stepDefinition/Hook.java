package stepDefinition;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import testBase.BaseClass;
import util.testUtil;

public class Hook extends BaseClass{

	
	public BaseClass base;
	
	public Hook(BaseClass base) 
	{
		this.base = base;
	}
	
    @Before()
    public void initialiseDriver() {
        base.driver = new ChromeDriver();
        base.driver.manage().window().maximize();
        base.driver.manage().timeouts().pageLoadTimeout(testUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        base.driver.manage().timeouts().implicitlyWait(testUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
    }
    
    @After()
    public void tearDown(){
    	base.driver.quit();
    }
}
