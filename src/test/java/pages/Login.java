package pages;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class Login extends BasePage {
	
	public Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="input-email")
	public WebElement username;
	
	
@FindBy(id="input-password")
public WebElement password;

@FindBy(xpath="//input[@value='Login']")
public WebElement submit;

@FindBy(className="alert-dismissible")
public WebElement alert;

@FindAll(@FindBy(xpath="//ul[@class='list-inline']/a"))
public List<WebElement> links;


public void Username() {
	username.sendKeys("xxx1@gmail.com");
		
}
public void Password() {
		password.sendKeys("password");
	}

public void doLogin() {
		submit.click();
}

public String Alert() {
	 return alert.getText();
}


public WebElement User_name() {
	return username;
		
}
public WebElement Pass_word() {
		return password;
	}


}