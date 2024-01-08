package com.qa.bens.checklist.page;

import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.qa.baseClass.BaseClass;
import com.qa.tums.eng.util.LogFile;

public class ChannelAdvisorPage extends BaseClass{

	public static LogFile log = new LogFile();

	public ChannelAdvisorPage() {
		PageFactory.initElements(driver, this);
	}

	public void verifySourcePage(String path) throws Exception{
		try {
			launchURL(path);
			implicitWait();
			Thread.sleep(2000);
			String currentUrl = getCurrentUrl();
			System.out.println(currentUrl);
			log.info(currentUrl);
			implicitWait();



			try {
				ctrlFind();
				pageLoad();
				Screen screenOne = new Screen();
				Pattern patternOne = new Pattern("C:\\Users\\sujsekar\\git\\Haleon-Projects\\com.qa.tums.site.eng\\tumsLogo\\SearchField.png");
				screenOne.wait(patternOne,5);    
				screenOne.paste(patternOne, "ps-key");
				pageLoad();

				Screen screenTwo = new Screen();
				Pattern patternTwo = new Pattern("C:\\Users\\sujsekar\\git\\Haleon-Projects\\com.qa.tums.site.eng\\tumsLogo\\StyleTagImg.png");
				String textOne = screenTwo.find(patternTwo).text();
				System.out.println(textOne);
				pageLoad();

				if (compareTwoTextif("0/0 |", textOne))	{
					System.out.println("Pass: "+currentUrl);
					log.pass("ps-key is not Presented in the page");
				}else{
					System.out.println("Fail: "+currentUrl);
					log.fail("ps-key is presented in the page");
				}

				ctrlA();
				pageLoad();
				backspace();
				//****************************************************************************	
				pageLoad();
				Screen screenThree = new Screen();
				Pattern patternThree = new Pattern("C:\\Users\\sujsekar\\git\\Haleon-Projects\\com.qa.tums.site.eng\\tumsLogo\\SearchField.png");
				screenThree.wait(patternThree,5);    
				screenThree.paste(patternThree, "ps-country");
				pageLoad();

				Screen screenFour = new Screen();
				Pattern patternFour = new Pattern("C:\\Users\\sujsekar\\git\\Haleon-Projects\\com.qa.tums.site.eng\\tumsLogo\\StyleTagImg.png");
				String textTwo = screenFour.find(patternFour).text();
				System.out.println(textTwo);
				pageLoad();

				if (compareTwoTextif("0/0 |", textTwo))	{
					System.out.println("Pass: "+currentUrl);
					log.pass("ps-country is not Presented in the page");
				}else{
					System.out.println("Fail: "+currentUrl);
					log.fail("ps-country is presented in the page");
				}

				ctrlA();
				pageLoad();
				backspace();
				//*******************************************************************

				pageLoad();
				Screen screenFive = new Screen();
				Pattern patternFive = new Pattern("C:\\Users\\sujsekar\\git\\Haleon-Projects\\com.qa.tums.site.eng\\tumsLogo\\SearchField.png");
				screenFive.wait(patternFive,5);    
				screenFive.paste(patternFive, "ps-language");
				pageLoad();

				Screen screenSix = new Screen();
				Pattern patternSix = new Pattern("C:\\Users\\sujsekar\\git\\Haleon-Projects\\com.qa.tums.site.eng\\tumsLogo\\StyleTagImg.png");
				String textThree = screenSix.find(patternSix).text();
				System.out.println(textThree);
				pageLoad();

				if (compareTwoTextif("0/0 |", textThree))	{
					System.out.println("Pass: "+currentUrl);
					log.pass("ps-language is not Presented in the page");
				}else{
					System.out.println("Fail: "+currentUrl);
					log.fail("ps-language is presented in the page");
				}

				ctrlA();
				pageLoad();
				backspace();
				//********************************************************************
				pageLoad();
				Screen screenSeven = new Screen();
				Pattern patternSeven = new Pattern("C:\\Users\\sujsekar\\git\\Haleon-Projects\\com.qa.tums.site.eng\\tumsLogo\\SearchField.png");
				screenSeven.wait(patternSeven,5);    
				screenSeven.paste(patternSeven, "pricespider");
				pageLoad();

				Screen screenEight = new Screen();
				Pattern patternEight = new Pattern("C:\\Users\\sujsekar\\git\\Haleon-Projects\\com.qa.tums.site.eng\\tumsLogo\\StyleTagImg.png");
				String textFour = screenEight.find(patternEight).text();
				System.out.println(textFour);
				pageLoad();

				if (compareTwoTextif("0/0 |", textFour))	{
					System.out.println("Pass: "+currentUrl);
					log.pass("pricespider is not Presented in the page");
				}else{
					System.out.println("Fail: "+currentUrl);
					log.fail("pricespider is presented in the page");
				}

				ctrlA();
				pageLoad();
				backspace();

			} catch (Exception e) {
				e.printStackTrace();
			}


		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
