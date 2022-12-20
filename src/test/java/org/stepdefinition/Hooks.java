package org.stepdefinition;

import java.io.IOException;

import org.helper.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before(order=12)
	private void browserlaunch() {
		BrowserLaunch();
		System.out.println("Browser Launch");
	}

	@Before(order=50)
	private void befscreenshot() throws IOException {
		screenShot("fb.jpg");
		System.out.println("Before Screenshot");
	}

	@Before(order=250)
	private void windowmaxi() {
		maxiwindow();
	}

	@After(order=300)
	private void aftscreenshot(Scenario s)  {
		
		if (s.isFailed()) {
			TakesScreenshot tk =(TakesScreenshot)driver;
			byte[] screenshotAs = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshotAs, "images/png");
			
		}
		}

	@After(order=150)
	private void browserclose() {
		closeBrowser();
		System.out.println("Close Browser");
	}

}
