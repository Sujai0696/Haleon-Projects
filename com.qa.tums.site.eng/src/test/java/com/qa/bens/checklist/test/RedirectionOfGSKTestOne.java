package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.RedirectionOfGSKPageOne;
import com.qa.tums.eng.util.DataProviderCode;

public class RedirectionOfGSKTestOne extends BaseClass{

	RedirectionOfGSKPageOne regsk;
	
	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		regsk = new RedirectionOfGSKPageOne();
	}

//dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class
	@Test()
	private void findingGskInSourcePage() throws Exception {
		regsk.verifyRedirectionOfGSK();
		System.out.println("---->**************************************************<----");
		
	}
	
}
