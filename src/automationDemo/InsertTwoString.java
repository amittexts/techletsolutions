package automationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class InsertTwoString {
	
	@Test
	public void mytest()
	{
		String s1="mohit=";
		String s2= "sharma";
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
		WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
		email.sendKeys(s1);
		email.sendKeys(s2);
		
		
	}


}
