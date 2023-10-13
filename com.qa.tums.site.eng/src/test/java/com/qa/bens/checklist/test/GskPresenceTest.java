package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.GskPresencePage;
import com.qa.tums.eng.util.DataProviderCode;

public class GskPresenceTest extends BaseClass{
	
	GskPresencePage gsk;
	
	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		gsk = new GskPresencePage();
	}

//dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class
	@Test()
	private void findingGskInSourcePage() throws Exception {
		gsk.verifyGSKInViewSourcepage();
		System.out.println("---->**************************************************<----");
		
	}
	
	

}
