package helper;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Interactions {
	WebDriver driver;
	WebDriverWait wait;

	public Interactions(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	public void clickElement(Object target) {
		WebElement element;
		if (target instanceof By) {
			element = wait.until(ExpectedConditions.elementToBeClickable((By) target));
		} else if (target instanceof WebElement) {
			element = (WebElement) target;
		} else {
			throw new IllegalArgumentException("\"Invalid argument type. Must be By or WebElement.\"");
		}
		clickElementJS(element);
	}

	public void switchToIframe(By locator) {
		WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		driver.switchTo().frame(iframe);
	}

	private void clickElementJS(WebElement element) {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			element.click();
		} catch (ElementClickInterceptedException e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			System.out.println("Failed to click the element. Error: " + e.getMessage());
		}
	}

	public WebElement visibilityEle(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void sendingKeys(By locator, String keyValue) {
		WebElement element = visibilityEle(locator);
		element.clear();
		element.sendKeys(keyValue);
	}

	public void executeWithDelay(Runnable action) {
		try {
			Thread.sleep(2000);
			action.run();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getTabTitle(By locator) {
		String tabTitle = driver.findElement(locator).getText();
		return tabTitle;
	}

	public String getInnerText(By locator) {
		String tabTitle = driver.findElement(locator).getText();
		return tabTitle;
	}

	public void hoverOverElement(By element) {
		try {
			WebElement hoverElement = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
			Actions actions = new Actions(driver);
			actions.moveToElement(hoverElement).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click(By element) {
		int retryCount = 2; // Number of retries
		int attempts = 0;
		boolean clicked = false;

		while (attempts < retryCount && !clicked) {
			try {
				// Try to find the clickable element
				WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(element));
				clickableElement.click(); // Attempt to click the element using WebDriver
				clicked = true; // Successfully clicked using WebDriver
				System.out.println("Element clicked successfully: " + element);
			} catch (Exception e) {
				attempts++;
				System.out.println("Attempt " + attempts + " to click on " + element + " failed: " + e.getMessage());

				// If all attempts with WebDriver fail, use JavaScriptExecutor
				if (attempts == retryCount) {
					System.out.println("Failed to click using WebDriver. Attempting JavaScriptExecutor...");
					try {
						JavascriptExecutor js = (JavascriptExecutor) driver;
						WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(element));
						js.executeScript("arguments[0].click();", clickableElement); // Use JS to click
						clicked = true;
						System.out.println("Element clicked using JavaScriptExecutor: " + element);
					} catch (Exception jsException) {
						System.out.println("JavaScriptExecutor also failed to click on " + element + ": "
								+ jsException.getMessage());
					}
				}
			}
		}

		if (!clicked) {
			System.out.println("Failed to click on the element after " + retryCount + " attempts.");
		}
	}

	public String getText(By element) {
		try {
			WebElement textElement = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
			return textElement.getText();
		} catch (Exception e) {
			e.printStackTrace();
			return null; // Return null in case of any exception
		}
	}

}