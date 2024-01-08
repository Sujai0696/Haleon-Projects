package com.qa.flonase.test;

import java.io.IOException;

import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.flonase.pages.CMXPage;

public class CMXTest extends BaseClass{
	
	CMXPage cmx;
	
	@BeforeClass
	private void launchingTheBrowser() throws IOException, Exception {
		browserLaunch(loadConfig("Flonase_Config.properties").getProperty("browser"));
	}
	
	@BeforeMethod
	private void launchingTheUrl() throws Exception {
		cmx = new CMXPage();
		launchURL("https://cmxweb.influx.co.in/");
	}
	
	
	@Test(priority = 0)
	private void verifyLoginPage() throws Exception {
		cmx.clickLogin();
		
	}
	
	public static void main(String[] args) throws Exception {
		
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		launchURL("view-source:https://www.biotene.com/");
		implicitWait();
		Thread.sleep(2000);
		
	
		
		try {
			ctrlFind();
			pageLoad();
			Screen screenOne = new Screen();
			Pattern patternOne = new Pattern("C:\\Users\\sujsekar\\git\\Haleon-Projects\\com.qa.tums.site.eng\\tumsLogo\\SearchField.png");
			screenOne.wait(patternOne,5);    
			screenOne.type(patternOne,"DR"+screenOne.paste("Ž")+"ANJE");
			screenOne.paste(patternOne, "");
			
			pageLoad();
		
			Screen screenTwo = new Screen();
			Pattern patternTwo = new Pattern("C:\\Users\\sujsekar\\git\\Haleon-Projects\\com.qa.tums.site.eng\\tumsLogo\\StyleTagImg.png");
			String textOne = screenTwo.find(patternTwo).text();
			System.out.println(textOne);
			pageLoad();
			
			if (compareTwoTextif("0/0 |", textOne))	{
				System.out.println("pass");
			}else{
				System.out.println("Fail");
			}
//			ctrlA();
//			pageLoad();
//			backspace();
		} catch (Exception e) {
			e.printStackTrace();
		}
			

		
		
		
	}
	

}
