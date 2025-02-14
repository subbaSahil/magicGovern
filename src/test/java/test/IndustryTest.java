package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.RetryAnalyzer;
import pages.IndustryPage;

public class IndustryTest extends BaseTest {
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void TC110_Industry_Tab() {

		IndustryPage IndustryPage = new IndustryPage(driver);
		IndustryPage.SolutionTabHover();
		IndustryPage.clickViewAll();

	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void TC111_Industry_Tab() {

		IndustryPage IndustryPage = new IndustryPage(driver);
		TC110_Industry_Tab();
		IndustryPage.clickclientSupport();
	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void TC112_Industry_Tab() {

		IndustryPage IndustryPage = new IndustryPage(driver);
		TC110_Industry_Tab();
		IndustryPage.clickPhoneNumber();
	}

	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void TC113_Industry_Tab() {

		IndustryPage IndustryPage = new IndustryPage(driver);
		TC110_Industry_Tab();
		IndustryPage.clickLearnMoreFinetech();
	}

	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void TC114_Industry_Tab() {

		IndustryPage IndustryPage = new IndustryPage(driver);
		TC110_Industry_Tab();
		IndustryPage.industryManufacturing();
	}

	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void TC115_Industry_Tab() {

		IndustryPage IndustryPage = new IndustryPage(driver);
		TC110_Industry_Tab();
		IndustryPage.TransportationLogistic();
	}
	
	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void TC116_Industry_Tab() {

		IndustryPage IndustryPage = new IndustryPage(driver);
		TC110_Industry_Tab();
		IndustryPage.HealthCare();
	}
	
	@Test(priority = 8, retryAnalyzer = RetryAnalyzer.class)
	public void TC117_Industry_Tab() {

		IndustryPage IndustryPage = new IndustryPage(driver);
		TC110_Industry_Tab();
		IndustryPage.BankInsurance();
	}
	
	@Test(priority = 9, retryAnalyzer = RetryAnalyzer.class)
	public void TC118_Industry_Tab() {

		IndustryPage IndustryPage = new IndustryPage(driver);
		TC110_Industry_Tab();
		IndustryPage.ConsultingProvider();
	}
	
	@Test(priority = 10, retryAnalyzer = RetryAnalyzer.class)
	public void TC119_Industry_Tab() {

		IndustryPage IndustryPage = new IndustryPage(driver);
		TC110_Industry_Tab();
		IndustryPage.NonProfit();
	}
	
	@Test(priority = 11, retryAnalyzer = RetryAnalyzer.class)
	public void TC120_Industry_Tab() {

		IndustryPage IndustryPage = new IndustryPage(driver);
		TC110_Industry_Tab();
		IndustryPage.Telemedicine();
	}
	
	@Test(priority = 12, retryAnalyzer = RetryAnalyzer.class)
	public void TC121_Industry_Tab() {

		IndustryPage IndustryPage = new IndustryPage(driver);
		TC110_Industry_Tab();
		IndustryPage.DatingApp();
	}

}
