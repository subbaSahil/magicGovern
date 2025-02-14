package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import helper.BaseTest;

import pages.SolutionTab;

public class SolutionTab_Test extends BaseTest {
	private SolutionTab solutionTab;

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	@BeforeMethod
	public void setUp() {
		solutionTab = new SolutionTab(driver);
	}

	@Test(priority = 1)

	public void solution_Tab_TC_01() {
		solutionTab.solution_tab();
	}

	@Test(priority = 2)

	public void Managed_services_TC_02() {
		solutionTab.solution_tab();
		solutionTab.managedServices();

	}

	@Test(priority = 3)

	public void IT_ConsultancyAndAdvisoy_TC_03() {
		solutionTab.solution_tab();
		solutionTab.itConsultancy();

	}

	@Test(priority = 4)

	public void CyberSecurity_TC_04() {
		solutionTab.solution_tab();
		solutionTab.cyberSecurity();

	}

	@Test(priority = 5)

	public void WebDevelopment_TC_05() {
		solutionTab.solution_tab();
		solutionTab.webDevelopment();

	}

	@Test(priority = 6)

	public void MobileDevelopment_TC_06() {
		solutionTab.solution_tab();
		solutionTab.mobileDevelopment();

	}

	@Test(priority = 7)

	public void CloudServices_TC_07() {
		solutionTab.solution_tab();
		solutionTab.cloudeServices();

	}

	@Test(priority = 8)

	public void DigitalTransformation_TC_08() {
		solutionTab.solution_tab();
		solutionTab.digitalTransformation();

	}

//
	@Test(priority = 9)

	public void Security_TC_09() {
		solutionTab.solution_tab();
		solutionTab.security();

	}

	@Test(priority = 10)

	public void Automation_TC_10() {
		solutionTab.solution_tab();
		solutionTab.automation();

	}

	@Test(priority = 11)

	public void Gaining_Efficiency_TC_11() {
		solutionTab.solution_tab();
		solutionTab.gainingEfficiency();

	}

//
	@Test(priority = 12)

	public void Industry_Manufacturing_12() {
		solutionTab.solution_tab();
		solutionTab.industryManufacturing();

	}

//
	@Test(priority = 13)

	public void Transportation_TC_13() {
		solutionTab.solution_tab();
		solutionTab.transportion();

	}

//
	@Test(priority = 14)

	public void Healthcare_TC_14() {
		solutionTab.solution_tab();
		solutionTab.healthCare();

	}

	@Test(priority = 15)

	public void BankAndInsurance_TC_15() {
		solutionTab.solution_tab();
		solutionTab.banksAndInsurance();

	}

	@Test(priority = 16)

	public void CounsultingProvider_TC_16() {
		solutionTab.solution_tab();
		solutionTab.counsultingProvider();

	}

//
	@Test(priority = 17)

	public void NonProfit_TC_17() {
		solutionTab.solution_tab();
		solutionTab.nonProfit();

	}

	@Test(priority = 18)

	public void NonProfit_TC_18() {
		solutionTab.solution_tab();
		solutionTab.viewAll();
	}

	@Test(priority = 19)

	public void CallUs_TC_19() {
		solutionTab.solution_tab_btn();
		solutionTab.callUs();
	}

	@Test(priority = 20)

	public void nftLearnMore_TC_20() {
		solutionTab.solution_tab_btn();
		solutionTab.nftLearnMore();
	}

}
