
package helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
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

//	@BeforeMethod
//	public void setup() {
//		
//		loadProperties(); // Load properties before setting up the driver
////		this.driver = new ChromeDriver();
//		driver = new EdgeDriver();
//		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		this.driver.get(properties.getProperty("URL"));
//		this.driver.manage().window().maximize();
//		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		
//	}
	
	 @BeforeMethod
	    public void setup() {
	        loadProperties(); // Load properties before setting up the driver

	        // Set up EdgeDriver
	        System.setProperty("webdriver.edge.driver", "C:\\Users\\MonalishaRabha\\eclipse\\edgedriver_win64\\msedgedriver.exe");
	        driver = new EdgeDriver();

	        // Configure browser
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        
	        // Navigate to the URL from properties file
	        String url = properties.getProperty("URL");
	        if (url != null && !url.isEmpty()) {
	            driver.get(url);
	        } else {
	            System.err.println("URL not found in config.properties");
	        }

	        // Set up explicit wait
	        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	        System.out.println("Edge Browser launched successfully.");
	    }
}