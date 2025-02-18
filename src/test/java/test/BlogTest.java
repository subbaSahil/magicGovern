package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import pages.BlogPage;

public class BlogTest extends BaseTest {

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test(priority = 1)
	public void TC01_TC02_Blog_Tab() throws InterruptedException {

		BlogPage BlogPage = new BlogPage(driver);
		BlogPage.clickBlogTab();
//		Assert.assertEquals(BlogPage.isBlogTabAvailble(), "Blog");/

	}

	@Test(priority = 2)
	public void test1() {
		System.out.println("test1");
	}

	@Test(priority = 3)
	public void Test2() {
		System.out.println("test2");
	}

//	@Test(priority = 2)
//	public void TC03_Blog_Tab() {
//
//		BlogPage BlogPage = new BlogPage(driver);
//		BlogPage.clickBlogTab();
//		System.out.println("blog tab clicked");
//		Assert.assertEquals(BlogPage.isTheTecnologiaBlogTestAvailable(), "The Tecnologia Blog");
//
//	}
//
//	@Test(priority = 3)
//	public void TC04_Blog_Tab() {
//
//		BlogPage BlogPage = new BlogPage(driver);
//		BlogPage.clickBlogTab();
//		Assert.assertEquals(BlogPage.isReadFullStoryAvailable(), "Read full story");
//
//	}
//
//	@Test(priority = 4)
//	public void TC05_Blog_Tab() {
//
//		BlogPage BlogPage = new BlogPage(driver);
//		BlogPage.clickBlogTab();
//		BlogPage.clickFullstory();
//
//	}
//
//	@Test(priority = 5)
//	public void TC06_Blog_Tab() {
//
//		BlogPage BlogPage = new BlogPage(driver);
//		BlogPage.clickBlogTab();
//		BlogPage.clickFullstory();
//		Assert.assertEquals(BlogPage.isCommentSectionAvailable(), "Show comments / Leave a comment");
//	}
//
//	@Test(priority = 6)
//	public void TC07_Blog_Tab() {
//
//		BlogPage BlogPage = new BlogPage(driver);
//		BlogPage.clickBlogTab();
//		Assert.assertEquals(BlogPage.isChinaDatabreaxhCardAvailable(),
//				"4 Cybersecurity Takeaways from China’s Largest Data Breach");
//	}
//
//	@Test(priority = 7)
//	public void TC08_Blog_Tab() {
//
//		BlogPage BlogPage = new BlogPage(driver);
//		BlogPage.clickBlogTab();
//		BlogPage.clickReadMore1st();
//	}
//
//	@Test(priority = 8)
//	public void TC09_Blog_Tab() {
//
//		BlogPage BlogPage = new BlogPage(driver);
//		BlogPage.clickBlogTab();
//		Assert.assertEquals(BlogPage.isTop5TipsCardAvailable(), "Top 5 Tips for Solving the Email Security Problem");
//	}
//
//	@Test(priority = 9)
//	public void TC010_Blog_Tab() {
//
//		BlogPage BlogPage = new BlogPage(driver);
//		BlogPage.clickBlogTab();
//		BlogPage.clickReadMore2nd();
//	}
//
//	@Test(priority = 10)
//	public void TC11_Blog_Tab() {
//
//		BlogPage BlogPage = new BlogPage(driver);
//		BlogPage.clickBlogTab();
//		Assert.assertEquals(BlogPage.is3rdCardAvailable(),
//				"What You Shouldn’t Be Doing with Your Cybersecurity in 2023");
//	}
//
//	@Test(priority = 11)
//	public void TC12_Blog_Tab() {
//
//		BlogPage BlogPage = new BlogPage(driver);
//		BlogPage.clickBlogTab();
//		BlogPage.clickReadMore3rd();
//	}
//
//	@Test(priority = 12)
//	public void TC13_Blog_Tab() {
//
//		BlogPage BlogPage = new BlogPage(driver);
//		BlogPage.clickBlogTab();
//		Assert.assertEquals(BlogPage.is4thCardAvailable(), "Heavy Equipment Manufacturer Finds Concrete Solutions");
//	}
//
//	@Test(priority = 13)
//	public void TC14_Blog_Tab() {
//
//		BlogPage BlogPage = new BlogPage(driver);
//		BlogPage.clickBlogTab();
//		BlogPage.clickReadMore4th();
//	}
//
//	@Test(priority = 14)
//	public void TC15_Blog_Tab() {
//
//		BlogPage BlogPage = new BlogPage(driver);
//		BlogPage.clickBlogTab();
//		Assert.assertEquals(BlogPage.is5thCardAvailable(),
//				"5 Impactful Elements That Promote IT and Business Alignment");
//	}
//
//	@Test(priority = 15)
//	public void TC16_Blog_Tab() {
//
//		BlogPage BlogPage = new BlogPage(driver);
//		BlogPage.clickBlogTab();
//		BlogPage.clickReadMore5th();
//	}
//
//	@Test(priority = 16)
//	public void TC17_Blog_Tab() {
//
//		BlogPage BlogPage = new BlogPage(driver);
//		BlogPage.clickBlogTab();
//		Assert.assertEquals(BlogPage.is6thCardAvailable(),
//				"Healthy Supply Chain Management Positions UniWell for Growth");
//	}
//
//	@Test(priority = 17)
//	public void TC18_Blog_Tab() {
//
//		BlogPage BlogPage = new BlogPage(driver);
//		BlogPage.clickBlogTab();
//		BlogPage.clickReadMore6th();
//	}
//
//	@Test(priority = 18)
//	public void TC19_Blog_Tab() {
//
//		BlogPage BlogPage = new BlogPage(driver);
//		BlogPage.clickBlogTab();
//		Assert.assertEquals(BlogPage.is7thCardAvailable(), "Simplifying and Securing Attachments in Sage X3");
//	}
//
//	@Test(priority = 19)
//	public void TC20_Blog_Tab() {
//
//		BlogPage BlogPage = new BlogPage(driver);
//		BlogPage.clickBlogTab();
//		BlogPage.clickReadMore7th();
//	}
//
//	@Test(priority = 20)
//	public void TC21_Blog_Tab() {
//
//		BlogPage BlogPage = new BlogPage(driver);
//		BlogPage.clickBlogTab();
//		BlogPage.clickStartUpPage();
//	}
//
//	@Test(priority = 21)
//	public void TC22_Blog_Tab() {
//
//		BlogPage BlogPage = new BlogPage(driver);
//		BlogPage.clickBlogTab();
//		BlogPage.clickLoadMorebtn();
//	}
}
