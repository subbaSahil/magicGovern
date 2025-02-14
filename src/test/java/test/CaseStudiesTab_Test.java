package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import pages.CaseStudiesTab;

public class CaseStudiesTab_Test extends BaseTest {
	private CaseStudiesTab caseStudiesTab;

	@BeforeMethod
	public void setUp() {
		caseStudiesTab = new CaseStudiesTab(driver);

	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test(priority = 1)

	public void caseStudiesText_Tab_TC_01() {
		caseStudiesTab.caseStudies_tab();
		String actualText = caseStudiesTab.caseStudies_tab_text();
		System.out.println(actualText);
		String expectedText = "Case studies"; // Replace with your expected text
		Assert.assertEquals(actualText, expectedText, "Text does not match the expected value!");
	}

	@Test(priority = 2)

	public void caseStudies_Tab_TC_02() {
		caseStudiesTab.caseStudies_tab();
	}

	@Test(priority = 3)

	public void featuredCaseText_TC_03() {
		caseStudiesTab.caseStudies_tab();
		String actualText = caseStudiesTab.featureText();
		System.out.println(actualText);
		String expectedText = "Featured case studies"; // Replace with your expected text
		Assert.assertEquals(actualText, expectedText, "Text does not match the expected value!");

	}

	@Test(priority = 4)

	public void Major_Insurance_TC_04() {
		caseStudiesTab.caseStudies_tab();
		caseStudiesTab.majorInsurance();

	}

	@Test(priority = 5)

	public void Major_Insurance_TC_05() {
		caseStudiesTab.caseStudies_tab();
		caseStudiesTab.maximizingEfficency();

	}

	@Test(priority = 6)

	public void StrategicMove_TC_06() {
		caseStudiesTab.caseStudies_tab();
		caseStudiesTab.strategicMove();

	}

	@Test(priority = 7)

	public void ConvenianceSaving_TC_07() {
		caseStudiesTab.caseStudies_tab();
		caseStudiesTab.convenianceSaving();

	}

	@Test(priority = 8)

	public void PrivateTrust_TC_08() {
		caseStudiesTab.caseStudies_tab();
		caseStudiesTab.privateTrust();

	}

	@Test(priority = 9)

	public void OnlinePlatform_TC_09() {
		caseStudiesTab.caseStudies_tab();
		caseStudiesTab.onlinePlatform();

	}

	@Test(priority = 10)

	public void Delevering_Enterprise_TC_10() {
		caseStudiesTab.caseStudies_tab();
		caseStudiesTab.deleveringEnterprise();

	}

	@Test(priority = 11)

	public void Bringing_Premium_TC_11() {
		caseStudiesTab.caseStudies_tab();
		caseStudiesTab.bringingPremium();

	}

	@Test(priority = 12)

	public void Building_Optimizing_TC_12() {
		caseStudiesTab.caseStudies_tab();
		caseStudiesTab.building();

	}

}
