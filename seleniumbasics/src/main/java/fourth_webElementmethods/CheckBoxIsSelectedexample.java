package fourth_webElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxIsSelectedexample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		
		//**********Syntax for checking a checkbox selected or not***************
		WebElement checkBox1 = driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]"));// ---> correct syntax
		//WebElement checkBox1 = driver.findElement(By.xpath("(//form[@id='checkboxes']//input)[1]"));
		boolean isCheckBox1Selected = checkBox1.isSelected();
		boolean isCheckBox1Displayed = checkBox1.isDisplayed();
		boolean isCheckBox1Enabled = checkBox1.isEnabled();
		System.out.println("isCheckBox1Selected ::::" + isCheckBox1Selected);
		System.out.println("isCheckBox1Displayed ::::" + isCheckBox1Displayed);
		System.out.println("isCheckBox1Enabled ::::" + isCheckBox1Enabled);
		
		
		WebElement checkBox2 = driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));
		boolean isCheckBox2Selected = checkBox2.isSelected();
		boolean isCheckBox2Displayed = checkBox1.isDisplayed();
		boolean isCheckBox2Enabled = checkBox2.isEnabled();
		System.out.println("\nisCheckBox2Selected ::::"  +  isCheckBox2Selected);
		System.out.println("isCheckBox2Displayed ::::" + isCheckBox2Displayed);
		System.out.println("isCheckBox1Enabled ::::" + isCheckBox2Enabled);
		
		
		//*****Syntax for closing entire browser screen *************
		//driver.close();//close only current tab if too many tabs.. close complete browser only if one tab
		//driver.quit(); //terminate entire tabs in the current browser
		
		if (isCheckBox1Selected == false) {
			checkBox1.click();
		}	
		
		if (isCheckBox2Selected == false) {
			checkBox2.click();
		}	
		
	}
	

}
