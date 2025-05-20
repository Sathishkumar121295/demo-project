package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.flipkart.com/");
       driver.manage().window().maximize();
       List<WebElement> flip = driver.findElements(By.xpath("//div[@class='_3sdu8W emupdz']/child::*"));
       
       }

}
