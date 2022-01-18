package stepDefinations;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import ReusableComponents.baseHelpers;
import ReusableComponents.driverConfig;
import ReusableComponents.extentReports;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.Then;
import uiRepositories.footerPageUI;

public class StepDefination_04Footer extends driverConfig{
	public ExtentReports report;
	public ExtentTest logger;
	public footerPageUI fpi=new footerPageUI();
	static ExtentReports extent = extentReports.ExtentReports();
	
	@Then("^User validates the contact email id$")
	public void validContactUs() throws IOException {
		try {
			logger=extent.createTest("Footer page-Contact Us");
			fpi.siteNavigation(logger);
			fpi.contactUs();
			logger.pass("SUCCESSFULL");
			}catch(Exception e) {
				logger.fail("UNSUCCESSFULL");
			}
	}
	@Then("^User validates the card title$")
	public void validSocialLink() throws IOException {
		try {
			logger=extent.createTest("Footer page-Social Link");
			fpi.siteNavigation(logger);
			fpi.bloggerSocailLink();
			logger.pass("SUCCESSFULL");
			}catch(Exception e) {
				logger.fail("UNSUCCESSFULL");
			}
	}
	@Then("^User validates the CEO name$")
	public void validAboutUs() throws IOException {
		try {
			logger=extent.createTest("Footer page-About Us");
			fpi.siteNavigation(logger);
			fpi.aboutUs();
			logger.pass("SUCCESSFULL");
			}catch(Exception e) {
				logger.fail("UNSUCCESSFULL");
			}
	}
	@Then("^User validates the cab name$")
	public void validSitemapCabType() throws IOException {
		try {
			logger=extent.createTest("Footer page-Sitemap Cab  Type");
			fpi.siteNavigation(logger);
			fpi.siteMapCabType();
			logger.pass("SUCCESSFULL");
			}catch(Exception e) {
				logger.fail("UNSUCCESSFULL");
			}
	}
	@Then("^User validates the number of passengers$")
	public void validcarRental() throws IOException {
		try {
			logger=extent.createTest("Footer page-Car rental");
			fpi.siteNavigation(logger);
			fpi.carRentalCitiies();
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
