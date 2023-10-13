package com.qa.bens.checklist.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class CheckListAltTextPage extends BaseClass{
	
public static LogFile log = new LogFile();
	
	String currentUrl;
	
	public CheckListAltTextPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[not(@alt)]")
	private static List<WebElement> notContainsAltText;
	
	@FindBy(tagName = "img")
	private static List<WebElement> imgTag;
	
	@FindBy(xpath = "//img[@alt]")
	private static List<WebElement> imgTagWithAlt;
	
	@FindBy(xpath = "//img[not(contains(@class,'lazyloaded'))]")
	private static List<WebElement> lazyloaded;
	
	
	
	
	public void getNotContainsAltText(String path) throws Exception {
		implicitWait();
		launchURL(path);
		implicitWait();
		pageLoad();
		currentUrl = getCurrentUrl();
		System.out.println(currentUrl);
		log.info(currentUrl);
		implicitWait();
		
//		int imgSize = imgTag.size();
//		System.out.println("Overall img tag size:===>    "+imgSize);
//		
//		String imgTagSize = Integer.toString(imgSize);
//		log.info("Overall img tag size:===>    "+imgTagSize);
//		
//		int imgWithAlt = imgTagWithAlt.size();
//		System.out.println("Overall img tag with alt attribute size:===>    "+imgWithAlt);
//		
//		String imgTagWithAlt = Integer.toString(imgWithAlt);
//		log.info("Overall img tag with alt attribute size:===>    "+imgTagWithAlt);
//		
//		
//		
//		
//		int size = notContainsAltText.size();
//		System.out.println("===============>:    "+size);
		
		int size = lazyloaded.size();
		System.out.println("===============>:    "+size);
		
//		String string2 = Integer.toString(size);
//		log.info("===============>:    "+string2);
		
//		if (size==0) {
//			System.out.println("Each Img tag contains Alt text attribute:--->"+size);
//			log.pass("Each Img tag contains Alt text attribute:--->"+size);
//		} else {
//			System.out.println("Img tag not contains Alt text attribute:--->"+size);
//			log.fail("Img tag not contains Alt text attribute:--->"+size);
//		}
		
		if (size==0) {
			System.out.println("Each Img tag contains lazyloaded attributevalue:--->"+size);
			log.pass("Each Img tag contains lazyloaded attribute value:--->"+size);
		} else {
			System.out.println("Img tag not contains lazyloaded attribute value:--->"+size);
			log.fail("Img tag not contains lazyloaded attribute value:--->"+size);
		}
	}

}


