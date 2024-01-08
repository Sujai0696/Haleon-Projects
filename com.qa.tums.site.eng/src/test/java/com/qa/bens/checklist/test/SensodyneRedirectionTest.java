package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.SensodyneRedirectionPage;
import com.qa.tums.eng.util.DataProviderCode;

public class SensodyneRedirectionTest extends BaseClass{

	SensodyneRedirectionPage sr;
	
	@BeforeClass
	private void launchingTheBrowse() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		sr = new SensodyneRedirectionPage();
	}
	
	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void verify_Redirection_URL(String path, String URL, String sno) throws Exception{
		sr.verifyUrl(path, URL, sno);
		}
	}




