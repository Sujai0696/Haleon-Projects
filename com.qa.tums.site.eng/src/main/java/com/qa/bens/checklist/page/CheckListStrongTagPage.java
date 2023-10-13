package com.qa.bens.checklist.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class CheckListStrongTagPage extends BaseClass{
	
	public static LogFile log = new LogFile();
	
	public CheckListStrongTagPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//h1//strong)[1]")
	private static List<WebElement> strongTagH1;
	
	@FindBy(xpath = "(//h2//strong)[1]")
	private static List<WebElement> strongTagH2;
	
	@FindBy(xpath = "(//h3//strong)[1]")
	private static List<WebElement> strongTagH3;
	
	@FindBy(xpath = "(//h4//strong)[1]")
	private static List<WebElement> strongTagH4;
	
	@FindBy(xpath = "(//h5//strong)[1]")
	private static List<WebElement> strongTagH5;
	
	@FindBy(xpath = "(//h6//strong)[1]")
	private static List<WebElement> strongTagH6;
	
	
	
	
	
	public void verifyStrongTag(String path) throws Exception{
		implicitWait();
		SoftAssert soft = new SoftAssert();
//		try {
//			String currentURL = driver.getCurrentUrl();
//			
//			if (isElementPresent(strongTagH3)){
//				log.fail(currentURL);
//				Assert.assertTrue(false, "Strong tag is present under h3 :"+currentURL+"");
//			}
//			else {
//				log.pass(currentURL);
//				System.out.println("Strong Tag is not present --->" +currentURL );
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	try {
		launchURL(path);
		String currentURL = driver.getCurrentUrl();
		
		if (strongTagH1.size()==0) {
			log.pass(currentURL);
			System.out.println("Strong Tag is not present under h1--->: " +currentURL );
		} else {
			log.fail(currentURL);
			soft.assertTrue(false, "Strong tag is present under h1--->: "+currentURL+"");
		}
		
		if (strongTagH2.size()==0) {
			log.pass(currentURL);
			System.out.println("Strong Tag is not present under h2--->: " +currentURL );
		} else {
			log.fail(currentURL);
			soft.assertTrue(false, "Strong tag is present under h2--->: "+currentURL+"");
		}
		if (strongTagH3.size()==0) {
			log.pass(currentURL);
			System.out.println("Strong Tag is not present under h3--->: " +currentURL );
		} else {
			log.fail(currentURL);
			soft.assertTrue(false, "Strong tag is present under h3--->: "+currentURL+"");
		}
		
		if (strongTagH4.size()==0) {
			log.pass(currentURL);
			System.out.println("Strong Tag is not present under h4--->: " +currentURL );
		} else {
			log.fail(currentURL);
			soft.assertTrue(false, "Strong tag is present under h4--->: "+currentURL+"");
		}
		
		if (strongTagH5.size()==0) {
			log.pass(currentURL);
			System.out.println("Strong Tag is not present under h5--->: " +currentURL );
		} else {
			log.fail(currentURL);
			soft.assertTrue(false, "Strong tag is present under h5--->: "+currentURL+"");
		}
		if (strongTagH6.size()==0) {
			log.pass(currentURL);
			System.out.println("Strong Tag is not present under h6--->: " +currentURL );
		} else {
			log.fail(currentURL);
			soft.assertTrue(false, "Strong tag is present under h6--->: "+currentURL+"");
		}
		soft.assertAll();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	
	}
	

}
