package com.qa.preph.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.baseClass.BaseClass;

public class DummyClass extends BaseClass{

	public static void main(String[] args) throws Exception{

		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));

		launchURL("https://www.centrum.com/about/");

		List<WebElement> elements = driver.findElements(By.xpath("//body//*[text() and not(*)]"));
		
//		//*[@id='content']//*[text()]
		
//		//main//text()[normalize-space()]

		String expectedFontFamily = "sans-serif"; 

		for (WebElement element : elements) {
			String fontFamily = element.getCssValue("font-family");
			String text = element.getText();

			if (!text.isBlank()) {
				System.out.println("Element Text: " + element.getText());
				System.out.println("Font Family: " + fontFamily);
				System.out.println();

				if (fontFamily.equalsIgnoreCase(expectedFontFamily)) {
					System.out.println("Font family is as expected.");
				} else {
					System.out.println("Font family is not as expected.");
				}
				
			} 
		}
	}
}
