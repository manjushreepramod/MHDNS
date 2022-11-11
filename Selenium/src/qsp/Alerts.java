package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		Robot rbt=new Robot();
		for(int i=0;i<3;i++)
		{
			rbt.keyPress(KeyEvent.VK_CONTROL);
			rbt.keyPress(KeyEvent.VK_T);
			rbt.keyRelease(KeyEvent.VK_CONTROL);
			rbt.keyRelease(KeyEvent.VK_CONTROL);
		}
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> arlis=new ArrayList<String>(ids);
		String id = arlis.get(1);
		driver.switchTo().window(id);
		Thread.sleep(1500);
		driver.get("https://www.facebook.com");
		driver.close();
		
	}

}
