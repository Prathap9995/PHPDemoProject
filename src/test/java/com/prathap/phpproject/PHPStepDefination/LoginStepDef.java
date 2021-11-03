package com.prathap.phpproject.PHPStepDefination;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.junit.runner.RunWith;

import com.prathap.phpproject.Objects.HomePage;
import com.prathap.phpproject.Objects.LoginPage;
import com.prathap.phpprojectResources.BasePHP;

import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

public class LoginStepDef extends BasePHP{

	@Before
	public void Initilization() throws IOException {
		driver = InitializeWebDriver();
	}
	

	    @Given("^Go to \"([^\"]*)\"$")
	    public void go_to_something(String strArg1) throws Throwable {
	        driver.get("https://phptravels.com/demo");
	    }

	

	    @Then("^Navigate to next page only if it is a valid credential$")
	    public void navigate_to_next_page_only_if_it_is_a_valid_credential() throws Throwable {
	    Set<String> win = driver.getWindowHandles();
	   Iterator<String> winit= win.iterator();
	   while(winit.hasNext()) {
		   driver.switchTo().window(winit.next());
	   }
	    }

	    @And("^Click on Login button$")
	    public void click_on_signin_button() throws Throwable {
	    	 HomePage hp = new HomePage(driver);
		        hp.LoginButton().click();
	        
	    }

	    @And("^Enter credentials (.+) and (.+)$")
	    public void enter_credentials_and(String username, String password) throws Throwable {
	        LoginPage log = new LoginPage();
	        log.Email().sendKeys(username);
	        log.Password().sendKeys(password);
	    }

	    @And("^Click on Not robot icon$")
	    public void click_on_not_robot_icon() throws Throwable {
	       LoginPage ln = new LoginPage(); 
	    	try {
	        	ln.SignIn().click();
	        }
	    	catch(Exception e) {
	    		System.out.println("Unable to read captcha");
	    	}
	    }

	    @And("^If not get error message$")
	    public void if_not_get_error_message() throws Throwable {
	        LoginPage err = new LoginPage();
	     String errstring =    err.Error().getText();
	     System.out.println(errstring);
	    }

	    @And("^If navigates then get page title$")
	    public void if_navigates_then_get_page_title() throws Throwable {
	        driver.getTitle();
	    }

	    @And("^close the browser$")
	    public void close_the_browser() throws Throwable {
	        driver.quit();
	    }

	}


