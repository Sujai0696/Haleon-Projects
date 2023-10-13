package com.qa.bens.checklist.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class AddingPriceSpiderPage extends BaseClass{
	
	public static LogFile log = new LogFile();
	
	String currentUrl;
	
	public AddingPriceSpiderPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//head//self::script[@type='text/javascript' and @src='//cdn.pricespider.com/1/2721/ps-utid.js' and @async]")
	private static WebElement priceSpider;
	
	
	public void addPriceSpider(String path) throws Exception {
		implicitWait();
		launchURL(path);
		implicitWait();
		pageLoad();
		
		currentUrl = getCurrentUrl();
		System.out.println(currentUrl);
		log.info(currentUrl);
		implicitWait();
		
		if (isElementPresent(priceSpider)) {
			System.out.println("PriceSpider is added to the head tag for the current URL:--->"+currentUrl);
			log.pass("PriceSpider is added to the head tag for the current URL:--->"+currentUrl);
		} else {
			System.out.println("PriceSpider is not added to the head tag for the current URL:--->"+currentUrl);
			log.fail("PriceSpider is not added to the head tag for the current URL:--->"+currentUrl);
		}
	}
}
