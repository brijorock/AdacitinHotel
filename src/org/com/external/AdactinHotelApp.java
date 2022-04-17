package org.com.external;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdactinHotelApp {
	public static void main(String[] args)  {
		BaseClass_AHA.browserLaunch("chrome");
		BaseClass_AHA.implicitWait();
		BaseClass_AHA.urlLaunch("https://adactinhotelapp.com/");
		BaseClass_AHA.windowMaximize();
		
		WebElement name = BaseClass_AHA.driver.findElement(By.name("username"));
		WebElement password = BaseClass_AHA.driver.findElement(By.name("password"));
		BaseClass_AHA.sendData(name, "rockbrijo");
		BaseClass_AHA.sendData(password, "9486758110");
		
		WebElement login = BaseClass_AHA.driver.findElement(By.id("login"));
		BaseClass_AHA.signin(login);
		
		WebElement location=BaseClass_AHA.driver.findElement(By.name("location"));
		BaseClass_AHA.dropdownValue(location, "Sydney");
		
		WebElement hotel=BaseClass_AHA.driver.findElement(By.name("hotels"));
		BaseClass_AHA.dropdownValue(hotel, "Hotel Sunshine");
		
		WebElement roomType=BaseClass_AHA.driver.findElement(By.name("room_type"));
		BaseClass_AHA.dropdownValue(roomType, "Standard");
		
		WebElement noOfRooms=BaseClass_AHA.driver.findElement(By.name("room_nos"));
		BaseClass_AHA.dropdownIndex(noOfRooms, 1);
		
		WebElement adultroom=BaseClass_AHA.driver.findElement(By.name("adult_room"));
		BaseClass_AHA.dropdownIndex(adultroom, 2);
		
		WebElement childRoom=BaseClass_AHA.driver.findElement(By.name("child_room"));
		BaseClass_AHA.dropdownIndex(childRoom, 3);
		
		WebElement search=BaseClass_AHA.driver.findElement(By.name("Submit"));
		BaseClass_AHA.signin(search);
		
		WebElement select=BaseClass_AHA.driver.findElement(By.name("radiobutton_0"));
		BaseClass_AHA.signin(select);
		
		WebElement con=BaseClass_AHA.driver.findElement(By.name("continue"));
		BaseClass_AHA.signin(con);
		
		WebElement fName=BaseClass_AHA.driver.findElement(By.name("first_name"));
		BaseClass_AHA.sendData(fName, "Brijo");
		
		WebElement lName=BaseClass_AHA.driver.findElement(By.name("last_name"));
		BaseClass_AHA.sendData(lName, "Rock");
		
		WebElement address=BaseClass_AHA.driver.findElement(By.name("address"));
		BaseClass_AHA.sendData(address, "Kanyakumari,TamilNadu,India");
		
		WebElement ccn=BaseClass_AHA.driver.findElement(By.name("cc_num"));
		BaseClass_AHA.sendData(ccn, "1234567890123456");
		
		WebElement ccv=BaseClass_AHA.driver.findElement(By.name("cc_cvv"));
		BaseClass_AHA.sendData(ccv, "123");
		
		WebElement cct=BaseClass_AHA.driver.findElement(By.name("cc_type"));
		BaseClass_AHA.dropdownValue(cct, "AMEX");
		
		WebElement month=BaseClass_AHA.driver.findElement(By.name("cc_exp_month"));
		BaseClass_AHA.dropdownValue(month, "2");
		
		WebElement year=BaseClass_AHA.driver.findElement(By.name("cc_exp_year"));
		BaseClass_AHA.dropdownValue(year, "2012");
		
		WebElement bookNow=BaseClass_AHA.driver.findElement(By.name("book_now"));
		BaseClass_AHA.signin(bookNow);
		
		WebElement get=BaseClass_AHA.driver.findElement(By.name("order_no"));
		BaseClass_AHA.getAttribute(get);

	}
}
