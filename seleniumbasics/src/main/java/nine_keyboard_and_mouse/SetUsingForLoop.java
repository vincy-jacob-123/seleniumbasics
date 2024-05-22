package nine_keyboard_and_mouse;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUsingForLoop {

	public static void main(String[] args) {

		System.getProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();

		WebElement clickObj = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickObj.click();	

		String parentWindow = driver.getWindowHandle();
		System.out.println("ID of current Tab: " + driver.getWindowHandle()); //this ID varies for each run --> parent tab
		clickObj.click();
		clickObj.click();

		Set<String> tabIds = driver.getWindowHandles();//current control window id
		System.out.println("No. of Tabs " + tabIds.size());  //including parent

		for (String tabId: tabIds) {
			if (!tabId.equals(parentWindow) ) {
				driver.switchTo().window(tabId); 
				System.out.println("Child window :" +tabId);
			}            
		}
		
		WebElement newWindow = driver.findElement(By.xpath("//h3[text()='New Window']"));
		System.out.println("newWindow: " + newWindow.getText());//get text of last child window
		System.out.println("ID of current Tab: " + driver.getWindowHandle());
		
		driver.close(); // here it close the current child window
		
		driver.switchTo().window(parentWindow);  //switching to current tab
		System.out.println("ID of Parent Tab: " + driver.getWindowHandle());
		
		driver.quit(); //close complete browser
		
	}

}
