package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.BasePHP;

public class HomePage extends BasePHP {
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="PHPTRAVELS")
	WebElement PageTitle;
	
	
	
	public WebElement Title() {
		return PageTitle;
	}

}
