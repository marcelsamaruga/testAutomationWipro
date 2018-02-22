package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

@PageObject
public class _DepositPage extends AbstractPage {

	@FindBy(id  = "targetAccount")
	private WebElement account;
	
	@FindBy(name = "amount")
	private WebElement amount;

	@FindBy(className = "sb-button")
	private WebElement depositButton;

	@FindBy (id = "sb-return-message")
	private WebElement returnMsg;

	public _DepositPage setAccount() {
		Select selectAccount = new Select( account );
		selectAccount.selectByIndex(1);
		return this;
	}

	public _DepositPage setAmount(String amount) {
		this.amount.clear();
		this.amount.sendKeys(amount);
		return this;
	}

	public void clickDepositButton() {
		depositButton.click();
		waitPageLoad();
	}
	
	public String getReturnMsg() {
		return returnMsg.getText();
	}

}
