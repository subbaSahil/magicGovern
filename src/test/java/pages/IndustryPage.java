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
		this.interaction.click(industrylocators.viewAll);
	}

	public void clickclientSupport() {
		this.interaction.click(industrylocators.clientSupport);
	}

	public void clickPhoneNumber() {
		this.interaction.click(industrylocators.phoneNumber);
	}

	public void clickLearnMoreFinetech() {
		this.interaction.click(industrylocators.learnMoreFinetech);
	}

	public void industryManufacturing() {
		this.interaction.click(industrylocators.industryManufacturing);
	}

	public void TransportationLogistic() {
		this.interaction.click(industrylocators.TransportationLogistic);
	}

	public void HealthCare() {
		this.interaction.click(industrylocators.HealthCare);
	}

	public void BankInsurance() {
		this.interaction.click(industrylocators.BankInsurance);
	}

	public void ConsultingProvider() {
		this.interaction.click(industrylocators.ConsultingProvider);
	}

	public void NonProfit() {
		this.interaction.click(industrylocators.NonProfit);
	}

	public void Telemedicine() {
		this.interaction.click(industrylocators.Telemedicine);
	}

	public void DatingApp() {
		this.interaction.click(industrylocators.DatingApp);
	}

}
