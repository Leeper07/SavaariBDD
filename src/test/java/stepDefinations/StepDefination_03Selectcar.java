package stepDefinations;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import ReusableComponents.baseHelpers;
import ReusableComponents.driverConfig;
import ReusableComponents.extentReports;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.Then;
import uiRepositories.selectCarPageUI;

public class StepDefination_03Selectcar  extends driverConfig{
	public ExtentReports report;
	public ExtentTest logger;
	public selectCarPageUI scpi=new selectCarPageUI();
	static ExtentReports extent = extentReports.ExtentReports();
	
	@Then("^User validates the car price for one way booking$")
	public void oneWayBooking() throws IOException {
		try {
			logger=extent.createTest("Select car page-Oneway Booking");
			scpi.siteNavigation(logger);
			scpi.oneWayBooking();
			logger.pass("SUCCESSFULL");
			}catch(Exception e) {
				logger.fail("UNSUCCESSFULL");
			}
	}
	@Then("^User validates the car price for round trip booking$")
	public void roundTripBooking() throws IOException {
		try {
			logger=extent.createTest("Select car page-RoundTrip Booking");
			scpi.siteNavigation(logger);
			scpi.roundTripBooking();
			logger.pass("SUCCESSFULL");
			}catch(Exception e) {
				logger.fail("UNSUCCESSFULL");
			}
	}
	@Then("^User validates the car price for local trip booking$")
	public void localTripBooking() throws IOException {
		try {
			logger=extent.createTest("Select car page-Local Trip Booking");
			scpi.siteNavigation(logger);
			scpi.localBooking();
			logger.pass("SUCCESSFULL");
			}catch(Exception e) {
				logger.fail("UNSUCCESSFULL");
			}
	}
	@Then("^User validates the car price for cab from airport booking$")
	public void cabToAirBooking() throws IOException {
		try {
			logger=extent.createTest("Select car page-From Airport Booking");
			scpi.siteNavigation(logger);
			scpi.cabFromAirportBooking();
			logger.pass("SUCCESSFULL");
			}catch(Exception e) {
				logger.fail("UNSUCCESSFULL");
			}
	}
	@Then("^User validates the car price for cab to airport booking$")
	public void cabFromAirBooking() throws IOException {
		try {
			logger=extent.createTest("Select car page-To Airport Booking");
			scpi.siteNavigation(logger);
			scpi.cabtoAirportBooking();
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
