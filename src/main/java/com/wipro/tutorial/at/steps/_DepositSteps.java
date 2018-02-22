package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.DepositPage;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class _DepositSteps extends AbstractSteps {

	@Autowired
	private DepositPage depositPage;

	@When("User fills the form with value $amount")
	public void toFillData(@Named("amount") String amount ) {
		depositPage.setAccount();
		depositPage.setAmount( amount );
	}

	@When("User clicks on Transfer button")
	public void clickDepositButton() {
		depositPage.clickDepositButton();
	}

	@Then("The return message for Deposit Account is $message")
	public void assertCreateAccountReturnMessage(@Named("message") String message) {
		Assert.assertEquals(message, depositPage.getReturnMsg());
	}

}
