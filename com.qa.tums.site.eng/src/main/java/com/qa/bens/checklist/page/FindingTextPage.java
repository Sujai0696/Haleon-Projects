package com.qa.bens.checklist.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class FindingTextPage extends BaseClass{
	
	public FindingTextPage() {
		PageFactory.initElements(driver, this);
	}
	
public static LogFile log = new LogFile();
	
	
	public void verifyTextInPage(String Path) {
		implicitWait();
		try {
			launchURL(Path);
			String currentUrl = getCurrentUrl();
			implicitWait();
			pageLoad();
			log.info(currentUrl);
			
			ctrlFind();
			pageLoad();
			
			
			Screen screenOne = new Screen();
			Pattern patternOne = new Pattern("C:\\Users\\sujsekar\\Desktop\\Automation Code\\git\\Automation-Code\\com.qa.tums.site.eng\\tumsLogo\\SearchField.png");
			screenOne.wait(patternOne,5);    
			screenOne.type(patternOne,"Be-Total");
			pageLoad();
		
			Screen screenTwo = new Screen();
			Pattern patternTwo = new Pattern("C:\\Users\\sujsekar\\Desktop\\Automation Code\\git\\Automation-Code\\com.qa.tums.site.eng\\tumsLogo\\StyleTagImg.png");
			String textOne = screenTwo.find(patternTwo).text();
			System.out.println(textOne);
			
			if (compareTwoTextif("0/0", textOne))	{
				System.out.println("Pass: "+currentUrl);
				log.pass("Be-Total is not Presented in the page");
				log.pass("Pass: "+currentUrl);
			}else{
				System.out.println("Fail: "+currentUrl);
				log.fail("Be-Total is presented in the page");
				log.fail("Fail: "+currentUrl);
//				Assert.assertTrue(false, "gsk is presented in the page"+ currentUrl);
			}
			
//		************************************************************************************************	
			
			ctrlA();
			backspace();
			
			Screen screenThree = new Screen();
			Pattern patternThree = new Pattern("C:\\Users\\sujsekar\\Desktop\\Automation Code\\git\\Automation-Code\\com.qa.tums.site.eng\\tumsLogo\\SearchField.png");
			screenThree.wait(patternThree,5);    
			screenThree.type(patternThree,"compresse");
			pageLoad();
			
			Screen screenFour = new Screen();
			Pattern patternFour = new Pattern("C:\\Users\\sujsekar\\Desktop\\Automation Code\\git\\Automation-Code\\com.qa.tums.site.eng\\tumsLogo\\StyleTagImg.png");
			String textTwo = screenFour.find(patternFour).text();
			System.out.println(textTwo);
			
			if (compareTwoTextif("0/0", textTwo))	{
				System.out.println("Pass: "+currentUrl);
				log.pass("compresse is not Presented in the page");
				log.pass("Pass: "+currentUrl);
			}else{
				System.out.println("Fail: "+currentUrl);
				log.fail("compresse is presented in the page");
				log.fail("Fail: "+currentUrl);
//				Assert.assertTrue(false, "GlaxoSmithKline is presented in the page"+ currentUrl);
			}
			
//		*******************************************************************************************************			
			
			ctrlA();
			backspace();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
