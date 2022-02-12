package utilities;



import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
private static ExtentReports extent;
	
	
	public static ExtentReports getInstance(){
		
		if(extent==null){
			//give a path where you want to create a report
			extent = new ExtentReports(System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\extent.html",true,DisplayOrder.OLDEST_FIRST);
			extent.addSystemInfo("Selenium Version","3.14");
			extent.addSystemInfo("server Environment","QA");
			extent.addSystemInfo("Platform","Windows10");
			
		
			
		}
		
		return extent;
		
	}
}
