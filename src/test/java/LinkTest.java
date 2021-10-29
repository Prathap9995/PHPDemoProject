import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LinkTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prathapk\\chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();

	driver.get("https://phptravels.com/demo/");
//	WebElement ms =	driver.findElement(By.xpath("//div[@class='lvl-0 dropdown open']"));
//Actions c = new Actions(driver);
//c.moveToElement(ms).build().perform();
		WebElement ele = driver.findElement(By.xpath("//nav[@class='clearfix']/div[1]/span[text()='Features']"));
		ele.click();
//List<WebElement> Els=	driver.findElements(By.xpath("//div[@class='lvl-0 dropdown open']/div[1]"));
		driver.findElement(By.xpath("//div[@class='lvl-0 dropdown open']/div[1]/a[2]")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
//for(int i =0; i<Els.size(); i++) {
//String str=	Els.get(i).getText();
//System.out.println(str);
//if(str.equals("Blog Module")) {
//
//}

//	for(WebElement elt : Els) {
//	String str =	elt.ge
//	if(str.equalsIgnoreCase("Hotels Module")) {
//		elt.click();
//String newstr =	driver.getCurrentUrl();
//System.out.println(newstr);
//	}}

		// driver.findElement(By.xpath("//div[@class='col-md-12
		// form-group']/div[1]/a[@href='//www.phptravels.net']")).click();
	}
}
