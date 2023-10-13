package com.qa.bens.checklist.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;
import com.qa.bens.checklist.page.CheckListSlashRedirectionPage;
import com.qa.tums.eng.util.DataProviderCode;
import com.qa.tums.eng.util.LogFile;

public class CheckListSlashRedirectionTest extends BaseClass{
	
	
	CheckListSlashRedirectionPage lsr;

	@BeforeClass
	private void launchTheBrowser() throws Exception {
		browserLaunch(loadConfig("checkListConfig.properties").getProperty("browser"));
		lsr= new CheckListSlashRedirectionPage();
		
	}

	@Test(dataProvider = "Caltrate",dataProviderClass = DataProviderCode.class)
	private void verifySlashRedirection(String path) throws Exception{
		lsr.verifyLastSlashRedirection(path);
		System.out.println("---->*********************************************************************<----");
	}

}
