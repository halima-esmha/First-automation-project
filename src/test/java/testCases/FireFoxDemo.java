package testCases;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FireFoxDemo {

	public static void main(String[] args) {

		// Open edge browser
		//System.setProperty("webdriver.geckodriver.driver",
				//"C:\\Users\\Alpha\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open URL application
		driver.get("https://demoqa.com/buttons");

		// Maximize window
		driver.manage().window().maximize();

		// Instantiate Actions class
		Actions actions = new Actions(driver);

		WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn"));
		actions.doubleClick(btnDoubleClick).build().perform();

		String doubleClickMessage = driver.findElement(By.id("doubleClickMessage")).getText();
		Assert.assertEquals(doubleClickMessage, "You have done a double click");
		driver.quit();

	}

}