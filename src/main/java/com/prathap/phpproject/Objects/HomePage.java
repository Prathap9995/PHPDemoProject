package com.prathap.phpproject.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.prathap.phpprojectResources.BasePHP;

public class HomePage extends BasePHP {
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(id="PHPTRAVELS")
	
	@FindBy(id="PHPTRAVELS")
	WebElement  PageTitle;
	
	@FindBy(xpath="//nav[@class='clearfix']/div[1]/span[text()='Features']")
	WebElement Mouse;
	
	@FindBy(xpath = "//div[@class='lvl-0 dropdown open']/div[1]/a[2]")
	WebElement newLink;
	
	
	@FindBy(xpath="//div[@class='col-md-12 form-group']/div[1]/a[@href='//www.phptravels.net']")
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
	
	public WebElement NewLink() {
		return newLink;
	}

}
