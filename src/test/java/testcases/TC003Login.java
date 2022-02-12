package testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pages.Home;
import pages.Login;

public class TC003Login extends BaseClass {
	
	@Test(priority=1)
	public void verifyLogin1() {
		test=rep.startTest("verifyLogin1");
		test.log(LogStatus.INFO, "verify login without providing password");
		app_logs.info("verifyLogin1 test started.");
		Home h2 = new Home(driver);
		Login l1 = new Login(driver);
		test.log(LogStatus.INFO, "click on my account link");
		h2.doAccountClick();
		test.log(LogStatus.INFO, "click on the login link");
		h2.doClickLogin();
		test.log(LogStatus.INFO, "Enter user name");
		l1.Username();
		test.log(LogStatus.INFO, "click on the login button");
		l1.doLogin();
		String Expectedmsg="Warning: No match for E-Mail Address and/or Password.";
	
		Assert.assertEquals(Expectedmsg, l1.Alert());
		test.log(LogStatus.INFO, "verifyLogin1 test completed");
		app_logs.info("verifyLogin1 test complted.");
	}
	
	@Test(priority=2)
	public void verifyLogin2() {
		test=rep.startTest("verifyLogin2");
		test.log(LogStatus.INFO, "verify login without providing username");
		app_logs.info("verifyLogin2 test started.");
		Home h3 = new Home(driver);
		Login l2 = new Login(driver);
		test.log(LogStatus.INFO, "click on my account link");
		h3.doAccountClick();
		test.log(LogStatus.INFO, "click on the login link");
		h3.doClickLogin();
		test.log(LogStatus.INFO, "Enter password only");
		l2.Password();
		test.log(LogStatus.INFO, "click on the login button");
		l2.doLogin();
		String Expectedmsg="Warning: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(Expectedmsg, l2.Alert());
		test.log(LogStatus.INFO, "verifyLogin2 test completed");
		app_logs.info("verifyLogin2 test completed.");
	}
	
	@Test(priority=3)
	public void verifyLogin() {
		test=rep.startTest("verifyLogin");
		test.log(LogStatus.INFO, "verify login with correct username and password");
		app_logs.info("verifyLogin test started.");
		Home h2 = new Home(driver);
		Login l1 = new Login(driver);
		test.log(LogStatus.INFO, "click on my account link");
		h2.doAccountClick();
		test.log(LogStatus.INFO, "click on the login link");
		h2.doClickLogin();
		test.log(LogStatus.INFO, "Enter username");
		l1.Username();
		test.log(LogStatus.INFO, "Enter password");
		l1.Password();
		l1.doLogin();
		test.log(LogStatus.INFO, "verifyLogin test completed");
		app_logs.info("verifyLogin test completed.");
		
	}

}
