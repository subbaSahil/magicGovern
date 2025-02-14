package pages;

import org.openqa.selenium.WebDriver;

import helper.Interactions;
import utils.Solution_Tab_locators;

public class SolutionTab {

	private Interactions interaction;

	public SolutionTab(WebDriver driver) {

		this.interaction = new Interactions(driver);
	}

	public void solution_tab() {
		interaction.hoverOverElement(Solution_Tab_locators.SolutionBtn);
	}

	public void solution_tab_btn() {
		interaction.click(Solution_Tab_locators.SolutionBtn);
	}

	public void managedServices() {
		interaction.click(Solution_Tab_locators.ManagedServicesBtn);
	}

	public void itConsultancy() {
		interaction.click(Solution_Tab_locators.ItConsultancyBtn);
	}

	public void cyberSecurity() {
		interaction.click(Solution_Tab_locators.CyberSecurityBtn);
	}

	public void mobileDevelopment() {
		interaction.click(Solution_Tab_locators.MobileDevelopmentBtn);
	}

	public void webDevelopment() {
		interaction.click(Solution_Tab_locators.WebDevelopmentBtn);
	}

	public void cloudeServices() {
		interaction.click(Solution_Tab_locators.CloudeServicesBtn);
	}

	public void digitalTransformation() {
		interaction.click(Solution_Tab_locators.DigitalTransformationBtn);
	}

	public void security() {
		interaction.click(Solution_Tab_locators.SecurityBtn);
	}

	public void automation() {
		interaction.click(Solution_Tab_locators.AutomationBtn);
	}

	public void gainingEfficiency() {
		interaction.click(Solution_Tab_locators.GainingEfficiencyBtn);
	}

	public void industryManufacturing() {
		interaction.click(Solution_Tab_locators.IndustryManufacturingBtn);
	}

	public void transportion() {
		interaction.click(Solution_Tab_locators.TransportationLogisticBtn);
	}

	public void banksAndInsurance() {
		interaction.click(Solution_Tab_locators.BankandinsuranceBtn);
	}

	public void healthCare() {
		interaction.click(Solution_Tab_locators.HealthcareBtn);
	}

	public void counsultingProvider() {
		interaction.click(Solution_Tab_locators.CounsltingProvidersBtn);
	}

	public void nonProfit() {
		interaction.click(Solution_Tab_locators.NonProfitBtn);
	}

	public void viewAll() {
		interaction.click(Solution_Tab_locators.ViewAllBtn);
	}

	public void callUs() {
		interaction.click(Solution_Tab_locators.CallusBtn);
	}

	public void nftLearnMore() {
		interaction.click(Solution_Tab_locators.NFTLearnMoreBtn);
	}
}
