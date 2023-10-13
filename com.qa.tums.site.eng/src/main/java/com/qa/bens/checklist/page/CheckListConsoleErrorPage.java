package com.qa.bens.checklist.page;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class CheckListConsoleErrorPage extends BaseClass {

	public CheckListConsoleErrorPage() {
		PageFactory.initElements(driver, this);
	}

	public static LogFile log = new LogFile();

	public void verifyConsoleError(String path) throws Exception{
		launchURL(path);
		Thread.sleep(3000);
		ctrlShiftIKeyPress();
		Thread.sleep(3000);
		String currentUrl = getCurrentUrl();
		
		try {
			Screen s = new Screen();
			
			Pattern pt = new Pattern("C:\\Users\\sujsekar\\Desktop\\Automation Code\\git\\Automation-Code\\com.qa.tums.site.eng\\tumsLogo\\ErrorIcon.png");
			
			
			
			if (s.exists(pt) != null)	{
				System.out.println("----->Failed<-----Error Icon is presented: " + currentUrl);
				ctrlShiftIKeyPress();
				log.fail(currentUrl+" :Error Icon is presented");
				Assert.assertTrue(false, "Error Icon is presented in the page: "+ currentUrl);
			}else{
				System.out.println("----->Passed<-----Error Icon is not presented: "+currentUrl);
				ctrlShiftIKeyPress();
				log.pass(currentUrl+" :Error Icon is not presented");
				Assert.assertTrue(true, "Error Icon is not presented in the page: "+ currentUrl);
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
