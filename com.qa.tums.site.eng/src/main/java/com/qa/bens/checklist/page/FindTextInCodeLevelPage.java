package com.qa.bens.checklist.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class FindTextInCodeLevelPage extends BaseClass{
	
public static LogFile log = new LogFile();
	
	String currentUrl;
	
	public FindTextInCodeLevelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//body//*[not(self::noscript) and contains(text(),'Be-Total')]|//body//*[not(self::noscript) and contains(text(),'Be-total')]|//body//*[not(self::noscript) and contains(text(),'BE-TOTAL')]|//body//*[not(self::noscript) and contains(text(),'be-total')]")
	private static List<WebElement> beToTal;
	
	@FindBy(xpath = "//body//*[not(self::noscript) and contains(text(),'Compresse')]|//body//*[not(self::noscript) and contains(text(),'compresse')]|//body//*[not(self::noscript) and contains(text(),'COMPRESSE')]")
	private static List<WebElement> compresse;
	
	
	public void getBeTotalAndCompresse(String path) throws Exception {
		implicitWait();
		launchURL(path);
		implicitWait();
		pageLoad();
		currentUrl = getCurrentUrl();
		System.out.println(currentUrl);
		log.info(currentUrl);
		implicitWait();
		
		int size = beToTal.size();
		System.out.println("===============>:    "+size);
		
		String string2 = Integer.toString(size);
		
		
		if (size==0) {
			System.out.println("Be-Total is not presented in the page");
			System.out.println("Size===============>:    "+string2);
			log.pass("Be-Total is not presented in the page");
			log.info("Size===============>:    "+string2);
		} else {
			System.out.println("Be-Total is presented in the page");
			System.out.println("Size===============>:    "+string2);
			log.fail("Be-Total is presented in the page");
			log.info("Size===============>:    "+string2);
		}
		
		int dtSize = compresse.size();
		System.out.println("===============>:    "+dtSize);
		
		String dtstring2 = Integer.toString(dtSize);
		
		if (dtSize==0) {
			System.out.println("Compresse is not presented in the page");
			System.out.println("Size===============>:    "+dtstring2);
			log.pass("Compresse is not presented in the page");
			log.info("Size===============>:    "+dtstring2);
		} else {
			System.out.println("Compresse is  presented in the page");
			System.out.println("Size===============>:    "+dtstring2);
			log.fail("Compresse is presented in the page");
			log.info("Size===============>:    "+dtstring2);
		}
		
	}

}
