
package helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	public WebDriver driver;
	public WebDriverWait wait;

	public Properties properties = new Properties();

	private void loadProperties() {
		try (FileInputStream fileInput = new FileInputStream(
				"C:\\Users\\MonalishaRabha\\eclipse-workspace\\MagicGovern\\config.properties")) {
			properties.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@BeforeMethod
	public void setup() {
		
		loadProperties(); // Load properties before setting up the driver
		this.driver = new ChromeDriver();
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		this.driver.get(properties.getProperty("URL"));
		this.driver.manage().window().maximize();
//		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
	}
}
