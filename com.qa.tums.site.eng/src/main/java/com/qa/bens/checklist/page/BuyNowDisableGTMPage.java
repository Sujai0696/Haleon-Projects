package com.qa.bens.checklist.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class BuyNowDisableGTMPage extends BaseClass{
	
public static LogFile log = new LogFile();
	
	String currentUrl;
	

	public BuyNowDisableGTMPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//buynow-button[not(@disablegtm)]")
	private static List<WebElement> notDisableGTM;
	
	@FindBy(xpath = "//buynow-button[@disabletracking]")
	private static List<WebElement> disableTracking;
	
	@FindBy(tagName = "buynow-button")
	private static List<WebElement> buyNowTag;
	

	
	
//	@FindBy(xpath = "//buynow-button[(@disablegtm)]")
//	private static List<WebElement> notDisableGTM;
	
	
	
	
	public void getNotDisableGTMTag(String path) throws Exception {
		implicitWait();
		launchURL(path);
		implicitWait();
		pageLoad();
		currentUrl = getCurrentUrl();
		System.out.println(currentUrl);
		log.info(currentUrl);
		implicitWait();
		
		
//		int buyNowSize = buyNowTag.size();
//		System.out.println("BuyNow Button Tag Size===============>:    "+buyNowSize);
//		
//		String buyNowTagSize = Integer.toString(buyNowSize);
//		log.info("BuyNow Button Tag Size===============>:    "+buyNowTagSize);
		
		
		int size = notDisableGTM.size();
		System.out.println("Buynow button not contains disablegtm size===============>:    "+size);
		
		String string2 = Integer.toString(size);
		log.info("Buynow button not contains disablegtm size===============>:    "+string2);
		
		if (size==0) {
			System.out.println("Each buynow-button Tag contains disablegtm Attribute");
			log.pass("Each buynow-button Tag contains disablegtm Attribute");
		} else {
			for (WebElement string : notDisableGTM) {
				String attribute = string.getAttribute("finderpage");
				System.out.println("buynow-button Tag which is not contains disablegtm Attribute");
				System.out.println("Finderpage attribute value:  "+attribute);
				System.out.println("**************************************");
				log.fail("Disablegtm Attribute is not presented along with the buynow-button Tag");
				log.fail("Finderpage attribute value:  "+attribute);
				log.fail("****************************************************************");
				
			}
		}
		
		int dtSize = disableTracking.size();
		System.out.println("Buynow button contains disabletracking size===============>:    "+dtSize);
		
		String dtstring2 = Integer.toString(dtSize);
		log.info("Buynow button contains disabletracking size===============>:    "+dtstring2);
		
		if (dtSize==0) {
			System.out.println("Each buynow-button Tag does not contains disabletracking Attribute");
			log.pass("Each buynow-button Tag does not contains disabletracking Attribute");
		} else {
			for (WebElement string : disableTracking) {
				String attribute = string.getAttribute("finderpage");
				System.out.println("buynow-button Tag which is contains disabletracking Attribute");
				System.out.println("Finderpage attribute value:  "+attribute);
				System.out.println("**************************************");
				log.fail("buynow-button Tag which is contains disabletracking Attribute");
				log.fail("Finderpage attribute value:  "+attribute);
				log.fail("****************************************************************");
				
			}
		}
		
		
		
		
		
		
	}
}
