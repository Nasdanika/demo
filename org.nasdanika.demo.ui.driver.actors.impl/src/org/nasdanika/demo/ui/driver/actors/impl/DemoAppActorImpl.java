package org.nasdanika.demo.ui.driver.actors.impl;

import org.nasdanika.demo.ui.driver.actors.DemoAppActor;
import org.nasdanika.demo.ui.driver.actors.DemoAppActorFactory;
import org.nasdanika.demo.ui.driver.pages.DemoAppPage;
import org.nasdanika.webtest.Description;
import org.nasdanika.webtest.Page;
import org.nasdanika.webtest.Screenshot;
import org.openqa.selenium.WebDriver;

class DemoAppActorImpl implements DemoAppActor {

	private DemoAppActorFactory factory;
	private Page<WebDriver> currentPage;
	private WebDriver webDriver;

	DemoAppActorImpl(DemoAppActorFactory factory, WebDriver webDriver) {
		this.factory = factory;
		this.webDriver = webDriver;
	}

	@Override
	public Page<WebDriver> getCurrentPage() {
		return currentPage;
	}
	
	@Override		
	@Description("Navigates to DemoAppPage")
	@Screenshot({Screenshot.When.AFTER, Screenshot.When.EXCEPTION})
	public DemoAppPage navigateToDemoAppPage() {
		webDriver.get("http://localhost:8080/demo-app/router/demo-app.html");
		DemoAppPage ret = factory.getPageFactory().createDemoAppPage(webDriver);
		
		return ret;
	}

}
