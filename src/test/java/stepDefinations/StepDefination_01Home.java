package stepDefinations;

import java.io.IOException;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import ReusableComponents.baseHelpers;
import ReusableComponents.driverConfig;
import ReusableComponents.extentReports;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import uiRepositories.homePageUI;

public class StepDefination_01Home extends driverConfig{
	public ExtentReports report;
	public ExtentTest logger;
	public homePageUI hpi=new homePageUI();
	static ExtentReports extent = extentReports.ExtentReports();
	
	@Then("^Get the title and verify it$")
	public void homePageGetTitle() throws IOException, InterruptedException {
		try {
		logger=extent.createTest("Home Page-Get Title");
		logger.pass("Navigated to Site");
		hpi.siteNavigation();
		hpi.getTitle(logger);
		logger.pass("SUCCESSFULL");
		}catch(Exception e) {
			logger.fail("UNSUCCESSFULL");
		}
	}
	@And("^Verify the On-Demand Cabs element on the page$")
	public void homePageElement() throws IOException, InterruptedException {
		try {
		logger=extent.createTest("Home Page-Element Click");
		logger.pass("Navigated to Site");
		hpi.siteNavigation();
		hpi.validPageElement(logger);
		logger.pass("SUCCESSFULL");
		}catch(Exception e) {
			logger.fail("UNSUCCESSFULL");
		}
	}
	@AfterStep
	public void teardown() throws IOException {
		baseHelpers be=new baseHelpers();
		be.afterScenario();
	}
}
