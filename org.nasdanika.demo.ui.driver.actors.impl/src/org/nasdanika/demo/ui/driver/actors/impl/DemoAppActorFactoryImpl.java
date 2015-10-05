package org.nasdanika.demo.ui.driver.actors.impl;

import org.nasdanika.demo.ui.driver.pages.DemoAppPageFactory;
import org.nasdanika.demo.ui.driver.actors.DemoAppActorFactory;
import org.nasdanika.demo.ui.driver.actors.DemoAppActor;
import org.nasdanika.webtest.AbstractNasdanikaWebTestRunner;
import org.openqa.selenium.WebDriver;
import org.osgi.service.component.ComponentContext;

public class DemoAppActorFactoryImpl implements DemoAppActorFactory {

	private DemoAppPageFactory pageFactory;

	public void setPageFactory(DemoAppPageFactory pageFactory) {
		this.pageFactory = AbstractNasdanikaWebTestRunner.proxyPageFactory(pageFactory);
	}

	@Override
	public DemoAppActor createDemoAppActor(WebDriver webDriver) {
		return new DemoAppActorImpl(this, webDriver);
	}
	
	// For troubleshooting
	public void activate(ComponentContext context) {
		System.out.println("Demo App Actor Factory Component activated");
	}

	@Override
	public DemoAppPageFactory getPageFactory() {
		return pageFactory;
	}

}
