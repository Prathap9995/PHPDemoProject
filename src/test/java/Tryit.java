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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.HomePage;
import Resources.BasePHP;
import io.cucumber.java.After;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class Tryit extends BasePHP {
	public WebDriver driver;

	public Properties pro;
	public Actions a;

	@BeforeTest
	public void initialize() throws IOException {
		driver = InitializeWebDriver();
		//driver.get("https://phptravels.com/demo/");

	}

	@Test
	public void Navigate() {

		HomePage pg = new HomePage(driver);

		String str = pg.Title().getText();
		System.out.println(str);

	}

	@Test
	public void MouseOver() {
		HomePage home = new HomePage(driver);
		Actions a = new Actions(driver);
		a.moveToElement(home.Mouse()).build().perform();
	}
//
  @Test
  public void SelectOpt() throws InterruptedException {
//	 HomePage he = new HomePage(driver);
//	 Actions c = new Actions(driver);
//	 c.moveToElement(he.Mouse()).build().perform();
	 driver.findElement(By.xpath("//div[@class='lvl-0 dropdown open']/div[1]/a[2]")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
			 
  }
	
  //	  }
      

	@Test
	public void NavigateBack() {
		driver.navigate().back();

	}

	@Test
	public void SelFistEle() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		
		Thread.sleep(5000);
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-md-12 form-group']/div[1]/a[@href='//www.phptravels.net']")));
	try {

	hp.Link().click();}
	catch(Exception e){
		System.out.println("Element not Visible");
	}
	}
	

	@Test
	public void NextWindow() {
		Set<String> tab = driver.getWindowHandles();
		Iterator<String> it = tab.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
		}
	}

	@AfterTest
	public void CloseAllWindow() {
		driver.quit();
	}

}
