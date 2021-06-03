package com.opencart.qa.ui.pages.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.opencart.qa.ui.components.TopNav;
import com.opencart.qa.ui.components.desktop.TopNavDesktop;
import com.opencart.qa.ui.pages.LandingPage;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;

@DeviceType(pageType = Type.DESKTOP, parentClass = LandingPage.class)
public class LandingPageDesktop extends LandingPage {
	
	@FindBy(css = "div.navbar-collapse")
	private TopNavDesktop topNavDesktop;
	
	
	public LandingPageDesktop(WebDriver driver) {
		super(driver);
	}

	@Override
	public TopNav getTopNav() {
		return topNavDesktop;
	}


}
