package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePHP {
	
	public WebDriver driver;
	public Properties pro;
	

	public WebDriver InitializeWebDriver() throws IOException {
		
		Properties pro = new Properties();
		
		FileInputStream File = new FileInputStream("C:\\Users\\prathapk\\eclipse-workspace\\PHPDemoProject\\src\\main\\java\\Resources\\Data.properties");
		pro.load(File);
	String BrowserName = 	pro.getProperty("Browser");  
	System.out.println(BrowserName);
		
		if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\prathapk\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get(pro.getProperty("URL"));
	}
		else {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\ChromeDriver94\\chromedriver.exe");
			 driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		return driver;
	}
	
	
	public String ScreenShots(String TestCasename, WebDriver driver) throws IOException {
	File ScrSht = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	String DestinationFile = System.getProperty("user.dir")+"\\reports\\"+TestCasename+".png";
	FileUtils.copyFile(ScrSht, new File(DestinationFile));
	return DestinationFile;
		
	}
	
}
