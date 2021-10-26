package CucStep;

import java.util.Iterator;
import java.util.Set;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Objects.HomePage;
import Resources.BasePHP;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefPHP extends BasePHP{
	public HomePage hp;

    @Given("^Land on the \"([^\"]*)\"$")
    public void land_on_the_something(String strArg1) throws Throwable {
    	driver = InitializeWebDriver();
    	driver.get(strArg1);
        
    }

    @When("^Check for page title$")
    public void check_for_page_title() throws Throwable {
       HomePage hp = new HomePage(driver);
  String str =  hp.Title().getText();
  System.out.println(str);       
    }

    @Then("^Navigate back to home page$")
    public void navigate_back_to_home_page() throws Throwable {
        driver.navigate().back();
    }

    @And("^Do mouse over on Product list$")
    public void do_mouse_over_on_product_list() throws Throwable {
        Actions a = new Actions(driver);
        a.moveToElement(hp.Mouse()).build().perform();
        
      
    }

    @And("^Select desired options for dropdown$")
    public void select_desired_options_for_dropdown() throws Throwable {
       WebElement mouse = hp.Mouse();
       Select sel = new Select(mouse);
       sel.selectByVisibleText("Hotels Module");
    }

    @And("^Click on First element $")
    public void click_on_first_element() throws Throwable {
        hp.Link().click();
    }

    @And("^Move to next tab$")
    public void move_to_next_tab() throws Throwable {
    Set<String> tab=    driver.getWindowHandles();
  Iterator<String> it = tab.iterator();
  driver.switchTo().window(it.next());
    }

}