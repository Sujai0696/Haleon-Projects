package com.qa.bens.checklist.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class CheckListRenditionPage extends BaseClass{
	
public static LogFile log = new LogFile();
	
	String currentUrl;
	
	public CheckListRenditionPage() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath = "//source[not(contains(@srcset,'rendition'))]")
	private static List<WebElement> notContainsRedintion;
	
	
	
	
	public void getNotRedintion(String path) throws Exception {
		implicitWait();
		launchURL(path);
		implicitWait();
		pageLoad();
		currentUrl = getCurrentUrl();
		System.out.println(currentUrl);
		log.info(currentUrl);
		implicitWait();
		
		int size = notContainsRedintion.size();
		System.out.println("===============>:    "+size);
		
//		String string2 = Integer.toString(size);
//		log.info("===============>:    "+string2);
		
		if (size==0) {
			System.out.println("Each srcset attribute contains the rendition:--->"+size);
			log.pass("Each srcset attribute contains the rendition:--->"+size);
		} else {
			System.out.println("srcset attribute does not contains rendition:--->"+size);
			log.fail("srcset attribute does not contains rendition:--->"+size);
		}
	}

}




//
//for (WebElement string : notContainsAlt) {
//	String attribute = string.getAttribute("finderpage");
//	System.out.println("buynow-button Tag which is not contains disablegtm Attribute");
//	System.out.println("Finderpage attribute value:  "+attribute);
//	System.out.println("**************************************");
//	log.fail("Disablegtm Attribute is not presented along with the buynow-button Tag");
//	log.fail("Finderpage attribute value:  "+attribute);
//	log.fail("****************************************************************");
//	
//}
