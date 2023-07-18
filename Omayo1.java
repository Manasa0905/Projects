package omayo;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Omayo1 {

	public static void main(String[] args) throws InterruptedException
	{
		Select s;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Desktop\\Automation Testing\\Browser Extension\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		
		driver.get("http://omayo.blogspot.com/#");
		
	    
    	//CLICKING ON HOME BUTTON
    	driver.findElement(By.xpath("//*[@id=\"home\"]")).click();
		
		// CHECKING "TEXT AREA FEILD"
    	driver.findElement(By.id("ta1")).sendKeys("This is simple text");  
		
    	//CLICKING HYPERLINK ""http://www.Selenium143.blogspot.com"
 		String parentwindowHandle = driver.getWindowHandle();
	
    	//Clicking on hyperlink 
    	driver.findElement(By.xpath("//*[@id=\"selenium143\"]")).click();

		//get the number of windows currently opened on the system
		Set<String> window = driver.getWindowHandles();
	
  		for (String wh : window) 
     	{
			driver.switchTo().window(wh);
     	}
		String childtitle = driver.getTitle();
		Thread.sleep(1000);
		//Selecting a particular element in the newly opened window
		WebElement link = driver.findElement(By.xpath("//*[@id=\"HTML7\"]/div[1]/table/tbody/tr/td[1]/ol/li[1]/b/a"));
		link.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.close();
		//Switching to parent window
		driver.switchTo().window(parentwindowHandle);
		
		//SELECTING DROPDOWN "OLDER NEWSLETTERS"
		 s = new Select(driver.findElement(By.xpath("//*[@id=\"drop1\"]")));
		 s.selectByVisibleText("doc 3");
		 
		 //SELECTING "Double Click Here" Button
		 WebElement button = driver.findElement(By.xpath("//*[@id=\"HTML46\"]/div[1]/button"));
		 Thread.sleep(1000);
		 Actions a = new Actions(driver);
		 a.doubleClick(button).perform();
		 Thread.sleep(1000); 
		    
		 Alert al = driver.switchTo().alert();
		 Thread.sleep(1000);
		 al.accept();
		
		//SELECTING DEFAULT CHECKBOX "BLUE"
		driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
		
		//SELECTING RADIO BUTTON "FEMALE"
		driver.findElement(By.xpath("//*[@id=\"radio2\"]")).click();
		 
		//CHECKING ALERT POP UP "Click ToGetAlert"
		driver.findElement(By.xpath("//*[@id=\"alert1\"]")).click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		Thread.sleep(1000);
	    System.out.println("Alert Text: " + alertText);
	    Thread.sleep(1000);
	    alert.accept();
	    
	    //SEARCHING "What is Automation" in "Search Thisblog"
	    driver.findElement(By.xpath("//*[@id=\"BlogSearch1_form\"]/form/table/tbody/tr/td[1]/input")).sendKeys("What is Automation");
	    driver.findElement(By.xpath("//*[@id=\"BlogSearch1_form\"]/form/table/tbody/tr/td[2]/input")).click();
	    Thread.sleep(1000);
	    driver.navigate().back();
	    Thread.sleep(1000);
	    
	    //SELECTING "GetPrompt"
	    driver.findElement(By.xpath("//*[@id=\"prompt\"]")).click();
	    Alert promal=driver.switchTo().alert();
	    Thread.sleep(1000);
	    String alertText1 = promal.getText();
	    System.out.println("Alert Text: " + alertText1);
	    Thread.sleep(1000);
	    promal.sendKeys("Manasa");
	    Thread.sleep(1000);
	    promal.accept();
	    
	    //SELECTING "GetConfirmation"
	    driver.findElement(By.xpath("//*[@id=\"confirm\"]")).click();
		Alert confal = driver.switchTo().alert();
		String alertText3 = alert.getText();
		Thread.sleep(1000);
	    System.out.println("Alert Text: " + alertText3);
	    Thread.sleep(1000);
	    confal.accept();
	    //confal.dismiss();
	    
	    //CHECKING "Select a vehicle"
	    driver.findElement(By.xpath("//*[@id=\"HTML32\"]/div[1]/input[1]")).click();
	    Thread.sleep(1000);
	    
	    //CHECKING "Select multiple options"
	    driver.findElement(By.xpath("//*[@id=\"HTML33\"]/div[1]/input[1]")).click();
	    driver.findElement(By.xpath("//*[@id=\"HTML33\"]/div[1]/input[4]")).click();
	    Thread.sleep(1000);
	    
	    
	  
	    driver.close();
	}

}
