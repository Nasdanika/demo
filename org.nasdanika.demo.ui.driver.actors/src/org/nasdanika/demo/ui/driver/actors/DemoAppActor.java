package org.nasdanika.demo.ui.driver.actors;

import org.nasdanika.demo.ui.driver.pages.DemoAppPage;
import org.nasdanika.webtest.Actor;
import org.nasdanika.webtest.Description;
import org.openqa.selenium.WebDriver;

@Description("Demo App Actor")
public interface DemoAppActor extends Actor<WebDriver> {
	
	@Description("Navigates to DemoAppPage")
	DemoAppPage navigateToDemoAppPage();

}
