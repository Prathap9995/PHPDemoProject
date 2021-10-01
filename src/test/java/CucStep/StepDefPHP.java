package CucStep;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;

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

    @Given("^Land on the \"([^\"]*)\"$")
    public void land_on_the_something(String strArg1) throws Throwable {
    	driver = InitializeWebDriver();
    	driver.get(strArg1);
        
    }

    @When("^Check for page title$")
    public void check_for_page_title() throws Throwable {
       HomePage hp = new HomePage(driver);
    hp.Title();
       
    }

    @Then("^Navigate back to home page$")
    public void navigate_back_to_home_page() throws Throwable {
        throw new PendingException();
    }

    @And("^Do mouse over on Product list$")
    public void do_mouse_over_on_product_list() throws Throwable {
        throw new PendingException();
    }

    @And("^Select desired options for dropdown$")
    public void select_desired_options_for_dropdown() throws Throwable {
        throw new PendingException();
    }

    @And("^Click on First element $")
    public void click_on_first_element() throws Throwable {
        throw new PendingException();
    }

    @And("^Move to next tab$")
    public void move_to_next_tab() throws Throwable {
        throw new PendingException();
    }

}