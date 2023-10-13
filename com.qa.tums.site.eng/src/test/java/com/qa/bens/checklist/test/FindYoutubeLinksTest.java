package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.BeTotalTextPage;
import com.qa.bens.checklist.page.FindYoutubeLinksPage;
import com.qa.tums.eng.util.DataProviderCode;

public class FindYoutubeLinksTest extends BaseClass{
	
	FindYoutubeLinksPage yt;
	
	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		yt = new FindYoutubeLinksPage();
	}
	
//	dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class
	
	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void verifyExpiredCode(String path) throws Exception {
		yt.getExpiredCode(path);
	}
	

}
