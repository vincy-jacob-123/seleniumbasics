package fifth_listType;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayOfElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 		
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
		
		
		List<WebElement> webElementsList = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li//a"));
	
		//Syntax --> List<WebElement> menuElementList=driver.
		List<WebElement> webElementsList1= driver.findElements(By.xpath("//ul[@class='navbar-nav']//li//a"));
		System.out.println("Size of web Elements  : " + webElementsList1.size());

		//webElementsList.forEach(element -> System.out.println("Text of each Element : " + element.getText())); 

		//		for (int i = 0; i < webElementsList.size(); i++ ) {
		//			String text = webElementsList.get(i).getText();
		//			//System.out.println("Text of each Element : " +  webElementsList.get(i).getText());
		//			System.out.println("Text of each Element : " + text);
		//		}

		for (WebElement element : webElementsList) {
			System.out.println("Text of each Element : " +  element.getText());
			System.out.println("tag name of each Element : " +  element.getTagName());
			System.out.println("href Attribute of each Element : " +  element.getAttribute("href"));
			System.out.println("Colour Attribute of each Element : " +  element.getCssValue("color"));
		}	
		
		
		//to find the no. of a particular tag in the whole element --> //a --> webelements.size()
		
		//to select whole checkboxes in a  page --> find the commom attribute and then do size().
		//https://selenium.qabible.in/check-box-demo.php
		//input[@type='checkbox']
	}
}
