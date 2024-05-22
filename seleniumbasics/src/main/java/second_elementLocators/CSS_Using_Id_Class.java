package second_elementLocators;

import javax.swing.text.html.CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.css.CSSValue;

public class CSS_Using_Id_Class {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 

		//*************FIND BY CSS****************
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//CSS By using ID
		WebElement searchFieldUsingId = driver.findElement(By.cssSelector("#twotabsearchtextbox")); // using ID..put #here		
		searchFieldUsingId.click();
			
		
		//CSS By using class
		WebElement searchFieldUsingClass = driver.findElement(By.cssSelector(".nav-input.nav-progressive-attribute"));
		//put dot here if space is there
		searchFieldUsingClass.click();
		
		//By using tag //here code stability will be less
		WebElement dropDownField = driver.findElement(By.tagName("select"));
		dropDownField.click();
		
		//searchField.sendKeys("bags");
		
		
		driver.get("https://www.facebook.com/");
		WebElement searchFieldInFb = driver.findElement(By.cssSelector(".inputtext._55r1._6luy")); //using class name ..put . here also, if any space, delete that space and put  .
		//here if more than two matches, it picks first one
		searchFieldInFb.click();

	}

}
