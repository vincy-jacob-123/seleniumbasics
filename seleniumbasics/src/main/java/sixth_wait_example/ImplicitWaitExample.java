package sixth_wait_example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExample {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7)); // max wait time
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); //throws exception here as webelemt wont appears within that
		
		WebElement obj = driver.findElement(By.xpath("//button[text()='Start']")) ;
		obj.click();

		WebElement helloWorld = driver.findElement(By.xpath("//h4[text()='Hello World!']")) ;
		System.out.println(helloWorld.getText());
		
		//global wait --> applicable to all the web element
		//need to declare only once
		//applicable to all web elements until driver terminates.
		//if declares more than once, it takes the last declared time
		
		//disadv: --> in case of errors, it throws only after this time peroid
	}
}
