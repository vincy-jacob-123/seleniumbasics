package Third_diffrentXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicXPath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//syntax : //tagName[@attribute='attribute value']
		
		//WebElement searchUsingXpath = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//searchUsingXpath.click();
		
		WebElement searchButttonUsingXpath = driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']"));
		searchButttonUsingXpath.click();
		
		

	}

}
