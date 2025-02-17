package utils;

import org.openqa.selenium.By;

public class BlogLocators {

	public By blogSection = By.xpath("//ul[@id='menu-1-4677853']//child::a[text()='Blog']");
	public By blogInnerText = By.xpath(
			"/html//div[@class='elementor elementor-171 elementor-location-header']/section[1]/div/div[2]/div/div/div/nav[1]/ul[@class='elementor-nav-menu']//a[@href='https://www.magicgovern.ai/blog/']");
	public By blogText = By.xpath("//ul[@id='menu-1-4677853']//child::a[text()='Blog']");

	public By TheTechnologiaBlogText = By.xpath("//h1[text()='The Tecnologia Blog']");
	public By ReadFullStoryText = By.xpath(
			"/html//div[@id='main']/article/div/section[2]//div[@class='elementor-element elementor-element-23ed50d elementor-widget elementor-widget-theme-post-content']//div[@class='elementor elementor-93']/section[2]/div/div/div/div[2]//article/div/a[@href='https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/']");
	public By CommentSection = By.cssSelector("div[role='button'] > .elementor-toggle-title");
	public By ChinaDatabreachCard = By.cssSelector(
			"[class] .elementor-post__title [href='https\\:\\/\\/www\\.magicgovern\\.ai\\/4-cybersecurity-takeaways-from-chinas-largest-data-breach\\/']");
	public By ReadMoreButton = By
			.cssSelector("[aria-label='Read more about 4 Cybersecurity Takeaways from China’s Largest Data Breach']");
	public By Top5TipsCard = By.cssSelector(
			"[class] .elementor-post__title [href='https\\:\\/\\/www\\.magicgovern\\.ai\\/top-5-tips-for-solving-the-email-security-problem\\/']");
	public By ReadMore2ndBtn = By
			.cssSelector("[aria-label='Read more about Top 5 Tips for Solving the Email Security Problem']");
	public By ThirdCard = By.cssSelector(
			"[class] .elementor-post__title [href='https\\:\\/\\/www\\.magicgovern\\.ai\\/what-you-shouldnt-be-doing-with-your-cybersecurity-in-2023\\/']");
	public By ReadMore3rdBtn = By
			.cssSelector("[aria-label='Read more about What You Shouldn’t Be Doing with Your Cybersecurity in 2023']");
	public By FourthCard = By.cssSelector(
			"[class] .elementor-post__title [href='https\\:\\/\\/www\\.magicgovern\\.ai\\/heavy-equipment-manufacturer-finds-concrete-solutions\\/']");
	public By ReadMore4thBtn = By
			.cssSelector("[aria-label='Read more about Heavy Equipment Manufacturer Finds Concrete Solutions']");
	public By FifthCard = By.cssSelector(
			"[class] .elementor-post__title [href='https\\:\\/\\/www\\.magicgovern\\.ai\\/5-impactful-elements-that-promote-it-and-business-alignment\\/']");
	public By ReadMore5thBtn = By
			.cssSelector("[aria-label='Read more about 5 Impactful Elements That Promote IT and Business Alignment']");
	public By SixthCard = By.cssSelector(
			"[class] .elementor-post__title [href='https\\:\\/\\/www\\.magicgovern\\.ai\\/healthy-supply-chain-management-positions-uniwell-for-growth\\/']");
	public By ReadMore6thBtn = By
			.cssSelector("[aria-label='Read more about Healthy Supply Chain Management Positions UniWell for Growth']");
	public By SevenCard = By.cssSelector(
			"[class] .elementor-post__title [href='https\\:\\/\\/www\\.magicgovern\\.ai\\/simplifying-and-securing-attachments-in-sage-x3\\/']");
	public By ReadMore7thBtn = By
			.cssSelector("[aria-label='Read more about Simplifying and Securing Attachments in Sage X3']");
	public By StartUpPage = By.cssSelector("[data-id='0debbbe'] .elementor-post__title [href]");
	public By LoadMorebtn = By.cssSelector("[data-id='77d3dd5'] [role]");

}
