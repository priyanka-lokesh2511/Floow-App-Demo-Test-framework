package Testing.Definitions;

import java.io.IOException;

import Steps.LoginPageSteps;
import Utility.AppLauncher;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class LoginPageDefinitions extends AppLauncher {
		
	LoginPageSteps loginPage = new LoginPageSteps();
	
	@Given("^The user is on the login screen$")
	public void userNavigatesToLoginpage() throws IOException, InterruptedException
	{
		
		loginPage.launchApp();
	}
	
	@When("^The user enters invalid (.*) and (.*)$")
	public void invalidlogin(String emailID,String password)
	{
		
		loginPage.invalidemailpassWrd(emailID, password);
		
	}
	
	@Then("^Login error is shown$")
	public void validateError()
	{
		
		loginPage.validateErrorMessage();
	}
	
	
}
