package week9.day1Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServiceCaller {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev140572.service-now.com\r\n");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.switchTo().frame(0);
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("user_password")).sendKeys("P-qQ7@umSYz8");
        driver.findElement(By.id("sysverb_login")).click();
        driver.switchTo().defaultContent();
		
		driver.findElement(By.id("filter")).sendKeys("ALL",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Callers']")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("sys_user.first_name")).sendKeys("Venda");
		driver.findElement(By.id("sys_user.last_name")).sendKeys("R");
		driver.findElement(By.id("sys_user.email")).sendKeys("vendar2k1@gmail.com");
		driver.findElement(By.id("sys_user.phone")).sendKeys("Redmi");
		driver.findElement(By.id("sys_user.mobile_phone")).sendKeys("Oneplus");
		driver.findElement(By.id("lookup.sys_user.title")).click();
		Set<String>windowHandle=driver.getWindowHandles();
		List<String>windowHandle1=new ArrayList<String>(windowHandle);
		driver.switchTo().window(windowHandle1.get(1));
		driver.findElement(By.linkText("Solution Consultant")).click();
		
		
		Set<String>windowHandle2=driver.getWindowHandles();
		List<String>windowHandle13=new ArrayList<String>(windowHandle2);
		driver.switchTo().window(windowHandle13.get(0));
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("sysverb_insert_bottom")).click();
		WebElement findElement = driver.findElement(By.xpath("//div[text()='Primary email device created for Venda R']"));
		System.out.println("successfull message");
		
	}
	

}
