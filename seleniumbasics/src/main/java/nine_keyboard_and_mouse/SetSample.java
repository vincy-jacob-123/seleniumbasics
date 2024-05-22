package nine_keyboard_and_mouse;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSample {

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
		
		//System.out.println("ID of current Tab: " + driver.getWindowHandles()); //set of all open tab IDs
		
		Set<String> tabIds = driver.getWindowHandles();//current control window id
		System.out.println("No. of Tabs " + tabIds.size());  //including parent
		
		Iterator<String> value = tabIds.iterator();
		while (value.hasNext()) { 
            String windowId = value.next();
            if (!windowId.equals(parentWindow) ) {
            	driver.switchTo().window(windowId); //since here no break, it will be switched to last child window
            	System.out.println("Child window :" +windowId);
            }            
        } 
		
		WebElement newWindow = driver.findElement(By.xpath("//h3[text()='New Window']"));
		System.out.println("newWindow: " + newWindow.getText());//get text of last child window
		
		driver.close();
		//driver.close(); throws 
		//driver.close();

	}

}
