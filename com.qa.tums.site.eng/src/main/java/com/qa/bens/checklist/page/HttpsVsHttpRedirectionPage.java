package com.qa.bens.checklist.page;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class HttpsVsHttpRedirectionPage extends BaseClass{
	
	public static LogFile log = new LogFile();
	
	
	public HttpsVsHttpRedirectionPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyHttpsVsHttpRedirecion(String path) throws Exception{
		implicitWait();
		try {
			launchURL(path);
			String currentUrl = getCurrentUrl();
			String pageTitle = getPageTitle();
			implicitWait();
//			Thread.sleep(1500);
			String https = "https:";
			String http = "http:";

			if (currentUrl.contains(https)) {
				System.out.println(currentUrl);
				String httpRedirection = currentUrl.replace(https, http);
				System.out.println(httpRedirection);
				launchURL(httpRedirection);
				
				String currentUrl2 = getCurrentUrl();
				System.out.println(currentUrl2);
				implicitWait();
//				Thread.sleep(1500);
				String pageTitle2 = getPageTitle();
				
				if (pageTitle.equals(pageTitle2)) {
					log.pass(currentUrl);
					System.out.println("Page Title is matched with before and after redirection");
					compareTwoText(pageTitle, pageTitle2);
				} else{
					log.fail(currentUrl);
					System.out.println("Page Title is not matched with before and after redirection"+currentUrl);
					Assert.assertTrue(false, "Page Title is not matching with before and after redirection :"+currentUrl2+"");
				}
				System.out.println("Redirection verified successfully :" + currentUrl2);
			}else {
				log.fail(currentUrl);
				System.out.println("Current URL is not contains HTTPS: "+ currentUrl);
				Assert.assertTrue(false, "Current URL is not contains https :"+currentUrl+"");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
