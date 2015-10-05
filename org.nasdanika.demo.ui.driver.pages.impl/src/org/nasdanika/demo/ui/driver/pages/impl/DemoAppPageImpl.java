package org.nasdanika.demo.ui.driver.pages.impl;

import org.nasdanika.demo.ui.driver.pages.DemoAppPage;
import org.nasdanika.webtest.ReflectivePageFragmentBase;
import org.nasdanika.webtest.Wait;
import org.openqa.selenium.WebDriver;


@Wait(id="button-groups")
public class DemoAppPageImpl extends ReflectivePageFragmentBase<WebDriver> implements DemoAppPage {
		
	private DemoAppPageFactoryImpl factory;
	private WebDriver webDriver;	

	public DemoAppPageImpl(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public void setFactory(DemoAppPageFactoryImpl factory) {
		this.factory = factory;
	}
	
	@Override
	public WebDriver getWebDriver() {
		return webDriver;
	}

}
