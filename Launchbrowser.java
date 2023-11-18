package com.training;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class Launchbrowser {
	public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver =new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	
  driver.manage().window().maximize();
  driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
  Thread.sleep(4000);
  driver.findElement(By.id("pass")).sendKeys("test@123");
 Thread.sleep(4000);
 driver.findElement(By.name("login")).click();
 Thread.sleep(4000);
 driver.findElement(By.linkText("Find your account and log in.")).click();
 Thread.sleep(4000);
 
  
  
   driver.close();
  
   
}
}