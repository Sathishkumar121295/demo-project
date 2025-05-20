package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {
public static void main(String[]args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/?m=1");
	WebElement name = driver.findElement(By.xpath("//input[@placeholder='Enter Name']"));
	name.sendKeys("Sathishkumar");
	WebElement email = driver.findElement(By.xpath("//input[@placeholder='Enter EMail']"));
	email.sendKeys("sathis@gmail.com");
	WebElement phone = driver.findElement(By.xpath("//input[@placeholder='Enter Phone']"));
	phone.sendKeys("587458521254");
	WebElement address = driver.findElement(By.xpath("//textarea[@id='textarea']"));
	address.sendKeys("coimbatore");
	
}

}
