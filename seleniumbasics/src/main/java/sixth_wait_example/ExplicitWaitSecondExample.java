package sixth_wait_example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitSecondExample {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/jquery-progress-bar.php");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		WebElement startButton = driver.findElement(By.xpath("//button[text()='Start Download']")) ;
		//wait.until(ExpectedConditions.elementToBeClickable(startButton));
		startButton.click();
		
		//*************invisibilityOf*****************
		WebElement cancelDownload = driver.findElement(By.xpath("//button[text()='Cancel Download']")) ;
		wait.until(ExpectedConditions.invisibilityOf(cancelDownload)); //backward check
		
		WebElement complete = driver.findElement(By.xpath("//div[contains(text(),'Complete')]")) ;
		System.out.println("text of complete :" + complete.getText());
		
		WebElement closeButton = driver.findElement(By.xpath("//button[@class='ui-button ui-corner-all ui-widget']")) ;
		System.out.println("close button isDisplayed :" + closeButton.isDisplayed());
		
		
		
	}
}
