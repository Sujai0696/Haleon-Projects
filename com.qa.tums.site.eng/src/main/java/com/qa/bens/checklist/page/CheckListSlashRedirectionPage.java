package com.qa.bens.checklist.page;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class CheckListSlashRedirectionPage extends BaseClass{
	
	public static LogFile log = new LogFile();
	
	public CheckListSlashRedirectionPage() {
		PageFactory.initElements(driver, this);
	}

	
	public void verifyLastSlashRedirection(String path) throws Exception{
		try {
			launchURL(path);
			String currentUrl = getCurrentUrl();
			System.out.println(currentUrl);
			String BfLaunching = getPageTitle();
			int length = currentUrl.length();
			if (currentUrl.endsWith("/")) {
				String substring = currentUrl.substring(0, length-1);
				System.out.println("After removing the slash: " + substring);
				launchURL(substring);
				String aftLaunching = getPageTitle();
				
				if (BfLaunching.equals(aftLaunching)) {
					log.pass(currentUrl);
					System.out.println("*****After removing the slash. URL launched successfully*****"+currentUrl);
				} else {
					log.fail(currentUrl);
					System.out.println("*****After removing the slash. URL getting Error*****"+currentUrl);
					Assert.assertTrue(false, "*****After removing the slash. URL getting Error"+currentUrl+"");
				}
			} else if (!currentUrl.endsWith("/")) {
				launchURL(currentUrl+"/");
				String currentUrl2 = getCurrentUrl();
				System.out.println(currentUrl2);
				String aftLaunching1 = getPageTitle();
				if (BfLaunching.equals(aftLaunching1)) {
					log.pass(currentUrl);
					System.out.println("*****After Adding the slash. URL launched successfully*****"+currentUrl);
				} else {
					log.fail(currentUrl);
					System.out.println("*****After Adding the slash. URL getting Error*****"+currentUrl);
					Assert.assertTrue(false, "*****After Adding the slash. URL getting Error"+currentUrl+"");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
