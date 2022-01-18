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
import io.cucumber.java.en.When;
import uiRepositories.loginPageUI;

public class StepDefination_02Login extends driverConfig {
	public ExtentReports report;
	public ExtentTest logger;
	public loginPageUI lpi=new loginPageUI();
	static ExtentReports extent = extentReports.ExtentReports();
	@When("^User validates the agent login details$")
	public void loginPageAgentLogin() throws IOException, InterruptedException {
		try {
			logger=extent.createTest("Login Page-Agent Login");
			lpi.siteNavigation();
			lpi.agentLogin(logger);
			logger.pass("SUCCESSFULL");
			}catch(Exception e) {
				logger.fail("UNSUCCESSFULL");
			}
	}
	@Then("^User validate the customer login details$")
	public void loginPageCustomerLogin() throws IOException, InterruptedException {
		try {
			logger=extent.createTest("Login Page-Customer Login");
			lpi.siteNavigation();
			lpi.customerLogin(logger);
			logger.pass("SUCCESSFULL");
			}catch(Exception e) {
				logger.fail("UNSUCCESSFULL");
			}
	}
	@And("^User validate the forgot password details$")
	public void loginPageCustomerForgotPassword() throws IOException, InterruptedException {
		try {
			logger=extent.createTest("Login Page-Customer Forgot Password");
			lpi.siteNavigation();
			lpi.forgotPassword(logger);
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
