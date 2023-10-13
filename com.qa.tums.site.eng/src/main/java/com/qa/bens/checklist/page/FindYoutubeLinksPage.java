package com.qa.bens.checklist.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class FindYoutubeLinksPage extends BaseClass{
	
	public static LogFile log = new LogFile();

	String currentUrl;
	
	public FindYoutubeLinksPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//iframe[contains(@id,'video') or contains(@src,'www.youtube.com')]")
	private static List<WebElement> ytLinks;
	
	
	@FindBy(xpath = "//*[contains(text(),'PM-TR-SENO-21-00059')]")
	private static List<WebElement> expiredCode;
	
	
	
	public void getExpiredCode(String path) throws Exception {
		implicitWait();
		launchURL(path);
		implicitWait();
		pageLoad();
		currentUrl = getCurrentUrl();
		System.out.println(currentUrl);
		log.info(currentUrl);
		implicitWait();
		
		
//		int ytLinksSize = ytLinks.size();
//		String youTubeLinksSize = Integer.toString(ytLinksSize);
//		
//		if (ytLinksSize==0) {
//			System.out.println("YouTube Link is not presented in the page");
//			System.out.println("Size===============>:    "+youTubeLinksSize);
//			log.pass("YouTube Link  is not presented in the page");
//			log.info("Size===============>:    "+youTubeLinksSize);
//		} else {
//			System.out.println("YouTube Link  is presented in the page");
//			System.out.println("Size===============>:    "+youTubeLinksSize);
//			log.fail("YouTube Link  is presented in the page");
//			log.info("Size===============>:    "+youTubeLinksSize);
//		}
		
		int codeSize = expiredCode.size();
		String expiredCodeSize = Integer.toString(codeSize);
		
		if (codeSize==0) {
			System.out.println("code is not presented in the page");
			System.out.println("Size===============>:    "+expiredCodeSize);
			log.pass("code is not presented in the page");
			log.info("Size===============>:    "+expiredCodeSize);
		} else {
			System.out.println("Code is presented in the page");
			System.out.println("Size===============>:    "+expiredCodeSize);
			log.fail("Code is presented in the page");
			log.info("Size===============>:    "+expiredCodeSize);
		}
		
		
		
		
		
		

	}
	
	
}
