package com.qa.bens.checklist.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class GskPresencePage extends BaseClass{
	
	public static LogFile log = new LogFile();
	
	public GskPresencePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[contains(@href,'gsk') or contains(@href,'Gsk') or contains(@href,'GSK')]")
	private static List<WebElement> gskInLink;
	
	@FindBy(xpath = "//*[contains(@alt,'GSK') or contains(@alt,'Gsk') or contains(@alt,'gsk')]")
	private static List<WebElement> altText;

	@FindBy(xpath = "//*[contains(@title,'GSK') or contains(@title,'Gsk') or contains(@title,'gsk')]")
	private static List<WebElement> titleText;

	
	public void verifyGSKInViewSourcepage() {
		implicitWait();
		try {
			launchURL("https://haleonstaging2:Humanity23@panadol-com.preprod-cf65.ch.adobecqms.net/en-me-v4/");
			implicitWait();
			pageLoad();
			String currentUrl = getCurrentUrl();
//			log.info(currentUrl);
			
//			int size = gskInLink.size();
//			System.out.println(size);
//			
//			String string2 = Integer.toString(size);
////			log.info(string2);
//			pageLoad();
			
			
//			if (size==0) {
//				System.out.println("GSK Links are not presented in the page");
//				System.out.println("Size===============>:    "+string2);
//				log.pass("GSK Links are not presented in the page");
//				log.info("Size===============>:    "+string2);
//			} else {
//				System.out.println("altTextGSK is presented in the page");
//				System.out.println("Size===============>:    "+string2);
//				log.fail("GSK links are Presented in the Page");
//				log.info("Size===============>:    "+string2);
//			}
			
//			if (size==0) {
//				log.pass("GSK Links are not presented in the page");
//			} else {
//				for (WebElement string : gskInLink) {
//					String attribute2 = string.getAttribute("href");
//					String attribute = string.getAttribute("textContent");
//					System.out.println(attribute+"  <----->  "+attribute2);
//					log.fail("GSK links are Presented in the Page");
//					log.fail(attribute+"<----->"+attribute2);
//					System.out.println("**************************************");
//				}
//			}
			
//			************************************************************************************************
			
//			int altTextSize = altText.size();
//			String altTextSizeOne = Integer.toString(altTextSize);
//			
//			if (altTextSize==0) {
//				System.out.println("altTextGSK is not presented in the page");
//				System.out.println("Size===============>:    "+altTextSizeOne);
//				log.pass("altTextGSK is not presented in the page");
//				log.info("Size===============>:    "+altTextSizeOne);
//			} else {
//				System.out.println("altTextGSK is presented in the page");
//				System.out.println("Size===============>:    "+altTextSizeOne);
//				log.fail("altTextGSK is presented in the page");
//				log.info("Size===============>:    "+altTextSizeOne);
//			}
//			
////			************************************************************************************************		
//			int titleTextSize = titleText.size();
//			String titleTextSizeOne = Integer.toString(titleTextSize);
//			
//			if (titleTextSize==0) {
//				System.out.println("titleTextGSK is not presented in the page");
//				System.out.println("Size===============>:    "+titleTextSizeOne);
//				log.pass("titleTextGSK is not presented in the page");
//				log.info("Size===============>:    "+titleTextSizeOne);
//			} else {
//				System.out.println("titleTextGSK is presented in the page");
//				System.out.println("Size===============>:    "+titleTextSizeOne);
//				log.fail("titleTextGSK is presented in the page");
//				log.info("Size===============>:    "+titleTextSizeOne);
//			}
			
//		***********************************************************************************************			
			
			ctrlFind();
			pageLoad();
			Screen screenOne = new Screen();
			Pattern patternOne = new Pattern("C:\\Users\\sujsekar\\Desktop\\Automation Code\\git\\Automation-Code\\com.qa.tums.site.eng\\tumsLogo\\SearchField.png");
			screenOne.wait(patternOne,5);    
			screenOne.type(patternOne,"gsk");
			pageLoad();
			
			Screen screenTwo = new Screen();
			Pattern patternTwo = new Pattern("C:\\Users\\sujsekar\\Desktop\\Automation Code\\git\\Automation-Code\\com.qa.tums.site.eng\\tumsLogo\\StyleTagImg.png");
			String textOne = screenTwo.find(patternTwo).text();
			System.out.println(textOne);
			pageLoad();
			
			if (compareTwoTextif("0/0", textOne))	{
				System.out.println("Pass: "+currentUrl);
//				log.pass("GSK is not Presented in the page");
//				log.pass("Pass: "+currentUrl);
			}else{
				System.out.println("Fail: "+currentUrl);
//				log.fail("GSK is presented in the page");
//				log.fail("Fail: "+currentUrl);
//				Assert.assertTrue(false, "gsk is presented in the page"+ currentUrl);
			}
			
//		************************************************************************************************	
			
			ctrlA();
			backspace();
			
			Screen screenThree = new Screen();
			Pattern patternThree = new Pattern("C:\\Users\\sujsekar\\Desktop\\Automation Code\\git\\Automation-Code\\com.qa.tums.site.eng\\tumsLogo\\SearchField.png");
			screenThree.wait(patternThree,5);    
			screenThree.type(patternThree,"GlaxoSmithKline");
			pageLoad();
			
			Screen screenFour = new Screen();
			Pattern patternFour = new Pattern("C:\\Users\\sujsekar\\Desktop\\Automation Code\\git\\Automation-Code\\com.qa.tums.site.eng\\tumsLogo\\StyleTagImg.png");
			String textTwo = screenFour.find(patternFour).text();
			System.out.println(textTwo);
			pageLoad();
			
			if (compareTwoTextif("0/0", textTwo))	{
				System.out.println("Pass: "+currentUrl);
//				log.pass("GlaxoSmithKline is not Presented in the page");
//				log.pass("Pass: "+currentUrl);
			}else{
				System.out.println("Fail: "+currentUrl);
//				log.fail("GlaxoSmithKline is presented in the page");
//				log.fail("Fail: "+currentUrl);
//				Assert.assertTrue(false, "GlaxoSmithKline is presented in the page"+ currentUrl);
			}
			
//		*******************************************************************************************************			
			
			ctrlA();
			backspace();
			
			Screen screenFive = new Screen();
			Pattern patternFive = new Pattern("C:\\Users\\sujsekar\\Desktop\\Automation Code\\git\\Automation-Code\\com.qa.tums.site.eng\\tumsLogo\\SearchField.png");
			screenFive.wait(patternFive,5);    
			screenFive.type(patternFive,"Glaxo Smith Kline");
			pageLoad();
			
			Screen screenSix = new Screen();
			Pattern patternSix = new Pattern("C:\\Users\\sujsekar\\Desktop\\Automation Code\\git\\Automation-Code\\com.qa.tums.site.eng\\tumsLogo\\StyleTagImg.png");
			String textThree = screenSix.find(patternSix).text();
			System.out.println(textThree);
			pageLoad();
			
			if (compareTwoTextif("0/0", textThree))	{
				System.out.println("Pass: "+currentUrl);
//				log.pass("Glaxo Smith Kline is not Presented in the page");
//				log.pass("Pass: "+currentUrl);
			}else{
				System.out.println("Fail: "+currentUrl);
//				log.fail("Glaxo Smith Kline is presented in the page");
//				log.fail("Fail: "+currentUrl);
//				Assert.assertTrue(false, "Glaxo Smith Kline is presented in the page"+ currentUrl);
			}
			
			
			ctrlA();
			backspace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
