package org.nasdanika.demo.ui.driver.pages.impl;

import org.nasdanika.demo.ui.driver.pages.DemoAppPageFactory;
import org.nasdanika.demo.ui.driver.pages.DemoAppPage;
import org.openqa.selenium.WebDriver;
import org.nasdanika.webtest.WebTestUtil;
import org.osgi.service.component.ComponentContext;

public class DemoAppPageFactoryImpl implements DemoAppPageFactory {

	private String baseURL;
	
	public void activate(ComponentContext context) {
		baseURL = (String) context.getProperties().get("base-url");
		System.out.println("Page factory component activated with base URL '"+baseURL+"'");
	}
	
	public void setBaseURL(String baseURL) {
		this.baseURL = baseURL;
	}
	
	@Override
	public DemoAppPage createDemoAppPage(WebDriver webDriver) {
		DemoAppPageImpl ret = WebTestUtil.initElements(webDriver, DemoAppPageImpl.class);
		ret.setFactory(this);
		return ret;
	}
	
	public String getBaseURL() {
		return baseURL;
	}

}
