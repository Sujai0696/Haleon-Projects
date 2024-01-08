package com.qa.bens.checklist.page;

import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class SensodyneRedirectionPage extends BaseClass{

	public static LogFile log = new LogFile();

	public SensodyneRedirectionPage() {
		PageFactory.initElements(driver, this);
	}


	public void verifyUrl(String path, String URL, String sno) {
		try {
			launchURL(path);
			implicitWait();
			Thread.sleep(2000);
			log.info("<b>Landing URL :: </b>"+path);
			log.info("<b>Preprod URL :: </b>"+URL);
			log.info("<b>Sl.No :: </b>"+sno);
			Thread.sleep(2000);
			String launchingURL = getCurrentUrl();
			Thread.sleep(2000);

			if (compareTwoTextif(launchingURL, URL)) {
				System.out.println("After the redirection the current URL and colum B URL is matching");
				System.out.println("Current URL---->"+ launchingURL);
				System.out.println("Column B URL---->"+ URL);
				System.out.println("Serial Number---->"+ sno);
				log.pass("After the redirection the current URL and preprod URL is matching");
				log.pass("<b>Current URL :: </b>"+ launchingURL);
				log.pass("<b>Preprod URL :: </b>"+ URL);
				log.pass("<b>Sl.No :: </b>"+ sno);
			} else {
				System.out.println("After the redirection the current URL and Preprod URL is not matching");
				System.out.println("Current URL---->"+ launchingURL);
				System.out.println("Column B URL---->"+ URL);
				System.out.println("Serial Number---->"+ sno);
				log.fail("After the redirection the current URL and Preprod URL is not matching");
				log.fail("<b>Current URL :: </b>"+ launchingURL);
				log.fail("<b>Preprod URL :: </b>"+ URL);
				log.fail("<b>Sl.No :: </b>"+ sno);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
