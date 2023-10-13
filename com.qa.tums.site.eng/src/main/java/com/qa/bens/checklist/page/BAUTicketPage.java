package com.qa.bens.checklist.page;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class BAUTicketPage extends BaseClass{
	
	public static LogFile log = new LogFile();
	public static String lauchingURL;
	
	public BAUTicketPage() {
		PageFactory.initElements(driver, this);
	}
	
	private WebElement xpathMethod(String xpathValue) {
		WebElement findElement = driver.findElement(By.xpath(xpathValue));
		return findElement;
	}
	
	
	public boolean waitDisplayed(WebElement ele) {
		boolean flag = false;
		try {
			WebDriverWait w = new WebDriverWait(driver, 2);
			w.until(ExpectedConditions.visibilityOf(ele));
			flag = true;
		} catch (TimeoutException e) {
			
		}
		return flag;
		
	}
	
	
	
	public void checkxPathValue(String path, String xpath, String Sno) throws Exception {
		
		try {
			launchURL(path);
			implicitWait();
			Thread.sleep(2000);
			lauchingURL = getCurrentUrl();
			System.out.println(lauchingURL);
			if (isElementPresent(xpathMethod(xpath))) {
				
				/**
				 * 
				 */
				clickElementUsingJavaScript(xpathMethod(xpath));
				pageLoad();
				String currentUrl = getCurrentUrl();
				if (compareTwoTextif(currentUrl, "https://www.pronamel.us/products/")) {
					System.out.println("After the redirection current URL and Recommended URL are same---->  "+lauchingURL+""+"--->   "+Sno);
					System.out.println("--->:  "+xpath+" :<---");
					log.pass(lauchingURL+"  After the redirection current URL and Recommended URL are same--->");
					log.pass(xpath+"     :---->"+Sno);
					
//					System.out.println("Xpath is presented in the---->  "+lauchingURL+""+"--->   "+Sno);
//					System.out.println("--->:  "+xpath+" :<---");
//					System.out.println("");
				} else {
					log.fail(lauchingURL+"  --->xpath is presented in this URL");
					log.fail(xpath+"     :---->"+Sno);
					Assert.assertTrue(false, "xpath is presented in the page");
				}
				/**
				 * 
				 */
			}
		} catch (Exception e) {
			System.out.println(lauchingURL+"  :xpath is not presented in this URL:   "+Sno);
			System.out.println("--->:  "+xpath+" :<---");
			log.pass(lauchingURL+"  --->xpath is not presented in this URL");
			log.pass(xpath+"     :---->"+Sno);
		}
		
		
		
		
	}

}
