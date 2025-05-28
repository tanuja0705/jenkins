package vTigerPOMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "user_name")
	private WebElement un;
	
	@FindBy(name = "user_password")
	private WebElement passw;
	
	@FindBy(id = "submitButton")
	private WebElement loginButton;

	public WebElement getUn() {
		return un;
	}

	public WebElement getPassw() {
		return passw;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void loginToVtiger(String usern,String pwd) {
		un.sendKeys(usern);
		passw.sendKeys(pwd);
		loginButton.click();
	}
}
