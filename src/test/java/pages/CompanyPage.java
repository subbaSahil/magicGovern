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
		this.interaction.click(companylocators.AboutUsTabBtn);
	}

	public void clickWhyUs() {
		this.interaction.click(companylocators.WhyUsTabBtn);
	}

	public void clickLearnMore() {
		this.interaction.click(companylocators.LearnMoreBtn);
	}

	public void meetTeamButton() {
		this.interaction.click(companylocators.MeetMyTeamBtn);
	}

	public void clickGetInTouch() {
		this.interaction.click(companylocators.GetInTouchBtn);
	}

	public void ExploreOurServices() {
		this.interaction.click(companylocators.ExploreOurServiceBtn);
	}

	public void ExplourOurTeam() {
		this.interaction.click(companylocators.ExploreOurTeamBtn);
	}

	public void ExploreOurPartnerAndCertiBtn() {
		this.interaction.click(companylocators.ExploreOurPartnerAndCertiBtn);
	}

	public void clickTeambtn() {
		this.interaction.click(companylocators.TeamTabBtn);
	}

	public void clickWeAreHiring() {
		this.interaction.click(companylocators.WeAreHiringBtn);
	}

	public void GetInTouchBtn() {
		this.interaction.click(companylocators.GetInTouchBtn);
	}

	public void ViewMoreBtn() {
		this.interaction.click(companylocators.ViewMoreBtn);
	}

	public void LinkedInLogo() {
		this.interaction.click(companylocators.LinkedInLogo);
	}

	public void ImageofMember() {
		this.interaction.click(companylocators.ImageofMember);
	}

	public void TwitterLogo() {
		this.interaction.click(companylocators.TwitterLogo);
	}

	public void BackToTeamMembersBtn() {
		this.interaction.click(companylocators.BackToTeamMembersBtn);
	}

	public void CareerTabBtn() {
		this.interaction.click(companylocators.CareerTabBtn);
	}

	public void ExploreOpenPositionsBtn() {
		this.interaction.click(companylocators.ExploreOpenPositionsBtn);
	}

	public void LearnAboutCompanyBtn() {
		this.interaction.click(companylocators.LearnAboutCompanyBtn);
	}

	public void PartAndCertTabBtn() {
		this.interaction.click(companylocators.PartAndCertTabBtn);
	}

	public void ReviewsAndRewardsTabBtn() {
		this.interaction.click(companylocators.ReviewsAndRewardsTabBtn);
	}

	public void LeftVideoButton() {
		this.interaction.click(companylocators.LeftVideoButton);
	}

	public void VideoCloseButton() {
		this.interaction.click(companylocators.VideoCloseButton);
	}

	public void YouTubeBtn() {
		switchToiframe();
		this.interaction.click(companylocators.YouTubeBtn);
	}

	public void switchToiframe() {
		this.interaction.switchToIframe(companylocators.Youtubeiframe);
	}
}
