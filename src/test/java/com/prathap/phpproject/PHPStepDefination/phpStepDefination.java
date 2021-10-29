package com.prathap.phpproject.PHPStepDefination;





import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.prathap.phpproject.Objects.HomePage;
import com.prathap.phpprojectResources.BasePHP;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java8.PendingException;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)

public class phpStepDefination extends BasePHP {
	
	@Before
	public void InitializeDriver() throws IOException {
	driver = InitializeWebDriver();
	}

	    @Given("^Navigate to the website \"([^\"]*)\"$")
	    public void navigate_to_the_website_something(String strArg1) throws Throwable {
	        driver.get(strArg1);
	    }

	    @When("^Do Mouseover action on a dropdown option$")
	    public void do_mouseover_action_on_a_dropdown_option() throws Throwable {
	       HomePage pg = new HomePage(driver);
	       Actions a = new Actions(driver);
	       a.moveToElement(pg.Mouse());
	    }

	    @Then("^Navigate back to Home page$")
	    public void navigate_back_to_home_page() throws Throwable {
	        driver.navigate().back();
	    }

	    @And("^Get pageTitle$")
	    public void get_pagetitle() throws Throwable {
	      HomePage hm = new HomePage(driver);
	    System.out.println(hm.Title().getText());
	    }

	    @And("^Click on any options$")
	    public void click_on_any_options() throws Throwable {
	    	HomePage he = new HomePage(driver);
	    	try {	
	    		 he.Mouse().click();
	    		//  Thread.sleep(5000);
	    		 driver.findElement(By.xpath("//div[@class='lvl-0 dropdown open']/div[1]/a[2]")).click();
	    			String url = driver.getCurrentUrl();
	    			System.out.println(url);
	    		}
	    		catch(Exception e) {
	    			System.out.println("No such Element");
	    		}
	    	  }
	    

	    @And("^Get current url$")
	    public void get_current_url() throws Throwable {
	     System.out.println(driver.getCurrentUrl());
	    }

	    @And("^Click on the first link and move to next tab$")
	    public void click_on_the_first_link_and_move_to_next_tab() throws Throwable {
	    	HomePage hp = new HomePage(driver);
			
			Thread.sleep(5000);
//			WebDriverWait wait = new WebDriverWait(driver, 10);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-md-12 form-group']/div[1]/a[@href='//www.phptravels.net']")));
		try {

		hp.Link().click();}
		catch(Exception e){
			System.out.println("Element not Visible");
		}
		Set<String> tab = driver.getWindowHandles();
		Iterator<String> it = tab.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
		}
	    }

	    @And("^Get current page title$")
	    public void get_current_page_title() throws Throwable {
	       System.out.println(driver.getTitle());
	    }

	    @And("^Close all open window$")
	    public void close_all_open_window() throws Throwable {
	       driver.quit();
	    }

	}


