package com.opencart.qa.ui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import com.opencart.qa.ui.pages.CategoryPage;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public abstract class TopNav extends AbstractUIObject {

	public TopNav(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}

	public abstract CategoryPage openCameras();

}
