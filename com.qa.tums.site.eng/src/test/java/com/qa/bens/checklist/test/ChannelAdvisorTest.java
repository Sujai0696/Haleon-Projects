package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.ChannelAdvisorPage;
import com.qa.tums.eng.util.DataProviderCode;

public class ChannelAdvisorTest extends BaseClass{
	
	ChannelAdvisorPage ca;
	
	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		ca = new ChannelAdvisorPage();
	}

//dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class
	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void verifyText(String path) throws Exception {
		ca.verifySourcePage(path);
		System.out.println("---->**************************************************<----");
		
	}
	
	

}
