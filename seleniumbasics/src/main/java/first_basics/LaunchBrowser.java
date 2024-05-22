package first_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.amazon.in/"); //to launch a  page
		//driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize(); //to maximize
		
		String appTitle = driver.getTitle();
		System.out.println("appTitle:" +  appTitle); //to get the title
		
		String appUrl = driver.getCurrentUrl();
		System.out.println("\nappUrl:" +  appUrl); //to get the current app URL
		
		
		driver.get(appUrl); //to refresh the page
		
		
	}
	

}
