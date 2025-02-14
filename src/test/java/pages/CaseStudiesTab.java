package pages;

import org.openqa.selenium.WebDriver;

import helper.Interactions;
import utils.CaseStudies_Tab_locators;

public class CaseStudiesTab {

	private Interactions interactions;

	public CaseStudiesTab(WebDriver driver) {
		this.interactions = new Interactions(driver);
	}

	public void caseStudies_tab() {
		interactions.click(CaseStudies_Tab_locators.CaseStudiesBtn);

	}

	public String caseStudies_tab_text() {
		return interactions.getText(CaseStudies_Tab_locators.CaseStudiesBtn);

	}

	public String featureText() {
		return interactions.getText(CaseStudies_Tab_locators.Featuretext);

	}

	public void majorInsurance() {
		interactions.click(CaseStudies_Tab_locators.MajorInsuranceLeranMoreBtn);

	}

	public void maximizingEfficency() {
		interactions.click(CaseStudies_Tab_locators.CaseStudiesBtn);
		interactions.click(CaseStudies_Tab_locators.MaximizeEfficiencyLeranMoreBtn);

	}

	public void strategicMove() {
		interactions.click(CaseStudies_Tab_locators.CaseStudiesBtn);
		interactions.click(CaseStudies_Tab_locators.StrategicLeranMoreBtn);

	}

	public void convenianceSaving() {
		interactions.click(CaseStudies_Tab_locators.CaseStudiesBtn);
		interactions.click(CaseStudies_Tab_locators.ConvenienceLeranMoreBtn);

	}

	public void privateTrust() {
		interactions.click(CaseStudies_Tab_locators.CaseStudiesBtn);
		interactions.click(CaseStudies_Tab_locators.PrivatetrustLeranMoreBtn);

	}

	public void onlinePlatform() {
		interactions.click(CaseStudies_Tab_locators.CaseStudiesBtn);
		interactions.click(CaseStudies_Tab_locators.OnlineplatformLeranMoreBtn);

	}

	public void deleveringEnterprise() {
		interactions.click(CaseStudies_Tab_locators.CaseStudiesBtn);
		interactions.click(CaseStudies_Tab_locators.DeliveringenterpriseLeranMoreBtn);

	}

	public void bringingPremium() {
		interactions.click(CaseStudies_Tab_locators.CaseStudiesBtn);
		interactions.click(CaseStudies_Tab_locators.BringingpremiumLeranMoreBtn);

	}

	public void building() {
		interactions.click(CaseStudies_Tab_locators.CaseStudiesBtn);
		interactions.click(CaseStudies_Tab_locators.BuildingLeranMoreBtn);

	}
}
