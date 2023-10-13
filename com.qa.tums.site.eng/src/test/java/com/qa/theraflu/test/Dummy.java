package com.qa.theraflu.test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.qa.baseClass.BaseClass;

public class Dummy extends BaseClass{
	
	public static void main(String[] args) throws IOException, Exception {
		
		browserLaunch(loadConfig("theraflu_Config.properties").getProperty("browser"));
		launchURL("https://www.google.co.in/");
		Thread.sleep(5000);
		
//		List<WebElement> elements = driver.findElements(By.xpath("//p[contains(normalize-space(), 'Bei der Gewinnspielteilnahme erhaltet der Teilnehmer einen komoot-Voucher als Sofortgewinn im Wert von 8,99 € für das Regionen-Paket.')]"));
//		
//		int size = elements.size();
//		System.out.println(size);
//		
//		int altTextSize = elements.size();
//		String altTextSizeOne = Integer.toString(altTextSize);
//		
//		System.out.println(altTextSizeOne);
		
		
//		for (WebElement webElement : findElements) {
//			
//			String text = webElement.getText();
//			
//			int count = 0;
//			
//			
//			
//			if (text.contains("Bei der Gewinnspielteilnahme erhaltet der Teilnehmer einen komoot-Voucher als Sofortgewinn im Wert von 8,99 € für das Regionen-Paket.")) {
//				System.out.println("Text is presented in the page");
//				count = count+1;
//				break;
//			} else {
//				
//				System.out.println("Text is not presented in the page");
//			}
//			System.out.println("***************************************");
//			System.out.println(count);
//		}
      
		
		
		
		do {
			ctrlFind();
			Thread.sleep(5000);
			refreshWebPage();
			Thread.sleep(5000);
			ctrlFind();
			
		} while (true);
		
		
	}

}
