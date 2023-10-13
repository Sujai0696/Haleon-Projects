package com.qa.preph.pages;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.python.antlr.ast.Str;

import com.qa.baseClass.BaseClass;

public class ContentTestingPage extends BaseClass{

	public ContentTestingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(tagName = "main")
	private static WebElement mainTag;
	
	
	
//	public List<String> getAllText() {
////		ArrayList<String> txt = null;
//		List<WebElement> findElements = mainTag.findElements(By.xpath(".//*[normalize-space(text())]"));
//		String text = null;
//		List<String> listOne = new ArrayList<String>();
//		
//			for (int i = 0; i < findElements.size(); i++) {
//
//				text = findElements.get(i).getText();
//				
//				listOne.add(text);
//			}
//		
////		for (WebElement webElement : findElements) {
////			
////			String text = webElement.getText();
////			 txt = new ArrayList<String>();
////			txt.add(text);
////			
////		}
//		return listOne ;
//		
//		
//	}
		
	
	
	
	

//	public List<String> getAllTheText() {
//		List<String> abc = null;
//		ArrayList<String> txt = new ArrayList<String>();
//		implicitWait();
//		try {
//			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//			String text = (String) jsExecutor.executeScript("return document.body.innerText;");
//
//			String[] lines = text.split("\n");
//
//			abc = Arrays.asList(lines);
//			
//			for (int i = 0; i < lines.length; i++) {
//				String string = abc.get(i);
//				
//				
//			}
//
//			for (String string : abc) {
//				txt.add(string);
//			}
//			System.out.println(txt);
//
//
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		return txt;
//	}
	
	
	public List<String> getAllText() {
//		ArrayList<String> txt = null;
		List<WebElement> findElements = driver.findElements(By.xpath("//*[not(self::script)][not(self::style)][string-length(normalize-space(text())) > 0]"));
		String text = null;
		List<String> listOne = new ArrayList<String>();
		
		for (WebElement element : findElements) {
		     text = element.getText();
		    
		    if (!text.isBlank()) {
//				System.out.println("Element Text: " + element.getText());
				listOne.add(text);
				
			} 
		}
		
//			for (int i = 0; i < findElements.size(); i++) {
//
//				text = findElements.get(i).getText();
//				
//				listOne.add(text);
//			}
		
//		for (WebElement webElement : findElements) {
//			
//			String text = webElement.getText();
//			 txt = new ArrayList<String>();
//			txt.add(text);
//			
//		}
		return listOne ;
		
		
	}
	
}	
	
