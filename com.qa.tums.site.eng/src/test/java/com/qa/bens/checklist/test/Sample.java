package com.qa.bens.checklist.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.SampleBau;
import com.qa.tums.eng.util.DataProviderCode;

public class Sample extends BaseClass{
	
	SampleBau sb;
	
	@BeforeClass
	private void launchingTheBrowse() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		sb = new SampleBau();
//		https://www.pronamel.us/products/
//		https://haleonstaging1:Health2023@pronamel-us.preprod-cf65.ch.adobecqms.net/products/
	}
//dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class
	
	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void verifyRecommendedURL(String path, String xpath, String Sno) throws Exception{
		sb.clickValueInXpath(path, xpath, Sno);
		}
	}



