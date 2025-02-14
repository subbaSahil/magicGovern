package pages;

import org.openqa.selenium.WebDriver;

import helper.Interactions;
import utils.BlogLocators;

public class BlogPage {

	private Interactions interaction;
	private BlogLocators bloglocators;

	public BlogPage(WebDriver driver) {
		this.interaction = new Interactions(driver);
		this.bloglocators = new BlogLocators();
	}

	public void clickBlogTab() {
		this.interaction.clickElement(bloglocators.blogSection);
	}

	public String isBlogTabAvailble() {
		return interaction.getInnerText(bloglocators.blogText);
	}

	public String isTheTecnologiaBlogTestAvailable() {
		return interaction.getInnerText(bloglocators.TheTechnologiaBlogText);
	}

	public String isReadFullStoryAvailable() {
		return interaction.getInnerText(bloglocators.ReadFullStoryText);
	}

	public void clickFullstory() {
		this.interaction.clickElement(bloglocators.ReadFullStoryText);

	}

	public String isCommentSectionAvailable() {
		return interaction.getInnerText(bloglocators.CommentSection);
	}

	public String isChinaDatabreaxhCardAvailable() {
		return interaction.getInnerText(bloglocators.ChinaDatabreachCard);
	}

	public void clickReadMore1st() {
		this.interaction.clickElement(bloglocators.ReadMoreButton);
	}

	public String isTop5TipsCardAvailable() {
		return interaction.getInnerText(bloglocators.Top5TipsCard);
	}

	public void clickReadMore2nd() {
		this.interaction.clickElement(bloglocators.ReadMore2ndBtn);
	}

	public String is3rdCardAvailable() {
		return interaction.getInnerText(bloglocators.ThirdCard);
	}

	public void clickReadMore3rd() {
		this.interaction.clickElement(bloglocators.ReadMore3rdBtn);
	}

	public String is4thCardAvailable() {
		return interaction.getInnerText(bloglocators.FourthCard);
	}

	public void clickReadMore4th() {
		this.interaction.clickElement(bloglocators.ReadMore4thBtn);
	}

	public String is5thCardAvailable() {
		return interaction.getInnerText(bloglocators.FifthCard);
	}

	public void clickReadMore5th() {
		this.interaction.clickElement(bloglocators.ReadMore5thBtn);
	}

	public String is6thCardAvailable() {
		return interaction.getInnerText(bloglocators.SixthCard);
	}

	public void clickReadMore6th() {
		this.interaction.clickElement(bloglocators.ReadMore6thBtn);
	}

	public String is7thCardAvailable() {
		return interaction.getInnerText(bloglocators.SevenCard);
	}

	public void clickReadMore7th() {
		this.interaction.clickElement(bloglocators.ReadMore7thBtn);
	}

	public void clickStartUpPage() {
		this.interaction.clickElement(bloglocators.StartUpPage);
	}

	public void clickLoadMorebtn() {
		this.interaction.clickElement(bloglocators.LoadMorebtn);
	}
}
