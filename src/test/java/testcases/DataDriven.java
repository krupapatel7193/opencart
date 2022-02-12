package testcases;
	
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;
import pages.Home;
import pages.Login;

	public class DataDriven extends BaseClass {
		@Test(dataProvider="testdata")
		public void testcaseData(String uname, String pword) {
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
			l1.User_name().sendKeys(uname);
			test.log(LogStatus.INFO, "Enter password");
			l1.Pass_word().sendKeys(pword);
			l1.doLogin();
			test.log(LogStatus.INFO, "verifyLogin test completed");
			app_logs.info("verifyLogin test completed.");
		}
		
		@DataProvider(name="testdata")
		public Object[][] getData() {
			Object[][] data = new Object[2][2];
			data[0][0]="username";
			data[0][1]="password";
			
			data[1][0]="Tye";
			data[1][1]="tutorial";	
			return data;
		}
	}


