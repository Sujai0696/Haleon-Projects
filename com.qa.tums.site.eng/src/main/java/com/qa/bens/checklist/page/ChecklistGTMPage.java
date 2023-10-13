package com.qa.bens.checklist.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class ChecklistGTMPage extends BaseClass{

		public static LogFile log = new LogFile();

	public ChecklistGTMPage() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//*[contains(text(),'GTM-PLTF9WB')]")
	private static WebElement gtmText;

	@FindBy(xpath = "//*[@id='ot-sdk-btn']//self::button[text()='Paramètres des cookies']")
	private static WebElement cookieSetting;







	public void findingGTMInPage(String path) throws Exception{
		
		SoftAssert soft = new SoftAssert();
		//"https://haleonstaging1:Health2023@preparationh-v3-com.preprod-cf65.ch.adobecqms.net/"
		launchURL(path);
		implicitWait();
		String currentURL = driver.getCurrentUrl();
		String gtmId = "GTM-PLTF9WB";
		String viewSource = driver.getPageSource();
		try {

			if (isElementPresent(gtmText)) {
				System.out.println("GTM is displayed in the page");
				log.pass(currentURL+ ": GTM is displayed in the page");
			}else {
				System.out.println("GTM is not displayed in the page");
				log.fail(currentURL+ " :GTM is not displayed in the page");
				soft.assertTrue(false, "GTM is not displayed in the page"+currentURL);
			}
			if (viewSource.contains(gtmId)) {
				System.out.println("GTM is displayed in source code page");
				log.pass(currentURL+ ": GTM is displayed in the source code page");
			}else {
				System.out.println("GTM is not displayed in source code page");
				log.fail(currentURL + " :GTM is not displayed in the source code page");
				soft.assertTrue(false, "GTM is not displayed in the source code page"+currentURL);
			}
//			if (isElementPresent(cookieSetting)) {
//				System.out.println("Cookie setting is displayed in the page");
//				log.pass(currentURL+ "Cookie setting is displayed in the page");
//			}else {
//				System.out.println("Cookie setting is not displayed in the page");
//				log.fail(currentURL+ " :Cookie setting is not displayed in the page");
//				soft.assertTrue(false, "Cookie setting is not displayed in the page"+currentURL);
//			}
			soft.assertAll();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
}

//			if (gtmText.isDisplayed()&& viewSource.contains(gtmId)) {
//				System.out.println("GTM ID is Correct :"+currentURL);
//				log.pass(currentURL);
// 				Assert.assertTrue(true, "Correct GTM ID is present :" + currentURL + "");
// 				
//			} else {
//				System.out.println("GTM ID is not correct" + currentURL);
//				Assert.assertTrue(false, "Correct GTM ID is not present"+ currentURL + "");
//			}
//		} catch (Exception e) {
//			throw new Exception("GTM text is not Displayed in the page"+currentURL);
//		}
//	}
//
//
//	public void findingGTMInSourceCode(String path) throws Exception{
////		"https://haleonstaging1:Health2023@preparationh-v3-com.preprod-cf65.ch.adobecqms.net/"
//		launchURL(path);
////		Thread.sleep(3000);
//		implicitWait();
//		String currentUrl = getCurrentUrl();
//		
//		
//		try {
//			if (viewSource.contains(gtmId)) {
//				System.out.println("GTM is present: "+currentUrl);
//				log.pass(currentUrl);
//				Assert.assertTrue(true, "GTM ID is present: "+currentUrl);
//				
//			}else {
//				System.out.println("GTM is not present: "+currentUrl);
//				log.fail(currentUrl);
//				Assert.assertTrue(false, "GTM ID is not present: "+currentUrl);
//			}
//		} catch (Exception e) {
//			throw new Exception("GTM text is not Displayed in the page"+currentUrl);
//		}
//	}
//	
//	public void findingCookieSettings(String path) throws Exception{
//		//"https://haleonstaging1:Health2023@preparationh-v3-com.preprod-cf65.ch.adobecqms.net/"
//		launchURL(path);
////		Thread.sleep(3000);
//		implicitWait();
//		String currentURL = driver.getCurrentUrl();
//		try {
//			
//			if (cookieSetting.isDisplayed()) {
//				System.out.println("Cookie Setting is correct: "+currentURL);
//				log.pass(currentURL);
//				Assert.assertTrue(true, "Cookie setting button is present :" + currentURL + "");
//			} else {
//				System.out.println("Cookie setting button is not correct" + currentURL);
//				log.fail(currentURL);
//				Assert.assertTrue(false, "Cookie setting button is present :" + currentURL + "");
//			}
//		} catch (Exception e) {
//			Assert.assertTrue(false);
//			
//		}
//	}








