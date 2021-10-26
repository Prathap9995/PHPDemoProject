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
	WebElement  PageTitle;
	
	@FindBy(xpath="//div[@class='lvl-0 dropdown'][1]")
	WebElement Mouse;
	
	
	@FindBy(linkText="https://www.phptravels.net/")
	WebElement Link;
	
	@FindBy(xpath= "//nav[@class='clearfix']/div[1]/div[1]")
	WebElement List;
	
	public WebElement Title() {
		return PageTitle;
	}
	
	public WebElement Mouse() {
		return Mouse;
	}
	
	public WebElement Link() {
		return Link;
	}
	
	public WebElement List() {
		return List;
	}

}
