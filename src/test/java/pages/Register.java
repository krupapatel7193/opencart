package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import base.BasePage;

//import base.BasePage;

public class Register extends BasePage {

	public Register(WebDriver driver) {
	
		super(driver);
		
			}
	
	//first name locator
	@FindBy(id="input-firstname")
	public WebElement Fname;
	
	//last name locator
	@FindBy(id="input-lastname")
	public WebElement Lname;
	
	//E-mail locator
	@FindBy(id="input-email")
	public WebElement Email;
	
	//Telephone locator
	@FindBy(id="input-telephone")
	public WebElement phone;
	
	//Password locator
	@FindBy(id="input-password")
	public WebElement password;
	
	//confirmpassword locator
	@FindBy(id="input-confirm")
	public WebElement confirmpassword;
	
	//privacy policy locator
	@FindBy(name="agree")
	public WebElement Agree;
	
	//continue locator
	@FindBy(xpath="//input[@value='Continue']")
	public WebElement Submit;
	
//Alert message 
	@FindBy(className="alert-dismissible")
	public WebElement actualText;



public void doRegister(String myfname, String mylname, String myemail, String mynum, String mypassword, String confirmpass) {
	Fname.click();
	Fname.sendKeys(myfname);
	Lname.click();
	Lname.sendKeys(mylname);
	Email.click();
	Email.sendKeys(myemail);
	phone.click();
	phone.sendKeys(mynum);
	password.click();
	password.sendKeys(mypassword);
	confirmpassword.click();
	confirmpassword.sendKeys(confirmpass);
			
}

public void Clear() {
	Fname.clear();
	Lname.clear();
	Email.clear();
	phone.clear();
	password.clear();
	confirmpassword.clear();

}

public void doDisagree() {
	Agree.click();
	Submit.click();
}

public void doSubmit() {
	Agree.click();
	Submit.click();
}

public String checkText() {
	return actualText.getText();
}
}