package ThinkBridgeco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThinkBridgetask002 {
	
	
	
	
    WebDriver driver; 
	
	@Test
	public void launchURL() throws Exception
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.bestundertaking.net/NewConnection.aspx");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.close();
	
	}
}


// #    FeedBack/SDuggestions
// 
//1)  Whenever mobile no is entered, the no is correct or not that should be varified by sending OTP
//2)  Must be devided in number of pages, when Applicant details will get filled, 
//    then User should get access to process next page of Power supply address.it will make storing of data and processing of data more effectively.
//3)  When cursor is moved on specific tab, it will get highlighted.
//4)  he Letters font should be more large bold. Mostly it is good to keep background as white, for different elements like First name etc. 
//    They should have background color different that that of tabs where user will enter credentials 



