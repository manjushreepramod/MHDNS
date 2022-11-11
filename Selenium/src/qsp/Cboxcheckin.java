package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cboxcheckin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Manjushree/Desktop/checkbox.html");
		Thread.sleep(2000);
		List<WebElement> cboxs = driver.findElements(By.xpath("//input"));
		for(WebElement cbox:cboxs)
		{
		
			cbox.click();
			Thread.sleep(1000);
			}
		for(int i=cboxs.size()-1;i>=0;i--)
		{

			cboxs.get(i).click();
		}
		}

	}

