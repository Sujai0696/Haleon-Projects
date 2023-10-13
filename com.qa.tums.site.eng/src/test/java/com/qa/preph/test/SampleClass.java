package com.qa.preph.test;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.python.antlr.ast.Str;
import org.openqa.selenium.By;

import com.qa.baseClass.BaseClass;

public class SampleClass extends BaseClass{


	public static void main(String[] args) throws IOException, Exception {

		browserLaunch(loadConfig("preph_Config.properties").getProperty("browser"));

//		https://www.preparationh.com/contact-us/
		launchURL("https://www.odol-med3.de/");

				JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
				String text = (String) jsExecutor.executeScript("return document.body.innerText;");
		
				  String[] lines = text.split("\n");
				  
				 List<String> abc = Arrays.asList(lines);
				 
//				 WorkSansRegular, arial, 
				 
				 String expectedFontFamily = "sans-serif"; 
				 
				 for (String string : abc) {
					 System.out.println(string);
					 
					 WebElement element = driver.findElement(By.xpath("//body//text()[normalize-space()='"+string+"']"));
					 String fontFamily = element.getCssValue("font-family");
					 String text2 = element.getText();
					 if (!text2.isBlank()) {
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
				 




		//	        // Iterate over each line and print the text
		//	        for (String line : lines) {
		//	        	line.
		//	        	
		//	            
		//	            
		//	        }
















		


		//		for (WebElement child : bodyElement.findElements(By.xpath("./*"))) {
		//			String fontFamily = child.getCssValue("font-family");
		//            String text = child.getText();
		//            if (!text.isEmpty()) {
		//                System.out.println("Text: " + text.trim());
		//                if (fontFamily.equalsIgnoreCase(expectedFontFamily)) {
		//    		        System.out.println("Font family is as expected.");
		//    		    } else {
		//    		        System.out.println("Font family is not as expected.");
		//    		    }
		//            }
		//        }

//		for (WebElement element : elements) {
//			String fontFamily = element.getCssValue("font-family");
//			String text = element.getText();
//			System.out.println(text);
//
//			if (!text.isBlank()) {
//				System.out.println("Element Text: " + element.getText());
//				System.out.println("Font Family: " + fontFamily);
//				System.out.println();
//
//				if (fontFamily.equalsIgnoreCase(expectedFontFamily)) {
//					System.out.println("Font family is as expected.");
//				} else {
//					System.out.println("Font family is not as expected.");
//				}
//			} 
//
//
//		}

		driver.quit();


	}

}
