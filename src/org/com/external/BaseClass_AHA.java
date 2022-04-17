package org.com.external;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass_AHA {
	public static WebDriver driver;

	public static void browserLaunch(String browser) {
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\BRIJO ROCK\\eclipse-workspace\\Selenium2.0\\Chrome Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\BRIJO ROCK\\eclipse-workspace\\Selenium2.0\\FF Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("This Browser is Not Valid");
			break;

		}
	}

	public static void urlLaunch(String url) {
		driver.get(url);
	}

	public static void windowMaximize() {
		driver.manage().window().maximize();
	}

	public static void sendData(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void signin(WebElement element) {
		element.click();
	}
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}

	public static void dropdownValue(WebElement element,String data) {
		Select sc=new Select(element);
		sc.selectByValue(data);
	}
	public static void dropdownIndex(WebElement element,int data) {
		Select sc = new Select(element);
		sc.selectByIndex(data);
	}
	public static void getAttribute(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')",element );
        System.out.println("My order No:"+executeScript);
	}

	
}
