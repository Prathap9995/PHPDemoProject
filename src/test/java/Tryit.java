import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.HomePage;
import Resources.BasePHP;
import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Tryit extends BasePHP{
	public WebDriver driver;
	public HomePage hp;
	public Properties pro;
	
	
	
	@BeforeTest
	 public void initialize() throws IOException {
		driver = InitializeWebDriver();	
		driver.get("https://phptravels.com/demo/");
		
		}

  @Test
  public void Navigate() {
	  
	 HomePage pg = new HomePage(driver);
	
String str =	 pg.Title().getText();
System.out.println(str);
	  
  }
  @Test
  public void MouseOver() {
	  HomePage home = new HomePage(driver);
	  Actions a = new Actions(driver);
      a.moveToElement(home.Mouse()).build().perform();
  }

  @Test
  public void SelectOpt() {
	  HomePage hm = new HomePage(driver);
	  WebElement mouse = hm.Mouse();
      List<WebElement> Ls = (List<WebElement>) hm.List();
      for( WebElement lt : Ls) {
    	  if(lt.equals("Hotels  Module")) {
    		  lt.click();
    	  }
      }
  }
	
		@Test
		public void NavigateBack() {
			driver.navigate().back();
			
		}
		
		public void SelFistEle() {
			 hp.Link().click();
		}
		
		public void NextWindow() {
			Set<String> tab=    driver.getWindowHandles();
			  Iterator<String> it = tab.iterator();
			  while(it.hasNext()){
			  driver.switchTo().window(it.next());}
		}

		@After
		public void CloseAllWindow() {
			driver.quit();
		}

}
