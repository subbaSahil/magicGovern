package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import helper.Interactions;
import utils.CompanyLocator;

public class CompanyPage {

	private Interactions interaction;
	private CompanyLocator companylocators;
	private Actions action;

	public CompanyPage(WebDriver driver) {
		this.companylocators = new CompanyLocator();
		this.interaction = new Interactions(driver);
		this.action = new Actions(driver);
	}

	public void CompanyTabHover() {
		try {
			// Locate element with visibility wait
			WebElement CompanyTabHover = interaction.visibilityEle(companylocators.CompanyBtn);

			// Perform hover action
			action.moveToElement(CompanyTabHover).perform();
			System.out.println("Hover action performed on Solution Tab");

		} catch (Exception e) {
			System.out.println("Error during hover action: " + e.getMessage());
		}
	}

	public void clickAboutUs() {
		this.interaction.clickElement(companylocators.AboutUsTabBtn);
	}

	public void clickWhyUs() {
		this.interaction.clickElement(companylocators.WhyUsTabBtn);
	}

	public void clickLearnMore() {
		this.interaction.clickElement(companylocators.LearnMoreBtn);
	}

	public void meetTeamButton() {
		this.interaction.clickElement(companylocators.MeetMyTeamBtn);
	}

	public void clickGetInTouch() {
		this.interaction.clickElement(companylocators.GetInTouchBtn);
	}

	public void ExploreOurServices() {
		this.interaction.clickElement(companylocators.ExploreOurServiceBtn);
	}

	public void ExplourOurTeam() {
		this.interaction.clickElement(companylocators.ExploreOurTeamBtn);
	}

	public void ExploreOurPartnerAndCertiBtn() {
		this.interaction.clickElement(companylocators.ExploreOurPartnerAndCertiBtn);
	}

	public void clickTeambtn() {
		this.interaction.clickElement(companylocators.TeamTabBtn);
	}

	public void clickWeAreHiring() {
		this.interaction.clickElement(companylocators.WeAreHiringBtn);
	}

	public void GetInTouchBtn() {
		this.interaction.clickElement(companylocators.GetInTouchBtn);
	}

	public void ViewMoreBtn() {
		this.interaction.clickElement(companylocators.ViewMoreBtn);
	}

	public void LinkedInLogo() {
		this.interaction.clickElement(companylocators.LinkedInLogo);
	}

	public void ImageofMember() {
		this.interaction.clickElement(companylocators.ImageofMember);
	}

	public void TwitterLogo() {
		this.interaction.clickElement(companylocators.TwitterLogo);
	}

	public void BackToTeamMembersBtn() {
		this.interaction.clickElement(companylocators.BackToTeamMembersBtn);
	}

	public void CareerTabBtn() {
		this.interaction.clickElement(companylocators.CareerTabBtn);
	}

	public void ExploreOpenPositionsBtn() {
		this.interaction.clickElement(companylocators.ExploreOpenPositionsBtn);
	}

	public void LearnAboutCompanyBtn() {
		this.interaction.clickElement(companylocators.LearnAboutCompanyBtn);
	}

	public void PartAndCertTabBtn() {
		this.interaction.clickElement(companylocators.PartAndCertTabBtn);
	}

	public void ReviewsAndRewardsTabBtn() {
		this.interaction.clickElement(companylocators.ReviewsAndRewardsTabBtn);
	}

	public void LeftVideoButton() {
		this.interaction.clickElement(companylocators.LeftVideoButton);
	}

	public void VideoCloseButton() {
		this.interaction.clickElement(companylocators.VideoCloseButton);
	}

	public void YouTubeBtn() {
		switchToiframe();
		this.interaction.clickElement(companylocators.YouTubeBtn);
	}

	public void switchToiframe() {
		this.interaction.switchToIframe(companylocators.Youtubeiframe);
	}
}
