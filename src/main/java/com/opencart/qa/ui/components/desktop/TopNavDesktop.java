package com.opencart.qa.ui.components.desktop;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.opencart.qa.ui.components.TopNav;
import com.opencart.qa.ui.pages.desktop.CategoryPageDesktop;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class TopNavDesktop extends TopNav {

	public TopNavDesktop(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}

	@FindBy(linkText = "Cameras")
	private ExtendedWebElement btnCameras;

	@Override
	public CategoryPageDesktop openCameras() {
		btnCameras.click();
		return new CategoryPageDesktop(driver);
	}

}
