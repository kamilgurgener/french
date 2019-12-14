package com.bilgin.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	private Driver() {
	}

	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			switch (ConfigurationReader.getProperty("browser")) {
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "chrome":
				WebDriverManager.chromedriver().setup();
				
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("test-type");
				capabilities.setCapability("chrome.binary", "<Path to binary>");
				capabilities.setCapability(ChromeOptions.CAPABILITY, options);
				driver = new ChromeDriver(capabilities);
				
				break;
			case "ie":
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
				break;
			}
		}
		return driver;
	}

	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
