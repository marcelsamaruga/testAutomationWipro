package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.CreateAccountPage;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateAccountSteps extends AbstractSteps {

	@Autowired
	private CreateAccountPage createAccPage;
	
	@When("User fills the CPF input with value $cpfValue")
	public void userFillsCPF(@Named("cpfValue") String cpfValue ) {
		createAccPage.cpf(cpfValue);
	}
	
	@When("User clicks on Create Account button")
	public void clickCreateAccountButton() {

		createAccPage.clickCreateButton();
	}
	
	@Then("The return message for Create Account is $message")
	public void assertCreateAccountReturnMessage(@Named("message") String message) {
		Assert.assertEquals(message, createAccPage.getReturnMsg());
	}
}
