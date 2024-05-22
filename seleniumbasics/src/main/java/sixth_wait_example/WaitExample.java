package sixth_wait_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitExample {

	public static void main(String[] args) throws Exception {
		
			System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\localDriver\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
			driver.manage().window().maximize();
			
			WebElement obj = driver.findElement(By.xpath("//button[text()='Start']")) ;
			obj.click();
			Thread.sleep(10000); //not selenium wait.. it just freezes the code until and unless the timer elapses..so wastage of time
						
			WebElement helloWorld = driver.findElement(By.xpath("//h4[text()='Hello World!']")) ;
			System.out.println(helloWorld.getText());
			
			//wait() --> used to synchronize the application and selenium timings.. it monitors the loading web element and it terminates 
			// the waiting, once the element appears, though the declared max wait time period..
			
			//1. implicit
			//  2. Explicit
			//  3.Fluent
	}

}
