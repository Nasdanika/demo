package org.nasdanika.demo.ui.driver.actors;

import org.nasdanika.demo.ui.driver.pages.DemoAppPageFactory;
import org.openqa.selenium.WebDriver;

public interface DemoAppActorFactory {
	
	DemoAppPageFactory getPageFactory();
	
	DemoAppActor createDemoAppActor(WebDriver webDriver);

}
