package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.BAUTicketPage;
import com.qa.tums.eng.util.DataProviderCode;

public class BAUTicketTest extends BaseClass{
	
	BAUTicketPage bau;
	
	@BeforeClass
	private void launchingTheBrowse() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		bau = new BAUTicketPage();
	}
	
	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void verifyRecommendedURL(String path, String xpath, String Sno) throws Exception{
		bau.checkxPathValue(path, xpath, Sno);
		}
	}


