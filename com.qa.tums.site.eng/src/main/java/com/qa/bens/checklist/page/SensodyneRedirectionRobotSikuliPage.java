package com.qa.bens.checklist.page;

import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class SensodyneRedirectionRobotSikuliPage extends BaseClass{

	public static LogFile log = new LogFile();

	public SensodyneRedirectionRobotSikuliPage() {
		PageFactory.initElements(driver, this);
	}



	public void verifyUrl(String path, String URL, String sno) {
		try {
			launchURL(path);
			implicitWait();
			Thread.sleep(2000);
			log.info(path);
			log.info(URL);
			log.info(sno);
			
			pageLoad();
			Screen screenOne = new Screen();
			Pattern patternOne = new Pattern("C:\\Users\\sujsekar\\git\\Haleon-Projects\\com.qa.tums.site.eng\\tumsLogo\\Sign-in Image.png");
			screenOne.wait(patternOne,5);    
			
			if (patternOne.isValid()) {
				Screen screenTwo = new Screen();
				Pattern patternTwo = new Pattern("C:\\Users\\sujsekar\\git\\Haleon-Projects\\com.qa.tums.site.eng\\tumsLogo\\Username_Field.png");
				screenTwo.wait(patternTwo,5); 
				screenTwo.paste(patternTwo, "haleonstaging2");
				
				Screen screenThree = new Screen();
				Pattern patternThree = new Pattern("C:\\Users\\sujsekar\\git\\Haleon-Projects\\com.qa.tums.site.eng\\tumsLogo\\Password_Field.png");
				screenThree.wait(patternThree,5); 
				screenThree.paste(patternThree, "Humanity23");
				tab();
				enter();
				Thread.sleep(2000);
				String launchingURL = getCurrentUrl();
				pageLoad();
				if (compareTwoTextif(launchingURL, URL)) {
					System.out.println("After the redirection the current URL and colum B URL is matching");
					System.out.println("Current URL---->"+ launchingURL);
					System.out.println("Column B URL---->"+ URL);
					System.out.println("Serial Number---->"+ sno);
					log.pass("After the redirection the current URL and colum B URL is matching");
					log.pass("Current URL---->"+ launchingURL);
					log.pass("Column B URL---->"+ URL);
					log.pass("Serial Number---->"+ sno);
				} else {
					System.out.println("After the redirection the current URL and colum B URL is not matching");
					System.out.println("Current URL---->"+ launchingURL);
					System.out.println("Column B URL---->"+ URL);
					System.out.println("Serial Number---->"+ sno);
					log.fail("After the redirection the current URL and colum B URL is not matching");
					log.fail("Current URL---->"+ launchingURL);
					log.fail("Column B URL---->"+ URL);
					log.fail("Serial Number---->"+ sno);

				}
				
			} else {
				Thread.sleep(2000);
				String launchingURL = getCurrentUrl();
				pageLoad();
				if (compareTwoTextif(launchingURL, URL)) {
					System.out.println("After the redirection the current URL and colum B URL is matching");
					System.out.println("Current URL---->"+ launchingURL);
					System.out.println("Column B URL---->"+ URL);
					System.out.println("Serial Number---->"+ sno);
					log.pass("After the redirection the current URL and colum B URL is matching");
					log.pass("Current URL---->"+ launchingURL);
					log.pass("Column B URL---->"+ URL);
					log.pass("Serial Number---->"+ sno);
				} else {
					System.out.println("After the redirection the current URL and colum B URL is not matching");
					System.out.println("Current URL---->"+ launchingURL);
					System.out.println("Column B URL---->"+ URL);
					System.out.println("Serial Number---->"+ sno);
					log.fail("After the redirection the current URL and colum B URL is not matching");
					log.fail("Current URL---->"+ launchingURL);
					log.fail("Column B URL---->"+ URL);
					log.fail("Serial Number---->"+ sno);

				}

			}
			

			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}




}
