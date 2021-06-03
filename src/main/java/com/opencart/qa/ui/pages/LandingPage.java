package com.opencart.qa.ui.pages;

import org.openqa.selenium.WebDriver;

import com.opencart.qa.ui.components.TopNav;
import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class LandingPage extends AbstractPage {

	public LandingPage(WebDriver driver) {
		super(driver);
		setPageURL("");
//		R.CONFIG.get("")
//		Configuration.get(Parameter.EXPLICIT_TIMEOUT);
	}
	
	public abstract TopNav getTopNav();

}
