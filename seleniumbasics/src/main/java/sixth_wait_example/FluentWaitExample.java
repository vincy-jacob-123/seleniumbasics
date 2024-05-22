package sixth_wait_example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.NoSuchElementException;

public class FluentWaitExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/jquery-progress-bar.php");
		driver.manage().window().maximize();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30L))  //max time
			       .pollingEvery(Duration.ofSeconds(5L)) //polling interval
			       .ignoring(NoSuchElementException.class);

		WebElement startButton = driver.findElement(By.xpath("//button[text()='Start Download']")) ;
		startButton.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='ui-button ui-corner-all ui-widget']")));
		WebElement closeButton = driver.findElement(By.xpath("//button[@class='ui-button ui-corner-all ui-widget']")) ;
		System.out.println("close button isDisplayed :" + closeButton.isDisplayed());
		
		//fluent wait --> for specific element only..polling interval for a  element
		//can catch exceptions and continue the remaining code
		
	}

}
