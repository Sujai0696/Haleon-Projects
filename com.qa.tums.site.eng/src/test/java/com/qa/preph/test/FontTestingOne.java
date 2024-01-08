package com.qa.preph.test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.qa.baseClass.BaseClass;

public class FontTestingOne extends BaseClass{

	public static void main(String[] args) throws IOException, Exception {

		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));
		
		//https://www.polident.com/en-us/contact-us/

		launchURL("https://www.fenistil.co.il/");

		String expectedFontFamily = "sans-serif"; 
		
		List<WebElement> textElements = driver.findElements(By.xpath("//*[not(self::script)][not(self::style)][string-length(normalize-space(text())) > 0]"));

		for (WebElement element : textElements) {
		    String text = element.getText();
		    String fontFamily = element.getCssValue("font-family");
		    
		    if (!text.isBlank()) {
				System.out.println("Element Text: " + element.getText());
				System.out.println("Font Family: " + fontFamily);
//				System.out.println();

				if (fontFamily.equalsIgnoreCase(expectedFontFamily)) {
					System.out.println("Font family is as expected.");
				} else {
					System.out.println("Font family is not as expected.");
				}
				System.out.println("******************************************");
				
			} 
		}



	}
}


