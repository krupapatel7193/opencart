package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

//import base.BaseClass;
import base.BasePage;

public class Home extends BasePage{
	
	//Home page constructor for driver access 
	public Home(WebDriver driver) {
				super(driver);
			}
	
	//myaccount locator
	@FindBy(xpath="//div[@id='top-links']/ul/li[2]")
	public WebElement MyAccount;
	
	//register locator
	
	@FindBy(xpath="//a[text()='Register']")
	public WebElement Register;

	@FindBy(xpath="//a[text()='Login']")
	public WebElement Login;
	
	//myaccount click method
	public void doAccountClick() {
		 MyAccount.click();
			}
	//register click method
	public void doClickRegister() {
		Register.click();
	}
	
	//login button click
	public void doClickLogin() {
		Login.click();
	}
	
}
