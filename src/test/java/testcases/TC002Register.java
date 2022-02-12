package testcases;

import org.testng.Assert;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pages.Register;
//@Listeners(base.CustomListners.class)
public class TC002Register extends BaseClass {
	
	@Test(priority=2)
	public void verifyRegister1() {
	test=rep.startTest("verifyRegister1");
		test.log(LogStatus.INFO, "Register user Test started");
		app_logs.info("verifyRegister1 test started.");
		Register r1 = new Register(driver);
		test.log(LogStatus.INFO, "clearing all field to register another user");
		r1.Clear();
		test.log(LogStatus.INFO, "providing data to mandatory field except privacy policy field");
		r1.doRegister("username", "username", "xyz@gmail.com", "123456789", "password", "password");
		test.log(LogStatus.INFO, "click on submit button");
		r1.doDisagree();
		String Expected="Warning: You must agree to the Privacy Polic!";
		//String Actual=r1.checkText();
		System.out.println(r1.checkText());
		Assert.assertEquals(Expected, r1.checkText());
		test.log(LogStatus.INFO, "verifyRegister1 test completed");
		app_logs.info("verifyRegister1 test completed.");
	}

	
	@Test(priority=1)
	public void verifyRegister() {
		test=rep.startTest("verifyRegister");
		Register r1 = new Register(driver);
		test.log(LogStatus.INFO, "Entering data into required field");
		app_logs.info("verifyRegister test started.");
		r1.doRegister("username", "username", "xxx1@gmail.com", "123456789", "password", "password");
		test.log(LogStatus.INFO, "click on submit button");
		
		r1.doSubmit();
		String expectedAlert = "Warning: E-Mail Address is already registered!";
		System.out.println(r1.checkText());
		Assert.assertEquals(expectedAlert, r1.checkText());
		test.log(LogStatus.INFO, "verifyRegister test completed");
		app_logs.info("verifyRegister1 test completed.");
	}

}
