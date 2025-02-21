package utils;

import org.openqa.selenium.By;

public class CompanyLocator {

	// Locators
	public By CompanyBtn = By.xpath("//ul[@id='menu-1-4677853']//child::a[text()='Company']");
	public By AboutUsTabBtn = By.xpath("//ul[@id='menu-1-029e206']//child::a[text()='About us']");
//    public By AboutPage = By.xpath("//div[@id='main']/article/div/section[1]/div/div/div");
	public By LearnMoreBtn = By.xpath("//span[text()='Learn more']");
	public By WhyUsPage = By.xpath("//ul[@id='menu-1-029e206']//child::a[text()='Why us']");
	public By MeetMyTeamBtn = By.xpath("//span[text()='Meet the team']");
	public By TeamPage = By.xpath("//ul[@id='menu-1-029e206']//child::a[text()='Team']");
	public By GetInTouchBtn = By.linkText("//span[text()='Get in touch']");

//    public By ContactPage = By.xpath("//div[@id='main']/article/div/section[1]/div/div/div");
	public By WhyUsTabBtn = By.xpath(
			"(//a[text()='Why us']//ancestor::li[@class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-987725\"])[1]");
	public By ExploreOurServiceBtn = By.xpath(
			"//span[text()='Explore our services']//ancestor::a[@href=\"https://www.magicgovern.ai/solutions/\"]");
//	public By SerAndSolPage = By.xpath(
//			"/html//div[@id='main']/article/div/section[2]//div[@class='elementor-element elementor-element-23ed50d elementor-widget elementor-widget-theme-post-content']//div[@class='elementor elementor-465']/section[1]/div/div/div/div[1]//h1[@class='elementor-heading-title elementor-size-default']");
	public By ExploreOurTeamBtn = By.xpath(
			"/html//div[@id='main']/article/div/section[2]//div[@class='elementor-element elementor-element-23ed50d elementor-widget elementor-widget-theme-post-content']//div[@class='elementor elementor-2218']/section[10]/div/div/div/div[2]//a[@href='https://www.magicgovern.ai/team/']");
	public By ExploreOurPartnerAndCertiBtn = By.xpath(
			"/html//div[@id='main']/article/div/section[2]//div[@class='elementor-element elementor-element-23ed50d elementor-widget elementor-widget-theme-post-content']//div[@class='elementor elementor-2218']/section[11]/div/div[1]/div/div[4]//a[@href='https://www.magicgovern.ai/partnerships/']");
	public By PartnersAndCertiPage = By.xpath("//div[@id='main']/article/div/section[1]/div/div/div");
	public By TeamTabBtn = By.xpath(
			"/html//div[@role='document']//div[@class='elementor elementor-1607 elementor-location-popup']/section/div/div[2]/div/div/div/nav[1]/ul[@class='elementor-nav-menu sm-vertical']//a[@href='https://www.magicgovern.ai/team/']");
	public By WeAreHiringBtn = By.xpath(
			"/html//div[@id='main']/article/div/section[2]//div[@class='elementor-element elementor-element-23ed50d elementor-widget elementor-widget-theme-post-content']//div[@class='elementor elementor-1295']/section[6]/div/div//a[@href='https://www.magicgovern.ai/careers/']");
	public By CareerPage = By.xpath("//div[@id='main']/article/div/section[1]/div/div");
	public By ViewMoreBtn = By.xpath(
			"/html//div[@id='main']/article/div/section[2]//div[@class='elementor-element elementor-element-23ed50d elementor-widget elementor-widget-theme-post-content']//div[@class='elementor elementor-1295']/section[5]/div/div[1]/div/div[2]//div[@role='button']/a[@class='elementor-toggle-title']");
	public By DetailofUser = By.xpath(
			"/html//div[@id='main']/article/div/section[2]//div[@class='elementor-element elementor-element-23ed50d elementor-widget elementor-widget-theme-post-content']//div[@class='elementor elementor-1295']/section[5]/div/div[1]/div/div[2]//div[@role='region']/p[1]");
	public By ImageofMember = By.xpath(
			"/html//div[@id='main']/article/div/section[2]//div[@class='elementor-element elementor-element-23ed50d elementor-widget elementor-widget-theme-post-content']//div[@class='elementor elementor-1295']/section[5]/div/div[1]/div/div[1]//article/a[@href='https://www.magicgovern.ai/team/mat-zalman/']");
	public By MemberPage = By.xpath("//div[@id='main']/article/div/section[1]/div/div");
	public By BackToTeamMembersBtn = By.linkText("Back to Team Members");
	public By CareerTabBtn = By.xpath(
			"/html/body/div[5]//div[@class='elementor elementor-1607 elementor-location-popup']/section/div/div[2]/div/div/div/nav[1]/ul[@class='elementor-nav-menu sm-vertical']//a[@href='https://www.magicgovern.ai/careers/']");
	public By ExploreOpenPositionsBtn = By.xpath(
			"/html//div[@id='main']/article/div/section[2]//div[@class='elementor-element elementor-element-23ed50d elementor-widget elementor-widget-theme-post-content']//div[@class='elementor elementor-1298']/section[1]/div/div/div/div[3]//a[@href='https://workforcenow.adp.com/mascsr/default/mdf/recruitment/recruitment.html?cid=2662a299-6457-478b-8838-76e35ae51c3d&ccId=19000101_000001&type=JS&lang=en_US']");
	public By LearnAboutCompanyBtn = By.xpath(
			"/html//div[@id='main']/article/div/section[2]//div[@class='elementor-element elementor-element-23ed50d elementor-widget elementor-widget-theme-post-content']//div[@class='elementor elementor-1298']/section[8]/div/div[1]/div/div[3]//a[@href='https://www.magicgovern.ai/about/']");
	public By PartAndCertTabBtn = By.xpath(
			"/html//div[@role='document']//div[@class='elementor elementor-1607 elementor-location-popup']/section/div/div[2]/div/div/div/nav[1]/ul[@class='elementor-nav-menu sm-vertical']//a[@href='https://www.magicgovern.ai/partnerships/']");
	public By ReviewsAndRewardsTabBtn = By.xpath(
			"/html//div[@role='document']//div[@class='elementor elementor-1607 elementor-location-popup']/section/div/div[2]/div/div/div/nav[1]/ul[@class='elementor-nav-menu sm-vertical']//a[@href='https://www.magicgovern.ai/reviews-awards/']");
	public By ReviewsAndRewardsPage = By.xpath("//div[@id='main']/article/div/section[1]/div/div/div");
	public By LeftVideoButton = By.cssSelector("[data-id='ccdeba7'] .elementor-icon");
	public By VideoCloseButton = By.xpath("//div[@id='elementor-lightbox']//a[@role='button']");
	public By LinkedInLogo = By.xpath(
			"/html//div[@id='main']/article/div/section[2]/div/div//div[@class='elementor-element elementor-element-23ed50d elementor-widget elementor-widget-theme-post-content']//div[@class='elementor elementor-1295']/section[5]/div/div[1]/div/div[2]//div[@role='region']/div[@class='elementor elementor-6391 elementor-location-single']/section/div/div/div/div//a[@href='http://linkedin.com']");
	public By TwitterLogo = By.xpath(
			"/html//div[@id='main']/article/div/section[2]//div[@class='elementor-element elementor-element-9cd2825 elementor-widget elementor-widget-theme-post-content']//div[@class='elementor elementor-3561']/section/div/div/div/div[3]//a[@href='https://twitter.com/vamtam']");
	public By YouTubeBtn = By.cssSelector("button[title='Play']");
	public By Youtubeiframe = By.xpath(
			"/html//div[@id='elementor-lightbox']/div//iframe[@src='https://www.youtube.com/embed/ppawFI1u6Po?feature=oembed']");

}
