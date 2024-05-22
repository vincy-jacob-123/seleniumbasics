package nine_keyboard_and_mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;

import org.openqa.selenium.interactions.*;
import java.awt.datatransfer.*;
import java.awt.event.KeyEvent;


public class FileUploadusingRobot {

	public static void main(String[] args) throws AWTException {

		System.getProperty("webdriver.chrome.driver", "D:\\Selenium\\localDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver; //explicit type casting
		//it is an interface used to execute java script commands
		js.executeScript("alert('vincy')");  //important topic

		WebElement fileUpload = driver.findElement(By.xpath("//input[@id='file-upload']"));
		String filePath = "D:\\Selenium\\Assignments\\AlertSample.png";
		
		Robot robot = new Robot();
		Actions actions = new Actions(driver);
		actions.moveToElement(fileUpload).click().build().perform(); // click on upload button
		
		StringSelection ss = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null); //go to the file path to be copied and then do ctrl +c 
		robot.delay(1000); //delay for copying
		
		robot.keyPress(KeyEvent.VK_CONTROL); //ctrl + v ==> paste 
		robot.keyPress(KeyEvent.VK_V);	
		robot.keyRelease(KeyEvent.VK_V);	
		robot.delay(1000);//delay for pasting
		
		robot.keyPress(KeyEvent.VK_ENTER); //click on open button 
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
}
