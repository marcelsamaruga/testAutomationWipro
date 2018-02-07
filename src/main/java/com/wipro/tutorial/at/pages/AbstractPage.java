package com.wipro.tutorial.at.pages;

import org.apache.log4j.Logger;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class AbstractPage {

	protected Logger LOG = Logger.getLogger(this.getClass());
	
	@Autowired
	protected WebDriverProvider webDriverProvider;	
	
	public void waitPageLoad() {
		WebDriverWait wait = new WebDriverWait(webDriverProvider.get(), 30);
		webDriverProvider.get().manage().timeouts().implicitlyWait( 30, TimeUnit.SECONDS );
	}
	
	protected List<WebElement> elementsToWait() {
		return null;
	};
}
