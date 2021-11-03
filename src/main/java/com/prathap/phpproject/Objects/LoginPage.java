package com.prathap.phpproject.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.prathap.phpprojectResources.BasePHP;

public class LoginPage extends BasePHP {

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "inputEmail")
	WebElement Email;
	
	@FindBy(id = "inputPassword")
	WebElement Password;
	
	@FindBy(id="login")
	WebElement SignIn;
	
	@FindBy(xpath = "//div[@class='alert alert-danger']")
	WebElement Error;
	
	public WebElement Email() {
		return Email;
	}
	
	public WebElement Password() {
		return Password;
	}
	
	public WebElement SignIn() {
		return SignIn;
	}
	
	public WebElement Error() {
		return Error;
	}
}
