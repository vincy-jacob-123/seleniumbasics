package second_elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByLinkText_TagNameSample {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 

		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//using hyper link
		//WebElement forgotPassword = driver.findElement(By.linkText("Forgotten password?")); //<a href for full word
		//forgotPassword.click();
		
		//here get the visible input text
		WebElement forgotPasswordPartial = driver.findElement(By.partialLinkText("Forgotten")); //<a href for partial word
		forgotPasswordPartial.click();
		
		driver.get("https://www.flipkart.com/account/login?ret=/");
		driver.manage().window().maximize();
		WebElement textLink = driver.findElement(By.linkText("Terms of Use")); //<a href for partial word
		textLink.click();

		
		//By using tag //here code stability will be less
		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();
	}

}
