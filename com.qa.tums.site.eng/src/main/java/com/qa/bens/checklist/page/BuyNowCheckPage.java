package com.qa.bens.checklist.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class BuyNowCheckPage extends BaseClass{
	
	public static LogFile log = new LogFile();
	String currentUrl;
	
	public BuyNowCheckPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()='BUY NOW']")
	private static List<WebElement> btnBuyNow;
	
	@FindBy(xpath = "//*[contains(@channeladvisorurl,'pid=12047887') and text()='BUY NOW']")
	private static List<WebElement> pid;
	
	//*[text()='Comprar Ahora']
	//*[contains(@channeladvisorurl,'pid=12047904') and text()='Comprar Ahora']
	
//	@FindBy(xpath = "//*[contains(@channeladvisorurl,'pid=12047909') and text()='Where to buy']")
//	private static List<WebElement> wtb;
	
	
	public void getBuyNowCount(String path) {
		
		try {
			launchURL(path);
			implicitWait();
			Thread.sleep(2000);
			String currentUrl = getCurrentUrl();
			System.out.println(currentUrl);
			log.info(currentUrl);
			
			
			int btnSize = btnBuyNow.size();
			String buyNowSize = Integer.toString(btnSize);
			
			
			
			
			if (btnSize==0) {
				System.out.println("Buy Now Button is not presented in the page");
				System.out.println("Size===============>:    "+buyNowSize);
				log.skip("Buy Now Button is not presented in the page");
				log.info("Size===============>:    "+buyNowSize);
			} else {
				System.out.println("Buy Now Button is presented in the page");
				System.out.println("Size===============>:    "+buyNowSize);
//				log.fail("Buy Now Button is presented in the page");
				log.info("Buy Now Button is presented in the page"+"Size===============>:    "+buyNowSize);
				
				int pidBuyNow = pid.size();
				String pidBuyNowSize = Integer.toString(pidBuyNow);
				
				if (btnSize==pidBuyNow) {
					System.out.println("All Buy Now Button Contains PID number");
					log.pass("All Buy Now Button Contains PID number");
					log.info("Size===============>:    "+pidBuyNowSize);
				} else {
					System.out.println("Not all the Buy Now Button contains PID Number");
					log.fail("Not all the Buy Now Button contains PID Number");
					log.info("Size===============>:    "+pidBuyNowSize);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	

}
