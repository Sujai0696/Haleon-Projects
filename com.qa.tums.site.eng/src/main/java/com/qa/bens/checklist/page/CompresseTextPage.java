package com.qa.bens.checklist.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class CompresseTextPage extends BaseClass{
	
	public static LogFile log = new LogFile();

	String currentUrl;
	
	public CompresseTextPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[contains(@alt,'Compresse') or contains(@alt,'compresse') or contains(@alt,'COMPRESSE')]")
	private static List<WebElement> altText;

	@FindBy(xpath = "//*[contains(@title,'Compresse') or contains(@title,'compresse') or contains(@title,'COMPRESSE')]")
	private static List<WebElement> titleText;

	@FindBy(xpath = "//*[contains(@content,'Compresse') or contains(@content,'compresse') or contains(@content,'COMPRESSE')]")
	private static List<WebElement> contentText;

	@FindBy(xpath = "//*[contains(@href,'Compresse') or contains(@href,'compresse') or contains(@href,'COMPRESSE')]")
	private static List<WebElement> hrefLink;
	
	@FindBy(xpath = "//title[contains(text(),'Compresse') or contains(text(),'compresse') or contains(text(),'COMPRESSE')]")
	private static List<WebElement> titletagText;
	
	
	
	public void getCompresse(String path) throws Exception {
		implicitWait();
		launchURL(path);
		implicitWait();
		pageLoad();
		currentUrl = getCurrentUrl();
		System.out.println(currentUrl);
		log.info(currentUrl);
		implicitWait();
		
		
//		int altTextSize = altText.size();
//		String altTextSizeOne = Integer.toString(altTextSize);
//		
//		if (altTextSize==0) {
//			System.out.println("altTextCompresse is not presented in the page");
//			System.out.println("Size===============>:    "+altTextSizeOne);
//			log.pass("altTextCompresse is not presented in the page");
//			log.info("Size===============>:    "+altTextSizeOne);
//		} else {
//			System.out.println("altTextCompresse is presented in the page");
//			System.out.println("Size===============>:    "+altTextSizeOne);
//			log.fail("altTextCompresse is presented in the page");
//			log.info("Size===============>:    "+altTextSizeOne);
//		}
//		
//		
//		int titleTextSize = titleText.size();
//		String titleTextSizeOne = Integer.toString(titleTextSize);
//		
//		if (titleTextSize==0) {
//			System.out.println("titleTextCompresse is not presented in the page");
//			System.out.println("Size===============>:    "+titleTextSizeOne);
//			log.pass("titleTextCompresse is not presented in the page");
//			log.info("Size===============>:    "+titleTextSizeOne);
//		} else {
//			System.out.println("titleTextCompresse is presented in the page");
//			System.out.println("Size===============>:    "+titleTextSizeOne);
//			log.fail("titleTextCompresse is presented in the page");
//			log.info("Size===============>:    "+titleTextSizeOne);
//		}
//		
//		int contentTextSize = contentText.size();
//		String contentTextSizeOne = Integer.toString(contentTextSize);
//		
//		if (contentTextSize==0) {
//			System.out.println("contentTextCompresse is not presented in the page");
//			System.out.println("Size===============>:    "+contentTextSizeOne);
//			log.pass("contentTextCompresse is not presented in the page");
//			log.info("Size===============>:    "+contentTextSizeOne);
//		} else {
//			System.out.println("contentTextCompresse is presented in the page");
//			System.out.println("Size===============>:    "+contentTextSizeOne);
//			log.fail("contentTextCompresse is presented in the page");
//			log.info("Size===============>:    "+contentTextSizeOne);
//		}
//		
//		int hrefLinkSize = hrefLink.size();
//		String hrefLinkSizeOne = Integer.toString(hrefLinkSize);
//		
//		if (hrefLinkSize==0) {
//			System.out.println("CompresseInLinks is not presented in the page");
//			System.out.println("Size===============>:    "+hrefLinkSizeOne);
//			log.pass("CompresseInLinks is not presented in the page");
//			log.info("Size===============>:    "+hrefLinkSizeOne);
//		} else {
//			System.out.println("CompresseInLinks is presented in the page");
//			System.out.println("Size===============>:    "+hrefLinkSizeOne);
//			log.fail("CompresseInLinks is presented in the page");
//			log.info("Size===============>:    "+hrefLinkSizeOne);
//		}
		
		
		
		int titleTagTextSize = titletagText.size();
		String titleTagTextSizeOne = Integer.toString(titleTagTextSize);
		
		if (titleTagTextSize==0) {
			System.out.println("titleTagTextCompresse is not presented in the page");
			System.out.println("Size===============>:    "+titleTagTextSizeOne);
			log.pass("titleTagTextCompresse is not presented in the page");
			log.info("Size===============>:    "+titleTagTextSizeOne);
		} else {
			System.out.println("titleTagTextCompresse is presented in the page");
			System.out.println("Size===============>:    "+titleTagTextSizeOne);
			log.fail("titleTagTextCompresse is presented in the page");
			log.info("Size===============>:    "+titleTagTextSizeOne);
		}
		
		
		
		

	}
}
