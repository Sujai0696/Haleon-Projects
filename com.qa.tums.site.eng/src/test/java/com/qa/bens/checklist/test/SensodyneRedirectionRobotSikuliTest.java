package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.SensodyneRedirectionRobotSikuliPage;
import com.qa.tums.eng.util.DataProviderCode;

public class SensodyneRedirectionRobotSikuliTest extends BaseClass{
	
	SensodyneRedirectionRobotSikuliPage sr;
	
	@BeforeClass
	private void launchingTheBrowse() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		sr = new SensodyneRedirectionRobotSikuliPage();
	}
	
	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void verifyRecommendedURL(String path, String URL, String sno) throws Exception{
		sr.verifyUrl(path, URL, sno);
		}
	}
	
	


