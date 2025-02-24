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
		this.interaction.click(bloglocators.blogSection);
	}

	public String isBlogTabAvailble() {
		return interaction.getText(bloglocators.blogText);
	}

	public String isTheTecnologiaBlogTestAvailable() {
		return interaction.getText(bloglocators.TheTechnologiaBlogText);
	}

	public String isReadFullStoryAvailable() {
		return interaction.getText(bloglocators.ReadFullStoryText);
	}

	public void clickFullstory() {
		this.interaction.click(bloglocators.ReadFullStoryText);

	}

	public String isCommentSectionAvailable() {
		return interaction.getText(bloglocators.CommentSection);
	}

	public String isChinaDatabreaxhCardAvailable() {
		return interaction.getText(bloglocators.ChinaDatabreachCard);
	}

	public void clickReadMore1st() {
		this.interaction.click(bloglocators.ReadMoreButton);
	}

	public String isTop5TipsCardAvailable() {
		return interaction.getText(bloglocators.Top5TipsCard);
	}

	public void clickReadMore2nd() {
		this.interaction.click(bloglocators.ReadMore2ndBtn);
	}

	public String is3rdCardAvailable() {
		return interaction.getText(bloglocators.ThirdCard);
	}

	public void clickReadMore3rd() {
		this.interaction.click(bloglocators.ReadMore3rdBtn);
	}

	public String is4thCardAvailable() {
		return interaction.getText(bloglocators.FourthCard);
	}

	public void clickReadMore4th() {
		this.interaction.click(bloglocators.ReadMore4thBtn);
	}

	public String is5thCardAvailable() {
		return interaction.getText(bloglocators.FifthCard);
	}

	public void clickReadMore5th() {
		this.interaction.click(bloglocators.ReadMore5thBtn);
	}

	public String is6thCardAvailable() {
		return interaction.getText(bloglocators.SixthCard);
	}

	public void clickReadMore6th() {
		this.interaction.click(bloglocators.ReadMore6thBtn);
	}

	public String is7thCardAvailable() {
		return interaction.getText(bloglocators.SevenCard);
	}

	public void clickReadMore7th() {
		this.interaction.click(bloglocators.ReadMore7thBtn);
	}

	public void clickStartUpPage() {
		this.interaction.click(bloglocators.StartUpPage);
	}

	public void clickLoadMorebtn() {
		this.interaction.click(bloglocators.LoadMorebtn);
	}
}
