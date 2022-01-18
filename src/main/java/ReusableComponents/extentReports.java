package ReusableComponents;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Utilities.dateTimeHelper;

public class extentReports {
	public static ExtentReports report;
	public static ExtentSparkReporter extent;

	public static ExtentReports ExtentReports() {
		extent=new ExtentSparkReporter(new File(System.getProperty("user.dir")+"/Reports/HybridTesting_"+dateTimeHelper.getCurrentDateTime()+".html"));
		report =new ExtentReports();
		report.attachReporter(extent);
		try {
			return report;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return report;
	}
}
