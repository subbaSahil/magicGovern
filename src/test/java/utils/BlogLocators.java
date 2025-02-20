package utils;

import org.openqa.selenium.By;

public class BlogLocators {

	public By blogSection = By.xpath("//ul[@id='menu-1-4677853']//child::a[text()='Blog']");
	public By blogText = By.xpath("//ul[@id='menu-1-4677853']//child::a[text()='Blog']");
	public By TheTechnologiaBlogText = By.xpath("//h1[text()='The Tecnologia Blog']");
	public By ReadFullStoryText = By.xpath("//a[contains(text(),'Read full story')]");
	public By CommentSection = By.xpath("//a[contains(text(),'Show comments')]");

	public By ChinaDatabreachCard = By
			.xpath("//a[contains(text(),'4 Cybersecurity Takeaways from China’s Largest Data Breach')]");
	public By ReadMoreButton = By.xpath("(//a[contains(text(),'Read more')])[1]");

	public By Top5TipsCard = By.xpath("//a[contains(text(),'Top 5 Tips for Solving the Email Security Problem')]");
	public By ReadMore2ndBtn = By.xpath("(//a[contains(text(),'Read more')])[2]");

	public By ThirdCard = By
			.xpath("//a[contains(text(),'What You Shouldn’t Be Doing with Your Cybersecurity in 2023')]");
	public By ReadMore3rdBtn = By.xpath("(//a[contains(text(),'Read more')])[3]");

	public By FourthCard = By.xpath("//a[contains(text(),'Heavy Equipment Manufacturer Finds Concrete Solutions')]");
	public By ReadMore4thBtn = By.xpath("(//a[contains(text(),'Read more')])[4]");

	public By FifthCard = By
			.xpath("//a[contains(text(),'5 Impactful Elements That Promote IT and Business Alignment')]");
	public By ReadMore5thBtn = By.xpath("(//a[contains(text(),'Read more')])[5]");

	public By SixthCard = By
			.xpath("//a[contains(text(),'Healthy Supply Chain Management Positions UniWell for Growth')]");
	public By ReadMore6thBtn = By.xpath("(//a[contains(text(),'Read more')])[6]");

	public By SevenCard = By.xpath("//a[contains(text(),'Simplifying and Securing Attachments in Sage X3')]");
	public By ReadMore7thBtn = By.xpath("(//a[contains(text(),'Read more')])[7]");

	public By StartUpPage = By.xpath(
			"//a[contains(text(),'How startups are cutting cloud costs, renegotiating deals with service providers')]");
	public By LoadMorebtn = By.xpath("//span[contains(text(),'Load More')]");

}
