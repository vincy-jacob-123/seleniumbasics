package Third_diffrentXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 

		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();
		
//		WebElement searchButttonUsingXpath = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
//		searchButttonUsingXpath.click();
//		
//		searchButttonUsingXpath = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
//		searchButttonUsingXpath.click();
		
	
		//******************syntax for parent--child--************
		//command for parent-child --> //div[@class='nav-sear]ch-field ']//input[@class='nav-input nav-progressive-attribute']
		
		
		//******************syntax for shortcut parent--child--************
		//Syntax : (//input[@class='nav-input nav-progressive-attribute'])[1]		
		//==> example (//input[@class='nav-input nav-progressive-attribute'])[1]
		
		//*****using Text element as Xpath*****Syntax --> //tagName[text()='visible text'] -->imp topic
		//WebElement showFieldUsingText = driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
		//showFieldUsingText.click();
		
		//driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		//WebElement forgotPasswordUsingText = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		//forgotPasswordUsingText.click();	
		
		//div[@class='form-check form-check-inline']//label[text()='Male']
		
		//WebElement maleLabel = driver.findElement(By.xpath("//div[@class='form-check form-check-inline']//label[text()='Male']"));
		//maleLabel.click();	
		
		//driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		
		//WebElement electronics = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		//electronics.click();	
		
		//a[contains(text(),'Input Form')]
		
		// ----> ul[@class='navbar-nav']//li[2]//a[contains(text(),'Input Form')]
		
		
		//*****using Contains in Text element as Xpath--> syntax : //tagname[contains(text(),'yourtext')]
		WebElement containsSample = driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
		containsSample.click();
		
		
		//driver.get("https://www.amazon.in/");
		//WebElement containsSample2 = driver.findElement(By.xpath("//a[contains(text(),'Forgotten pass')]"));
		//containsSample2.click();
		
		//a[contains(@href,'https://www.facebook.com/recover/initiate/')]
		
		//important topic
		//*****using Contains in href or src element as Xpath--> syntax : //tagName[contains(@attribute,'value')]
		driver.get("https://www.facebook.com/");
		//WebElement hrefSample2 = driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/recover/initiate/')]"));
		//hrefSample2.click();
		
		
		//*****using starts-with in href or src element as Xpath--> syntax : //tagName[starts-with(text(),'yourText')]
		WebElement hrefSample3 = driver.findElement(By.xpath("//a[starts-with(@href,'https://www.facebook.com/r')]"));
		hrefSample3.click();
		
		// ---> 	//ul[@class='navbar-nav']//li[3]//a[contains(text(),'Date Pickers')]
		
		//diff btw single slash and double slash
		
		//for traversing -- to follow siblings
		//label[contains(text(),'Check Box Four')]//preceding-sibling::input
		
		//label[contains(text(),'Check Box Four')]//following-sibling::input
		
		
		//ul[@class='navbar-nav']//li[2]//following-sibling::li
		
		//https://selenium.qabible.in/simple-form-demo.php --> verifies two xpaths..if displayed check, then it checks two things logo and show message
		//a[@href='index.php']//img[@src='images/logo.png']//following::button[@id='button-one']
		
		
			
			
		
	}

}
