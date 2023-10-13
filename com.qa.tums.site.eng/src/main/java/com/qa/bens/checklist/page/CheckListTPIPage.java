package com.qa.bens.checklist.page;

import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class CheckListTPIPage extends BaseClass{

	public CheckListTPIPage() {
		PageFactory.initElements(driver, this);
	}

	public static  SoftAssert soft = new SoftAssert();
	public static LogFile log = new LogFile();


	public static String priceSpider =  "PriceSpider"; 
	public static String gigya = "Gigya";
	public static String bazaarVoice = "BazaarVoice";
	public static String revtax = "RevTrax"; 
	public static String  shoppable = "Shoppable";
	public static String jebbit = "Jebbit";
	public static String preconnect = "preconnect";

	public void verifyTPI(String path) throws Exception{
		try {
			launchURL(path);
			implicitWait();
			String currentURL=driver.getCurrentUrl();
			implicitWait();
			String viewSource=driver.getPageSource();
			implicitWait();
			
			if (viewSource.contains(priceSpider)) {
				System.out.println("Viewsource Contains PriceSpider");
				log.pass(currentURL+" :Viewsource Contains PriceSpider ");
			} else {
				System.out.println("Viewsource not Contains PriceSpider");
				log.fail(currentURL+" :Viewsource not Contains PriceSpider");
				soft.assertTrue(false, "Viewsource not Contains PriceSpider"+currentURL);
			}

			if (viewSource.contains(gigya)) {
				System.out.println("Viewsource Contains gigya");
				log.pass(currentURL+" :Viewsource Contains gigya ");
			} else {
				System.out.println("Viewsource not Contains gigya");
				log.fail(currentURL+" :Viewsource not Contains gigya");
				soft.assertTrue(false, "Viewsource not Contains gigya"+currentURL);
			}

			if (viewSource.contains(bazaarVoice)) {
				System.out.println("Viewsource Contains BazaarVoice");
				log.pass(currentURL+" :Viewsource Contains BazaarVoice ");
			} else {
				System.out.println("Viewsource not Contains BazaarVoice");
				log.fail(currentURL+" :Viewsource not Contains BazaarVoice");
				soft.assertTrue(false, "Viewsource not Contains BazaarVoice"+currentURL);
			}

			if (viewSource.contains(revtax)) {
				System.out.println("Viewsource Contains Revtax");
				log.pass(currentURL+" :Viewsource Contains Revtax");
			} else {
				System.out.println("Viewsource not Contains Revtax");
				log.fail(currentURL+" :Viewsource not Contains Revtax");
				soft.assertTrue(false, "Viewsource not Contains Revtax"+currentURL);
			}

			if (viewSource.contains(shoppable)) {
				System.out.println("Viewsource Contains shoppable");
				log.pass(currentURL+" :Viewsource Contains shoppable");
			} else {
				System.out.println("Viewsource not Contains shoppable");
				log.fail(currentURL+" :Viewsource not Contains shoppable");
				soft.assertTrue(false, "Viewsource not Contains shoppable"+currentURL);
			}

			if (viewSource.contains(jebbit)) {
				System.out.println("Viewsource Contains jebbit");
				log.pass(currentURL+" :Viewsource Contains jebbit");
			} else {
				System.out.println("Viewsource not Contains jebbit");
				log.fail(currentURL+" :Viewsource not Contains jebbit");
				soft.assertTrue(false, "Viewsource not Contains jebbit"+currentURL);
			}

			if (viewSource.contains(preconnect)) {
				System.out.println("Viewsource Contains preconnect");
				log.pass(currentURL+" :Viewsource Contains preconnect");
			} else {
				System.out.println("Viewsource not Contains preconnect");
				log.fail(currentURL+" :Viewsource not Contains preconnect");
				soft.assertTrue(false, "Viewsource not Contains preconnect"+currentURL);
			}
			soft.assertAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



