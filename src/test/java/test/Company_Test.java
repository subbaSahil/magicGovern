package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;

import pages.CompanyPage;

public class Company_Test extends BaseTest {

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test(priority = 1)
	public void TC01_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		CompanyPage.CompanyTabHover();
		CompanyPage.clickAboutUs();

	}

	@Test(priority = 2)
	public void TC02_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC01_Company_Tab();
		CompanyPage.clickLearnMore();
	}

	@Test(priority = 3)
	public void TC03_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC01_Company_Tab();
		CompanyPage.meetTeamButton();
	}

	@Test(priority = 4)
	public void TC04_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC01_Company_Tab();
		CompanyPage.clickGetInTouch();
	}

	@Test(priority = 5)
	public void TC05_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		CompanyPage.CompanyTabHover();
		CompanyPage.clickWhyUs();

	}

	@Test(priority = 6)
	public void TC06_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC05_Company_Tab();
		CompanyPage.ExploreOurServices();
	}

	@Test(priority = 7 )
	public void TC07_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC05_Company_Tab();
		CompanyPage.ExplourOurTeam();
	}

	@Test(priority = 8)
	public void TC08_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC05_Company_Tab();
		CompanyPage.ExploreOurPartnerAndCertiBtn();
	}

	@Test(priority = 9)
	public void TC09_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		CompanyPage.CompanyTabHover();
		CompanyPage.clickTeambtn();
	}

	@Test(priority = 10)
	public void TC10_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC09_Company_Tab();
		CompanyPage.clickWeAreHiring();
	}

	@Test(priority = 11)
	public void TC11_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC09_Company_Tab();
		CompanyPage.GetInTouchBtn();
	}

	@Test(priority = 12)
	public void TC12_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC09_Company_Tab();
		CompanyPage.ViewMoreBtn();
	}

	@Test(priority = 13)
	public void TC13_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC09_Company_Tab();
		CompanyPage.ViewMoreBtn();
		CompanyPage.LinkedInLogo();
	}

	@Test(priority = 14)
	public void TC14_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC09_Company_Tab();
		CompanyPage.ImageofMember();
	}

	@Test(priority = 15)
	public void TC15_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC09_Company_Tab();
		CompanyPage.ImageofMember();
		CompanyPage.TwitterLogo();
	}

	@Test(priority = 16)
	public void TC16_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC09_Company_Tab();
		CompanyPage.ImageofMember();
		CompanyPage.BackToTeamMembersBtn();
	}

	@Test(priority = 17)
	public void TC17_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		CompanyPage.CompanyTabHover();
		CompanyPage.CareerTabBtn();
	}

	@Test(priority = 18)
	public void TC18_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC17_Company_Tab();
		CompanyPage.ExploreOpenPositionsBtn();
	}

	@Test(priority = 19)
	public void TC19_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC17_Company_Tab();
		CompanyPage.LearnAboutCompanyBtn();
	}

	@Test(priority = 20)
	public void TC20_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		CompanyPage.CompanyTabHover();
		CompanyPage.PartAndCertTabBtn();
	}

	@Test(priority = 21)
	public void TC21_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC20_Company_Tab();
		CompanyPage.GetInTouchBtn();
	}

	@Test(priority = 22)
	public void TC22_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		CompanyPage.CompanyTabHover();
		CompanyPage.ReviewsAndRewardsTabBtn();
	}

	@Test(priority = 23)
	public void TC23_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC22_Company_Tab();
		CompanyPage.LeftVideoButton();
		CompanyPage.YouTubeBtn();

	}

	@Test(priority = 24)
	public void TC24_Company_Tab() {

		CompanyPage CompanyPage = new CompanyPage(driver);
		TC22_Company_Tab();
		CompanyPage.LeftVideoButton();
		CompanyPage.VideoCloseButton();
	}

}
