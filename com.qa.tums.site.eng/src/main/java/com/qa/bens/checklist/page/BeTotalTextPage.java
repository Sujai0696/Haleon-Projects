package com.qa.bens.checklist.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class BeTotalTextPage extends BaseClass{

	public static LogFile log = new LogFile();

	String currentUrl;

	public BeTotalTextPage() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//*[contains(@alt,'Be-Total') or contains(@alt,'Be-total') or contains(@alt,'be-total') or contains(@alt,'BE-TOTAL')]")
	private static List<WebElement> altText;

	@FindBy(xpath = "//*[contains(@title,'Be-Total') or contains(@title,'Be-total') or contains(@title,'be-total') or contains(@title,'BE-TOTAL')]")
	private static List<WebElement> titleText;

	@FindBy(xpath = "//*[contains(@content,'Be-Total') or contains(@content,'Be-total') or contains(@content,'be-total') or contains(@content,'BE-TOTAL')]")
	private static List<WebElement> contentText;

	@FindBy(xpath = "//*[contains(@href,'Be-Total') or contains(@href,'Be-total') or contains(@href,'be-total') or contains(@href,'BE-TOTAL')]")
	private static List<WebElement> hrefLink;
	
	@FindBy(xpath = "//title[contains(text(),'Be-Total') or contains(text(),'Be-total') or contains(text(),'be-total') or contains(text(),'BE-TOTAL')]")
	private static List<WebElement> titletagText;




	public void getBeTotal(String path) throws Exception {
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
//			System.out.println("altTextBetotal is not presented in the page");
//			System.out.println("Size===============>:    "+altTextSizeOne);
//			log.pass("altTextBetotal is not presented in the page");
//			log.info("Size===============>:    "+altTextSizeOne);
//		} else {
//			System.out.println("altTextBetotal is presented in the page");
//			System.out.println("Size===============>:    "+altTextSizeOne);
//			log.fail("altTextBetotal is presented in the page");
//			log.info("Size===============>:    "+altTextSizeOne);
//		}
//		
//		
//		int titleTextSize = titleText.size();
//		String titleTextSizeOne = Integer.toString(titleTextSize);
//		
//		if (titleTextSize==0) {
//			System.out.println("titleTextBetotal is not presented in the page");
//			System.out.println("Size===============>:    "+titleTextSizeOne);
//			log.pass("titleTextBetotal is not presented in the page");
//			log.info("Size===============>:    "+titleTextSizeOne);
//		} else {
//			System.out.println("titleTextBetotal is presented in the page");
//			System.out.println("Size===============>:    "+titleTextSizeOne);
//			log.fail("titleTextBetotal is presented in the page");
//			log.info("Size===============>:    "+titleTextSizeOne);
//		}
//		
//		int contentTextSize = contentText.size();
//		String contentTextSizeOne = Integer.toString(contentTextSize);
//		
//		if (contentTextSize==0) {
//			System.out.println("contentTextBetotal is not presented in the page");
//			System.out.println("Size===============>:    "+contentTextSizeOne);
//			log.pass("contentTextBetotal is not presented in the page");
//			log.info("Size===============>:    "+contentTextSizeOne);
//		} else {
//			System.out.println("contentTextBetotal is presented in the page");
//			System.out.println("Size===============>:    "+contentTextSizeOne);
//			log.fail("contentTextBetotal is presented in the page");
//			log.info("Size===============>:    "+contentTextSizeOne);
//		}
//		
//		int hrefLinkSize = hrefLink.size();
//		String hrefLinkSizeOne = Integer.toString(hrefLinkSize);
//		
//		if (hrefLinkSize==0) {
//			System.out.println("betotalInLinks is not presented in the page");
//			System.out.println("Size===============>:    "+hrefLinkSizeOne);
//			log.pass("betotalInLinks is not presented in the page");
//			log.info("Size===============>:    "+hrefLinkSizeOne);
//		} else {
//			System.out.println("betotalInLinks is presented in the page");
//			System.out.println("Size===============>:    "+hrefLinkSizeOne);
//			log.fail("betotalInLinks is presented in the page");
//			log.info("Size===============>:    "+hrefLinkSizeOne);
//		}
		
		int titleTagTextSize = titletagText.size();
		String titleTagTextSizeOne = Integer.toString(titleTagTextSize);
		
		if (titleTagTextSize==0) {
			System.out.println("titleTagTextBeTotal is not presented in the page");
			System.out.println("Size===============>:    "+titleTagTextSizeOne);
			log.pass("titleTagTextBeTotal is not presented in the page");
			log.info("Size===============>:    "+titleTagTextSizeOne);
		} else {
			System.out.println("titleTagTextBeTotal is presented in the page");
			System.out.println("Size===============>:    "+titleTagTextSizeOne);
			log.fail("titleTagTextBeTotal is presented in the page");
			log.info("Size===============>:    "+titleTagTextSizeOne);
		}

	}

}
