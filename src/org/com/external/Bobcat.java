package org.com.external;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Bobcat {
public static void main(String[] args) throws InterruptedException {
	Baseclass_Bcat.browserLaunch("chrome");
	Baseclass_Bcat.implicityWait();
	Baseclass_Bcat.urlLaunch("https://www.bobcat.com/in/en/index");
	Baseclass_Bcat.windowMaximize();
	
	WebElement close = Baseclass_Bcat.driver.findElement(By.xpath("//*[text()='Accept All Cookies']"));
	Baseclass_Bcat.buttonClick(close);
	
	Baseclass_Bcat.driver.findElement(By.xpath("(//*[text()='Backhoe Loaders'])[1]")).click();
	
	Map<String, String> bobcot=new LinkedHashMap<String, String>();
	
	WebElement key1 = Baseclass_Bcat.driver.findElement(By.xpath("//*[text()='Bobcat B900 CEV Stage IV Backhoe Loader']"));
	WebElement value1 = Baseclass_Bcat.driver.findElement(By.xpath("//*[text()='Operating Wt :7990 Kg']"));
	
	bobcot.put(key1.getText(), value1.getText());
	
	WebElement loaders = Baseclass_Bcat.driver.findElement(By.xpath("(//*[text()='Loaders'])[1]"));
	Baseclass_Bcat.buttonClick(loaders);
	WebElement skidLoaders = Baseclass_Bcat.driver.findElement(By.xpath("(//*[text()='Skid-Steer Loaders'])[1]"));
	Baseclass_Bcat.buttonClick(skidLoaders);
	WebElement key2 = Baseclass_Bcat.driver.findElement(By.xpath("(//*[text()='Bobcat S70 Skid-Steer Loader'])[1]"));
	WebElement value2 = Baseclass_Bcat.driver.findElement(By.xpath("(//*[text()='ROC: 343 kg'])[1]"));
	WebElement key3 = Baseclass_Bcat.driver.findElement(By.xpath("(//*[text()='Bobcat S450 Skid-Steer Loader'])[1]"));
	WebElement value3 = Baseclass_Bcat.driver.findElement(By.xpath("(//*[text()='ROC: 608 kg'])[1]"));
    WebElement key4 = Baseclass_Bcat.driver.findElement(By.xpath("(//*[text()='Bobcat S590 Skid-Steer Loader '])[1]"));
    WebElement value4 = Baseclass_Bcat.driver.findElement(By.xpath("(//*[text()='ROC: 907 Kg'])[1]"));
    WebElement key5 = Baseclass_Bcat.driver.findElement(By.xpath("(//*[text()='Bobcat S770 Skid-Steer Loader'])[1]"));
    WebElement value5 = Baseclass_Bcat.driver.findElement(By.xpath("(//*[text()='ROC: 1520 Kg'])[1]"));
    
    bobcot.put(key2.getText(), value2.getText());
    bobcot.put(key3.getText(), value3.getText());
    bobcot.put(key4.getText(), value4.getText());
    bobcot.put(key5.getText(), value5.getText());
    
    WebElement back = Baseclass_Bcat.driver.findElement(By.xpath("(//*[@class='fa fa-angle-left'])[1]"));
    Baseclass_Bcat.buttonClick(back);
    
    WebElement compactLoaders = Baseclass_Bcat.driver.findElement(By.xpath("(//*[text()='Compact Track Loaders'])[1]"));
    Baseclass_Bcat.buttonClick(compactLoaders);
    
    WebElement key6 = Baseclass_Bcat.driver.findElement(By.xpath("(//*[text()='Bobcat T590 Compact Track Loader'])[1]"));
    WebElement value6 = Baseclass_Bcat.driver.findElement(By.xpath("(//*[text()='ROC: 992 kg'])[1]"));
    WebElement key7 = Baseclass_Bcat.driver.findElement(By.xpath("(//*[text()='Bobcat T770 Compact Track Loader'])[1]"));
    WebElement value7 = Baseclass_Bcat.driver.findElement(By.xpath("(//*[text()='ROC: 1618 kg'])[1]"));
    
    bobcot.put(key6.getText(), value6.getText());
    bobcot.put(key7.getText(), value7.getText());
    
    WebElement excavators = Baseclass_Bcat.driver.findElement(By.xpath("(//*[text()='Compact Excavators'])[1]"));
    Baseclass_Bcat.buttonClick(excavators);
    
    
   
    Baseclass_Bcat.driver.findElement(By.xpath("(//*[@class='fa fa-angle-right fa-3 btn'])[3]")).click();
    
    WebElement key13 = Baseclass_Bcat.driver.findElement(By.xpath("(//*[text()='Bobcat E50z Compact Excavator'])[1]"));
    WebElement value13 = Baseclass_Bcat.driver.findElement(By.xpath("(//*[text()='Weight: 4819 kg'])[1]"));
    
//    bobcot.put(key8.getText(), value8.getText());
//    bobcot.put(key9.getText(), value9.getText());
//    bobcot.put(key10.getText(), value10.getText());
//    bobcot.put(key11.getText(), value11.getText());
//    bobcot.put(key12.getText(), value12.getText());
    bobcot.put(key13.getText(), value13.getText());
    
    
    Set<Entry<String, String>> entrySet = bobcot.entrySet();
    for (Entry<String, String> entry : entrySet) {
    	System.out.println(entry);
		
	}
}
}
