package com.qa.bens.checklist.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class StyleTagVerificationPage extends BaseClass{

	public static LogFile log = new LogFile();

	public StyleTagVerificationPage() {
		PageFactory.initElements(driver, this);
	}






	public void verifyStyleTag() throws Exception{
		try {
//			view-source:https://www.caltrate.com/bone-health-central/health-tips/pumpkin-seeds-can-help-support-bone-health/
//			view-source:https://www.caltrate.com/
			launchURL("view-source:https://www.caltrate.com/");
			String currentUrl = getCurrentUrl();
			implicitWait();
			ctrlFind();
			Screen s = new Screen();
			Pattern pt = new Pattern("C:\\Users\\sujsekar\\Desktop\\Automation Code\\git\\Automation-Code\\com.qa.tums.site.eng\\tumsLogo\\SearchField.png");
			s.wait(pt,5);    
			s.type(pt,"<style>");
			Pattern style = new Pattern("C:\\Users\\sujsekar\\Desktop\\Automation Code\\git\\Automation-Code\\com.qa.tums.site.eng\\tumsLogo\\StyleTagImg.png");
			
			 if (s.exists(style) != null)	{
			    	System.out.println("Pass: "+currentUrl);
//			    	log.pass(currentUrl+" :Style tag is not Presented");
				}
				else{
					System.out.println("Fail: "+currentUrl);
//					log.fail(currentUrl+" :Style tag is Presented");
					Assert.assertTrue(false, "Style tag is presented in the page"+ currentUrl);
					
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}





}
