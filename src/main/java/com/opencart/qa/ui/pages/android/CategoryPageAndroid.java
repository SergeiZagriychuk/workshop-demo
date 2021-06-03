package com.opencart.qa.ui.pages.android;

import org.openqa.selenium.WebDriver;

import com.opencart.qa.ui.pages.CategoryPage;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = CategoryPage.class)
public class CategoryPageAndroid extends CategoryPage {

	public CategoryPageAndroid(WebDriver driver) {
		super(driver);
	}

}
