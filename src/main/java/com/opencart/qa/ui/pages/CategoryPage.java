package com.opencart.qa.ui.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.opencart.qa.ui.components.Product;
import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class CategoryPage extends AbstractPage {

	@FindBy(css = "div.product-layout")
	private List<Product> products;

	public CategoryPage(WebDriver driver) {
		super(driver);
		setPageURL("/index.php?route=product/category&path=33");
	}

	public List<Product> getProducts() {
		return products;
	}

}
