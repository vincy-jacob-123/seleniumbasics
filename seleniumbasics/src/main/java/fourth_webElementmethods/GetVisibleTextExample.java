package fourth_webElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetVisibleTextExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 

		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		
		WebElement showElement= driver.findElement(By.xpath("//button[@id='button-one']"));
		
		//****Syntax to retrieve visible inputs from any element ---> showElement.getText();
		System.out.println("Text Element ::::" + showElement.getText());
		
		String msg = "Your Message";
		//WebElement msgElement= driver.findElement(By.xpath("//div[contains(text(),'Your Message')]"));
		WebElement msgElement= driver.findElement(By.xpath("//div[contains(text(),'" +msg + "')]"));
		System.out.println("Your message Element ::::" + msgElement.getText());

	}

}
