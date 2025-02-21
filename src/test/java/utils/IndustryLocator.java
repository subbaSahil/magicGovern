package utils;

import org.openqa.selenium.By;

public class IndustryLocator {

	public By SolutionTabHover = By.xpath("//ul[@id='menu-1-4677853']//child::a[text()='Solutions']");

	public By viewAll = By.xpath("//span[text()='View all']//ancestor::a");
	public By clientSupport = By.xpath("//span[text()='Client Support']");
	public By phoneNumber = By.xpath("(//span[text()='1-800-356-8933'])[1]");
	public By learnMoreFinetech = By
			.xpath("//span[text()='Learn more']//ancestor::a[@href='https://www.magicgovern.ai/industries/fintech/']");
	public By industryManufacturing = By.xpath(
			"//span[text()='Learn more']//ancestor::a[@href='https://www.magicgovern.ai/industries/industry-manufacturing/']");
	public By TransportationLogistic = By.xpath(
			"//span[text()='Learn more']//ancestor::a[@href='https://www.magicgovern.ai/industries/transportation-logistics/']");
	public By HealthCare = By.xpath(
			"//span[text()='Learn more']//ancestor::a[@href='https://www.magicgovern.ai/industries/healthcare/']");
	public By BankInsurance = By.xpath(
			"//span[text()='Learn more']//ancestor::a[@href='https://www.magicgovern.ai/industries/banks-insurance/']");
	public By ConsultingProvider = By.xpath(
			"//span[text()='Learn more']//ancestor::a[@href='https://www.magicgovern.ai/industries/consulting-providers/']");
	public By NonProfit = By.xpath(
			"//span[text()='Learn more']//ancestor::a[@href='https://www.magicgovern.ai/industries/non-profit/']");
	public By Telemedicine = By.xpath(
			"//span[text()='Learn more']//ancestor::a[@href='https://www.magicgovern.ai/industries/telemedicine/']");
	public By DatingApp = By.xpath(
			"//span[text()='Learn more']//ancestor::a[@href='https://www.magicgovern.ai/industries/dating-apps/']");

}
