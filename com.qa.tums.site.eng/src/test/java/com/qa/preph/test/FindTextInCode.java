package com.qa.preph.test;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.qa.baseClass.BaseClass;

public class FindTextInCode extends BaseClass{
	
	
	public static void main(String[] args) throws IOException, Exception {

		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));

		launchURL("https://haleonstaging1:Health2023@betotal-net.preprod-cf65.ch.adobecqms.net/");

		
//		String pageSource = driver.getPageSource();
//
//		// Remove the content within <noscript> tags from the page source
//		pageSource = pageSource.replaceAll("<noscript>[\\s\\S]*?</noscript>", "");
//
//		String searchTerm = "Be-Total";
//		int count = 0;
//		Pattern pattern = Pattern.compile(searchTerm);
//		Matcher matcher = pattern.matcher(pageSource);
//
//		while (matcher.find()) {
//		    count++;
//		}
//
//		System.out.println("Occurrences of 'Be-Total': " + count);
//
//		driver.quit();

		
//		List<WebElement> elements = driver.findElements(By.xpath("//*[contains(@attribute,'Be-Total')]"));
//        int count = elements.size();
//        System.out.println("Occurrences of attribute value 'Be-Total': " + count);
//
//        driver.quit();
		

//		 int count = 0;
//	        List<WebElement> elements = driver.findElements(By.xpath("//*[@*[contains(.,'Be-Total')]]"));
//	        count = elements.size();
//
//	        System.out.println("Occurrences of attributes containing 'Be-Total' value: " + count);
//
//	        driver.quit();
		
		 String searchText = "Be-Total"; // Replace "your_text" with the text you want to search

	        int count = 0;
	        List<WebElement> paragraphs = driver.findElements(By.tagName("p"));
	        for (WebElement paragraph : paragraphs) {
	            String text = paragraph.getText();
	            if (text.contains(searchText)) {
	                count++;
	            }
	        }

	        System.out.println("Occurrences of '" + searchText + "' in paragraphs: " + count);

	        driver.quit();


		
		
		
		
		
		
		
		

	}
}
