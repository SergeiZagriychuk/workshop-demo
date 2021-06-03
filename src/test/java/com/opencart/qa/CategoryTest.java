package com.opencart.qa;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.qa.ui.pages.CategoryPage;
import com.opencart.qa.ui.pages.LandingPage;
import com.qaprosoft.carina.core.foundation.AbstractTest;

public class CategoryTest extends AbstractTest {

	@Test
	public void testAddProduct() {
		LandingPage landingPage = initPage(getDriver(), LandingPage.class);
		landingPage.open();

		CategoryPage categoryPage = landingPage.getTopNav().openCameras();
		categoryPage.assertPageOpened();
		Assert.assertFalse(categoryPage.getProducts().isEmpty(), "Products list is empty");
		categoryPage.getProducts().stream().forEach(p -> p.validateBaseElements());
		categoryPage.getProducts().get(1).addProduct();
	}

}
