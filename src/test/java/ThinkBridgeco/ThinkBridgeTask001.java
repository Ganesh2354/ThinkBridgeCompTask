package ThinkBridgeco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThinkBridgeTask001 {
	
	
    WebDriver driver;
		@BeforeSuite
		
		public void launchBrowserandURLforQ2()
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("http://jt-dev.azurewebsites.net/#/SignUp");
			driver.manage().window().maximize();
			
		}
		// To Validate The DropDown
//		@Test()
//		public  void toValidatedropDown1()
//		{
//			WebElement dropdown=driver.findElement(By.xpath("//input[@type='search']"));
//			Select language=new Select(dropdown);
//	    	language.selectByVisibleText("Dutch");
//	    	
//	    	
////			If this language option is not found then exception will throw "org.openqa.selenium.NoSuchElementException" by taking ScreenShot of this we can validate with proof.
////	      by taking screen shot we can maintain the result of displaying two Languages :- English and Dutch
//		}
//
//		
		// Fill In Your name in Name Tab
		@Test
		public void fillYournameorganizationAndEmailInTab()
		{
			WebElement nametab=driver.findElement(By.id("name"));
			nametab.sendKeys("Dharam Raj Sinha");  //name will be entered in name tab
			WebElement organiztn=driver.findElement(By.id("orgname"));
			organiztn.sendKeys("TRON Softech");
			WebElement mail=driver.findElement(By.xpath("//input[@type='email'"));
			mail.sendKeys("ganeshrajdandekar68@gmail.com");
			
		}
		
		//To validate I Agree to the terms and conditions checkbox and Signup button
		@Test
		public void validateCheckBoxAndSIGNUP() throws Exception
		{
			
			WebElement agreecheckbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
			//check whether the checkbox is already selected, if not then it will get select
			if(agreecheckbox.isSelected()==false) {
			agreecheckbox.click();
			}
			WebElement signup=driver.findElement(By.xpath("//button[@type='signup']"));
			signup.click();
			Thread.sleep(3000);
			
	}
		// We can validate the receiving of mail manually after successful signup
		@AfterSuite
		public void closeTheBrowser()
		{
			driver.close();
		}
	
}
