package com.qa.bens.checklist.page;

import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class CheckListNbspPage extends BaseClass{

	public static LogFile log = new LogFile();

	public CheckListNbspPage() {
		PageFactory.initElements(driver, this);
	}


	public void verifyNbsp() throws Exception{
		try {
			launchURL("https://haleonstaging2:Humanity23@panadol-com.preprod-cf65.ch.adobecqms.net/en-me-v4/");
			implicitWait();
			pageLoad();
			String currentUrl = getCurrentUrl();
			System.out.println(currentUrl);
//			log.info(currentUrl);
			implicitWait();
			
			
			
		try {
			ctrlFind();
			pageLoad();
			Screen screenOne = new Screen();
			Pattern patternOne = new Pattern("C:\\Users\\sujsekar\\Desktop\\repo\\com.qa.tums.site.eng\\tumsLogo\\SearchField.png");
			screenOne.wait(patternOne,5);    
			screenOne.type(patternOne,"gsk");
			pageLoad();
		
			Screen screenTwo = new Screen();
			Pattern patternTwo = new Pattern("C:\\Users\\sujsekar\\Desktop\\repo\\com.qa.tums.site.eng\\tumsLogo\\StyleTagImg.png");
			String textOne = screenTwo.find(patternTwo).text();
			System.out.println(textOne);
			pageLoad();
			
			if (compareTwoTextif("0/0 |", textOne))	{
				System.out.println("Pass: "+currentUrl);
//				log.pass("Text is not Presented in the page");
//				log.pass("Pass: "+currentUrl);
			}else{
				System.out.println("Fail: "+currentUrl);
//				log.fail("Text is presented in the page");
//				log.fail("Fail: "+currentUrl);
			}
//			pageLoad();
			ctrlA();
			backspace();
		} catch (Exception e) {
			e.printStackTrace();
		}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	



}
