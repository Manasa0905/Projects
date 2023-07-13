package sDemo1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo2
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PC\\Desktop\\Automation Testing\\Browser Extension\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    driver.get("https://www.saucedemo.com/");
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		Thread.sleep(1000);
	     
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		Thread.sleep(1000);	
		
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Manasa");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Dharanikota");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("500070");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		Thread.sleep(1000);
		
		driver.close();
		
	}

}
