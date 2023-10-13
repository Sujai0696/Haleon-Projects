package com.qa.bens.checklist.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class BAUTextPage extends BaseClass{

	public static LogFile log = new LogFile();

	String currentUrl;

	public BAUTextPage() {
		PageFactory.initElements(driver, this);
	}

//	@FindBy(xpath = "//*[contains(text(),'††Among leading cough and cold brands.')]")
//	private static List<WebElement> text;
//	
//	@FindBy(tagName = "img")
//	private static List<WebElement> imgTag;
	
	
	@FindBy(xpath = "//*[contains(text(),'PiriNatural')]")
	private static List<WebElement> text;



	public void verifyParticularText(String path) throws Exception {
		try {
			implicitWait();
//			"https://www.parodontax.com/es-es/"
			launchURL(path);
//			Thread.sleep(15000);
			implicitWait();
			pageLoad();
			currentUrl = getCurrentUrl();
			System.out.println(currentUrl);
			log.info(currentUrl);
			pageLoad();
			implicitWait();


//			int tagSize = imgTag.size();
//			String imgTagSize = Integer.toString(tagSize);
//			System.out.println(tagSize);
			
			int textSize = text.size();
			String textSizeOne = Integer.toString(textSize);
			
			
			
			
			
//			if (tagSize==0) {
//				System.out.println("Img Tag is not presented in the page");
//				log.fail("Img Tag is not presented in the page");
//			} else {
//				for (WebElement string : imgTag) {
//					String attribute = string.getAttribute("src");
//					String attribute1 = string.getAttribute("data-src");
//					System.out.println("Img tag is Presented in the Page");
//					System.out.println(attribute1+"<------>"+attribute);
////					log.pass("Img tag is Presented in the Page");
////					log.pass(attribute);
//					System.out.println("**************************************");
//				}
//			}
			
			
			
			
			

			if (textSize==0) {
				System.out.println("Text is not presented in the page");
				System.out.println("Size===============>:    "+textSizeOne);
				log.pass("Text is not presented in the page");
				log.info("Size===============>:    "+textSizeOne);
			} else {
				System.out.println("Text is presented in the page");
				System.out.println("Size===============>:    "+textSizeOne);
				log.fail("Text is presented in the page");
				log.info("Size===============>:    "+textSizeOne);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}



}
