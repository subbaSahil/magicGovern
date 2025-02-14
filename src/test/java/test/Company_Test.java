package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;

import helper.RetryAnalyzer;
import pages.CompanyPage;

public class Company_Test extends BaseTest {

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void TC01_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		CompanyPage.CompanyTabHover();
		CompanyPage.clickAboutUs();

	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void TC02_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC01_Company_Tab();
		CompanyPage.clickLearnMore();
	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void TC03_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC01_Company_Tab();
		CompanyPage.meetTeamButton();
	}

	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void TC04_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC01_Company_Tab();
		CompanyPage.clickGetInTouch();
	}

	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void TC05_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		CompanyPage.CompanyTabHover();
		CompanyPage.clickWhyUs();

	}

	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void TC06_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC05_Company_Tab();
		CompanyPage.ExploreOurServices();
	}

	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void TC07_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC05_Company_Tab();
		CompanyPage.ExplourOurTeam();
	}

	@Test(priority = 8, retryAnalyzer = RetryAnalyzer.class)
	public void TC08_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC05_Company_Tab();
		CompanyPage.ExploreOurPartnerAndCertiBtn();
	}

	@Test(priority = 9, retryAnalyzer = RetryAnalyzer.class)
	public void TC09_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		CompanyPage.CompanyTabHover();
		CompanyPage.clickTeambtn();
	}

	@Test(priority = 10, retryAnalyzer = RetryAnalyzer.class)
	public void TC10_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC09_Company_Tab();
		CompanyPage.clickWeAreHiring();
	}

	@Test(priority = 11, retryAnalyzer = RetryAnalyzer.class)
	public void TC11_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC09_Company_Tab();
		CompanyPage.GetInTouchBtn();
	}

	@Test(priority = 12, retryAnalyzer = RetryAnalyzer.class)
	public void TC12_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC09_Company_Tab();
		CompanyPage.ViewMoreBtn();
	}

	@Test(priority = 13, retryAnalyzer = RetryAnalyzer.class)
	public void TC13_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC09_Company_Tab();
		CompanyPage.ViewMoreBtn();
		CompanyPage.LinkedInLogo();
	}

	@Test(priority = 14, retryAnalyzer = RetryAnalyzer.class)
	public void TC14_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC09_Company_Tab();
		CompanyPage.ImageofMember();
	}

	@Test(priority = 15, retryAnalyzer = RetryAnalyzer.class)
	public void TC15_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC09_Company_Tab();
		CompanyPage.ImageofMember();
		CompanyPage.TwitterLogo();
	}

	@Test(priority = 16, retryAnalyzer = RetryAnalyzer.class)
	public void TC16_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC09_Company_Tab();
		CompanyPage.ImageofMember();
		CompanyPage.BackToTeamMembersBtn();
	}

	@Test(priority = 17, retryAnalyzer = RetryAnalyzer.class)
	public void TC17_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		CompanyPage.CompanyTabHover();
		CompanyPage.CareerTabBtn();
	}

	@Test(priority = 18, retryAnalyzer = RetryAnalyzer.class)
	public void TC18_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC17_Company_Tab();
		CompanyPage.ExploreOpenPositionsBtn();
	}

	@Test(priority = 19, retryAnalyzer = RetryAnalyzer.class)
	public void TC19_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC17_Company_Tab();
		CompanyPage.LearnAboutCompanyBtn();
	}

	@Test(priority = 20, retryAnalyzer = RetryAnalyzer.class)
	public void TC20_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		CompanyPage.CompanyTabHover();
		CompanyPage.PartAndCertTabBtn();
	}

	@Test(priority = 21, retryAnalyzer = RetryAnalyzer.class)
	public void TC21_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC20_Company_Tab();
		CompanyPage.GetInTouchBtn();
	}

	@Test(priority = 22, retryAnalyzer = RetryAnalyzer.class)
	public void TC22_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		CompanyPage.CompanyTabHover();
		CompanyPage.ReviewsAndRewardsTabBtn();
	}

	@Test(priority = 23, retryAnalyzer = RetryAnalyzer.class)
	public void TC23_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC22_Company_Tab();
		CompanyPage.LeftVideoButton();
		CompanyPage.YouTubeBtn();

	}

	@Test(priority = 24, retryAnalyzer = RetryAnalyzer.class)
	public void TC24_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC22_Company_Tab();
		CompanyPage.LeftVideoButton();
		CompanyPage.VideoCloseButton();
	}

}
