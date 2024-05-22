package second_elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators_Id_Name {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 


		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();


		//**************FIND BY ID**************** 
		//WebElement obj2; 
		WebElement searchField = driver.findElement(By.id("twotabsearchtextbox")); //to initialize a webelement, use driver
		//above one, we only finds the elements, no action 
		searchField.click(); //here comes the action
		searchField.sendKeys("Shoes"); //to send data to a field searchField.clear();

		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		//searchButton.click();


		//*************FIND BY NAME****************
		driver.get("https://www.facebook.com/");
		WebElement emailIdField = driver.findElement(By.name("email"));		
		emailIdField.click();
		emailIdField.sendKeys("vincyjacob27@gmail.com");

		WebElement passwordField = driver.findElement(By.name("pass"));		
		emailIdField.click();
		passwordField.sendKeys("vinmaria27");

		WebElement loginButon = driver.findElement(By.name("login"));	
		loginButon.click();


	}

}
