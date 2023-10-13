package com.qa.bens.checklist.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class CheckListOGTagverificationPage extends BaseClass{
	
	public static LogFile log = new LogFile();

	public CheckListOGTagverificationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//meta[@property='og:type']")
	private static WebElement type;
	
	@FindBy(xpath = "//meta[@property='og:url']")
	private static WebElement url;
	
	@FindBy(xpath = "//meta[@property='og:description']")
	private static WebElement descriptions;
	
	@FindBy(xpath = "//meta[@property='og:title']")
	private static WebElement title;
	
	@FindBy(xpath = "//meta[@name='description']")
	private static WebElement metaDescription;
	
	
	
	
	
	
	
	
	public void verifyingOGTag(String path) throws Exception{
		SoftAssert soft = new SoftAssert();
		implicitWait();
		launchURL(path);
		implicitWait();
		
		String type1="website";
		
		String url1 = getCurrentUrl();
		
		
		
		String title1 = getPageTitle();
		
		String description1 = getElementAttribute(descriptions, "content");
		
		String type2 = getElementAttribute(type, "content");
		
		String url2 = getElementAttribute(url, "content");
		
		String title2 = getElementAttribute(title, "content");
		
		String description2 = getElementAttribute(metaDescription, "content");
		
		
		
		System.out.println("Type 1---->  "+type1);
		System.out.println("Type 2---->  "+type2);
		
		System.out.println("URL 1 ---->  "+url1);
		System.out.println("URL 2 ---->  "+url2);
		
		System.out.println("Title 1 ---->  "+title1);
		System.out.println("Title 2 ---->  "+title2);
		
		System.out.println("Description 1---->"+description1);
		System.out.println("Description 2---->"+description2);
		
		
		
		try {
//			Assert.assertEquals(type1, type2);
//			Assert.assertEquals(url1, url2);
//			Assert.assertEquals(title1, title2);
//			Assert.assertEquals(description1, description2);
			if (type1.equals(type2)) {
				System.out.println("Type is matched: "+ url1);
				log.pass(url1+ ": Type is matched");
			} else {
				System.out.println("Type is not matched: " + url1);
				log.fail(url1+": Type is not matched");
				soft.assertTrue(false, ": Type is not matched"+url1);
			}
//			/////////////////////////////////////////////////////////////
			if (url1.contains("haleonstaging1:Health2023@")) {
				String replaceURL = url1.replace("haleonstaging1:Health2023@", "");
				if (replaceURL.equals(url2)) {
					System.out.println("URL is matched: "+ replaceURL);
					log.pass(replaceURL+ ": URL is matched");
				} else {
					System.out.println("URL is not matched: " + replaceURL);
					log.fail(replaceURL+": URL is not matched");
					soft.assertTrue(false, ": URL is not matched"+replaceURL);
				}
			} else {
				if (url1.equals(url2)) {
					System.out.println("URL is matched: "+ url1);
					log.pass(url1+ ": URL is matched");
				} else {
					System.out.println("URL is not matched: " + url1);
					log.fail(url1+": URL is not matched");
					soft.assertTrue(false, ": URL is not matched"+url1);
				}
			}
			//////////////////////////////////////////////////
//			if (title1.equals(title2)) {
//				System.out.println("Title is matched: "+ url1);
//				log.pass(url1+ ": Title is matched");
//			} else {
//				System.out.println("Title is not matched: " + url1);
//				log.fail(url1+": Title is not matched");
//				soft.assertTrue(false, ": Title is not matched"+url1);
//			}
//			//////////////////////////////////////////////////////////////////
//			if (description1.equals(description2)) {
//				System.out.println("Description is matched: "+ url1);
//				log.pass(url1+ ": Description is matched");
//			} else {
//				System.out.println("Description is not matched: " + url1);
//				log.fail(url1+": Description is not matched");
//				soft.assertTrue(false, ": Description is not matched"+url1);
//			}
			soft.assertAll();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
