package org.com.external;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass_Bcat {
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
	public static void implicityWait() {
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	}
	public static void urlLaunch(String url) {
		driver.get(url);
}
	public static void windowMaximize() {
		driver.manage().window().maximize();
	}
	public static void buttonClick(WebElement element) {
		element.click();
	}
	public static void getText(WebElement element) {
		System.out.println(element.getText());
	}
}
