package com.opencart.qa.ui.pages.android;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.opencart.qa.ui.components.TopNav;
import com.opencart.qa.ui.components.android.TopNavAndroid;
import com.opencart.qa.ui.pages.LandingPage;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = LandingPage.class)
public class LandingPageAndroid extends LandingPage {

	@FindBy(id = "menu")
	private TopNavAndroid topNavAndroid;

	public LandingPageAndroid(WebDriver driver) {
		super(driver);
	}

	@Override
	public TopNav getTopNav() {
		return topNavAndroid;
	}

}
