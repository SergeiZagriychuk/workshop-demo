package com.opencart.qa.ui.components.android;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.opencart.qa.ui.components.TopNav;
import com.opencart.qa.ui.pages.android.CategoryPageAndroid;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class TopNavAndroid extends TopNav {

	public TopNavAndroid(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}

	@FindBy(css = "button.btn-navbar")
	private ExtendedWebElement btnExpandMenu;

	@FindBy(linkText = "Cameras")
	private ExtendedWebElement btnCameras;

	@Override
	public CategoryPageAndroid openCameras() {
		btnExpandMenu.click();
		pause(1);
		btnCameras.click();
		pause(1);
		return new CategoryPageAndroid(driver);
	}

}
