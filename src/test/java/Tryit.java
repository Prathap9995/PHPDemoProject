import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.HomePage;
import Resources.BasePHP;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Tryit extends BasePHP{
	public WebDriver driver;
	
	
	@BeforeTest
	 public void initialize() throws IOException {
		driver = InitializeWebDriver();	
		}

  @Test
  public void Navigate() {
	 HomePage pg = new HomePage(driver); 
String str =	 pg.Title().getText();
System.out.println(str);
	  
  }

	
		

}
