package utils;

import org.openqa.selenium.By;

public class Solution_Tab_locators {
	public static By SolutionBtn = By.xpath("//ul[@id='menu-1-4677853']//child::a[text()='Solutions']");
	public static By ManagedServicesBtn = By.xpath(
			"(//a[text()='Managed Services' and @href='https://www.magicgovern.ai/solutions/managed-services/'])[1]");
	public static By ItConsultancyBtn = By.xpath(
			"(//a[text()='IT Consulting & Advisory' and @href='https://www.magicgovern.ai/solutions/it-consulting-advisory/'])[1]");
	public static By CyberSecurityBtn = By.xpath(
			"(//a[text()='Cyber Security' and @href='https://www.magicgovern.ai/solutions/cyber-security/'])[1]");
	public static By WebDevelopmentBtn = By.xpath(
			"(//a[text()='Web Development' and @href='https://www.magicgovern.ai/solutions/web-development/'])[1]");
	public static By MobileDevelopmentBtn = By.xpath(
			"(//a[text()='Mobile Development' and @href=\"https://www.magicgovern.ai/solutions/mobile-development/\"])[1]");
	public static By CloudeServicesBtn = By.xpath(
			"(//a[text()='Cloud Services' and @href=\"https://www.magicgovern.ai/solutions/cloud-services/\"])[1]");
	public static By DigitalTransformationBtn = By.xpath("//h3[contains(text(),'Digital Transformation')]");
	public static By SecurityBtn = By.xpath("//h3[contains(text(),'Security')]");
	public static By AutomationBtn = By.xpath("//h3[contains(text(),'Automation')]");
	public static By GainingEfficiencyBtn = By.xpath("//h3[contains(text(),'Gaining Efficiency')]");
	public static By IndustryManufacturingBtn = By.xpath(
			"(//a[text()='Industry Manufacturing' and @href=\"https://www.magicgovern.ai/industries/industry-manufacturing/\"])[1]");
	public static By TransportationLogisticBtn = By.xpath(
			"(//a[text()='Transportation Logistics' and @href=\"https://www.magicgovern.ai/industries/transportation-logistics/\"])[1]");
	public static By HealthcareBtn = By
			.xpath("(//a[text()='Healthcare' and @href=\"https://www.magicgovern.ai/industries/healthcare/\"])[1]");
	public static By BankandinsuranceBtn = By.xpath(
			"(//a[text()='Banks & Insurance' and @href=\"https://www.magicgovern.ai/industries/banks-insurance/\"])[1]");
	public static By CounsltingProvidersBtn = By.xpath(
			"(//a[text()='Consulting Providers' and @href=\"https://www.magicgovern.ai/industries/consulting-providers/\"])[1]");
	public static By NonProfitBtn = By
			.xpath("(//a[text()='Non Profit' and @href=\"https://www.magicgovern.ai/industries/non-profit/\"])[1]");
	public static By ViewAllBtn = By.xpath("//span[text()='View all']//ancestor::a");
	public static By CallusBtn = By.xpath("//span[text()='Call us at:  1-800-356-8933']");
	public static By NFTLearnMoreBtn = By.xpath(
			"//span[text()='Learn more']//ancestor::a[@href='https://www.magicgovern.ai/solutions/nft-development/']");
}
