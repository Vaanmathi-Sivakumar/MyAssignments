package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("vaanmathisivakumar27@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("VaanVaan");
		//driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.name("login")).click();
		String text=driver.findElement(By.className("_9ay7")).getText();
		System.out.println(text);
		
	}

}
