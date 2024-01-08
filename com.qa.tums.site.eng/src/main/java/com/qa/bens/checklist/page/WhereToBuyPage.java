package com.qa.bens.checklist.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class WhereToBuyPage extends BaseClass{
	
	public static LogFile log = new LogFile();
	String currentUrl;
	
	public WhereToBuyPage() {
		PageFactory.initElements(driver, this);
	}
	
	////*[contains(@channeladvisorurl,'pid=12047909') and text()='Where to buy']
	@FindBy(xpath = "//*[text()='BUY NOW' or text()='Buy Now']")
	private static List<WebElement> wtb;
	
	
public void getBuyNowCount(String path) {
		
		try {
			launchURL(path);
			implicitWait();
			Thread.sleep(2000);
			String currentUrl = getCurrentUrl();
			System.out.println(currentUrl);
			log.info(currentUrl);
			
			
			int btnSize = wtb.size();
			String buyNowSize = Integer.toString(btnSize);
			
				
				if (btnSize==0) {
					System.out.println("All Where to by Button Contains PID number");
					log.pass("All Where to by Button Contains PID number");
					log.info("Size===============>:    "+buyNowSize);
				} else {
					System.out.println("Not all the Where to by Button contains PID Number");
					log.fail("Not all the Where to by Button contains PID Number");
					log.info("Size===============>:    "+buyNowSize);
				}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	

}

	


