package com.qa.centrum.eng.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SampleSiteExecition extends BaseClass{
	
	public static void main(String[] args) throws Exception {
		browserLaunch("chrome");
		launchURL("https://www.sensodyne.com/en-us/");
		
		WebElement findElement = driver.findElement(By.xpath("(//i[@class='icon icon-Sensodyne-logo'])[1]"));

		visibilityOf(findElement);
		Assert.assertTrue(elementIsDisplayed(findElement));
		System.out.println("displayed");
		
		
		
		
	}

}
