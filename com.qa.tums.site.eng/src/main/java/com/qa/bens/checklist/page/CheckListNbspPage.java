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


	public void verifyNbsp(String path) throws Exception{
		try {
			launchURL(path);
			implicitWait();
//			Thread.sleep(2000);
			String currentUrl = getCurrentUrl();
			System.out.println(currentUrl);
			log.info(currentUrl);
			implicitWait();
			
			
			
		try {
			ctrlFind();
//			pageLoad();
			Thread.sleep(1000);
			Screen screenOne = new Screen();
			Pattern patternOne = new Pattern("C:\\Users\\sujsekar\\git\\Haleon-Projects\\com.qa.tums.site.eng\\tumsLogo\\SearchField.png");
			screenOne.wait(patternOne,5);    
//			screenOne.type(patternOne,"Corega Maksimalna pokrivenost (Corega Max Seal)");
			screenOne.paste(patternOne, "Abreva");
//			pageLoad();
			//<sup>®</sup>
		
			Screen screenTwo = new Screen();
			Pattern patternTwo = new Pattern("C:\\Users\\sujsekar\\git\\Haleon-Projects\\com.qa.tums.site.eng\\tumsLogo\\StyleTagImg.png");
			String textOne = screenTwo.find(patternTwo).text();
			System.out.println(textOne);
//			pageLoad();
			
			if (compareTwoTextif("0/0 |", textOne))	{
				System.out.println("Pass: "+currentUrl);
				log.pass("Text is not Presented in the page");
				log.pass("Pass: "+currentUrl);
			}else{
				System.out.println("Fail: "+currentUrl);
				log.fail("Text is presented in the page");
				log.fail("Fail: "+currentUrl);
			}
			ctrlA();
//			pageLoad();
			backspace();
		} catch (Exception e) {
			e.printStackTrace();
		}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	



}
