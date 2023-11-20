package com.training;
 import org.openqa.selenium.By;
   import org.openqa.selenium.WebElement;
   import org.openqa.selenium.chrome.ChromeDriver;
   import org.openqa.selenium.support.ui.Select;

public class Selectclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    ChromeDriver driver = new ChromeDriver();
    driver.get("http://leaftaps.com/opentaps/.");
    driver.manage().window().maximize();
    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
    Thread.sleep(4000);
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    Thread.sleep(4000);
    driver.findElement(By.className("decorativeSubmit")).click();
    Thread.sleep(4000);
    driver.findElement(By.linkText("CRM/SFA")).click();
    Thread.sleep(4000);
    driver.findElement(By.linkText("Leads")).click();
     Thread.sleep(4000);
    driver.findElement(By.linkText("Create Lead")).click();
    Thread.sleep(4000);
    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
    Thread.sleep(2000);
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhivya");
    Thread.sleep(2000);
    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Matha");
    Thread.sleep(2000);
    WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
    Select SO = new Select(source);
    SO.selectByIndex(4);
    Thread.sleep(2000);
    
   WebElement marketc = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
   Select MC= new Select (marketc);
   MC.selectByVisibleText("Automobile");
   Thread.sleep(4000);
   
   WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
   Select OW = new Select (owner);
   OW.selectByValue("OWN_CCORP");
   Thread.sleep(4000);
   
   driver.findElement(By.name("submitButton")).click();
   Thread.sleep(4000);
   
   String title = driver.getTitle();
   System.out.println(title);
   Thread.sleep(4000);
   driver.close();
 
    
    












}
}