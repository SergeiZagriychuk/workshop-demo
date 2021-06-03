package com.opencart.qa.ui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class Product extends AbstractUIObject {

	@FindBy(css = "img.img-responsive")
	private ExtendedWebElement img;

	@FindBy(css = "h4 > a")
	private ExtendedWebElement title;

	@FindBy(css = "p.price")
	private ExtendedWebElement price;

	@FindBy(xpath = "//button[contains(.,'Add to Cart')]")
	private ExtendedWebElement btnAddToCart;

	public Product(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}

	public void validateBaseElements() {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(img.isVisible(), "Image is missing");
		softAssert.assertTrue(title.isVisible(), "Title is missing");
		softAssert.assertFalse(title.getText().isEmpty(), "Title is empty");
		softAssert.assertTrue(price.isVisible(), "Price is missing");
		softAssert.assertFalse(price.getText().isEmpty(), "Price is empty");
		softAssert.assertTrue(btnAddToCart.isVisible(), "Add button is missing");
		softAssert.assertAll();
	}

	public void addProduct() {
		btnAddToCart.click();
	}

}
