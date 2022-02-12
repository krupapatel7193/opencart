package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pages.Home;

public class TC001MyAccount extends BaseClass {
	
	@Test
	public void openLoginPage() throws IOException {
		//driver=Initialize();
		test=rep.startTest("openLoginPage");
		test.log(LogStatus.INFO, "Navigate to login page from home page");
		app_logs.info("navigate to login page test started.");
		Home h1 = new Home(driver);
		test.log(LogStatus.INFO, "click on the myaccount link");
		h1.doAccountClick();
		test.log(LogStatus.INFO, "click on the register link");
		h1.doClickRegister();
		app_logs.info("test completed.");
	}

}
