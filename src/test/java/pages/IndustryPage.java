package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import helper.Interactions;
import utils.IndustryLocator;

public class IndustryPage {

	private Interactions interaction;
	private IndustryLocator industrylocators;
	private Actions action;

	public IndustryPage(WebDriver driver) {
		this.interaction = new Interactions(driver);
		this.industrylocators = new IndustryLocator();
		this.action = new Actions(driver);
	}

	public void SolutionTabHover() {
		try {
			// Locate element with visibility wait
			WebElement SolutionTabHover = interaction.visibilityEle(industrylocators.SolutionTabHover);

			// Perform hover action
			action.moveToElement(SolutionTabHover).perform();
			System.out.println("Hover action performed on Solution Tab");

		} catch (Exception e) {
			System.out.println("Error during hover action: " + e.getMessage());
		}
	}

	public void clickViewAll() {
		this.interaction.clickElement(industrylocators.viewAll);
	}

	public void clickclientSupport() {
		this.interaction.clickElement(industrylocators.clientSupport);
	}

	public void clickPhoneNumber() {
		this.interaction.clickElement(industrylocators.phoneNumber);
	}

	public void clickLearnMoreFinetech() {
		this.interaction.clickElement(industrylocators.learnMoreFinetech);
	}

	public void industryManufacturing() {
		this.interaction.clickElement(industrylocators.industryManufacturing);
	}

	public void TransportationLogistic() {
		this.interaction.clickElement(industrylocators.TransportationLogistic);
	}

	public void HealthCare() {
		this.interaction.clickElement(industrylocators.HealthCare);
	}

	public void BankInsurance() {
		this.interaction.clickElement(industrylocators.BankInsurance);
	}

	public void ConsultingProvider() {
		this.interaction.clickElement(industrylocators.ConsultingProvider);
	}

	public void NonProfit() {
		this.interaction.clickElement(industrylocators.NonProfit);
	}

	public void Telemedicine() {
		this.interaction.clickElement(industrylocators.Telemedicine);
	}

	public void DatingApp() {
		this.interaction.clickElement(industrylocators.DatingApp);
	}

}
