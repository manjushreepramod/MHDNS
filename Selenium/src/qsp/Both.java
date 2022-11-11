package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
class Both{

public static void main (String args[])
{
	
	String key1="webdriver.chrome.driver";
	String value1="./sw/chromedriver.exe";
	System.setProperty(key1, value1);
	 ChromeDriver driver = new ChromeDriver();
	 String key="webdriver.gecko.driver";
		String value="./sw/geckodriver.exe";
		System.setProperty(key, value);
		 WebDriver driver1 = new FirefoxDriver();
}


}	
	

