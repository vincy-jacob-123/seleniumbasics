package sixth_wait_example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		
		//*************elementToBeClickable*****************
		WebElement startButton = driver.findElement(By.xpath("//button[text()='Start']")) ;
		wait.until(ExpectedConditions.elementToBeClickable(startButton));
		startButton.click();

		//*************visibilityOfElementLocated*****************
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
		WebElement helloWorld = driver.findElement(By.xpath("//h4[text()='Hello World!']")) ;
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
		System.out.println(helloWorld.getText());


		//it is defined only for one webelement, for which it is declared for..
		//if both implicit and explicit waits are there, then it adds together

	}	

}

