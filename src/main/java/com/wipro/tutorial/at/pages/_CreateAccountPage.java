package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@PageObject
public class _CreateAccountPage extends AbstractPage {

	@FindBy (id = "ownerCpf")
	private WebElement cpfInput;
	
	@FindBy (className = "sb-button")
	private WebElement createAccountButton;
	
	@FindBy (id = "sb-return-message")
	private WebElement returnMsg;
	
	public _CreateAccountPage cpf (String cpf) {
		cpfInput.clear();
		cpfInput.sendKeys(cpf);
		return this;
	}
	
	public _CreateAccountPage clickCreateButton() {
		createAccountButton.click();
		waitPageLoad();
		return this;
	}
	
	public String getReturnMsg() {
		return returnMsg.getText();
	}
}
