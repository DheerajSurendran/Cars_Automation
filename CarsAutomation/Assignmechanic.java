package CarsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assignmechanic {
	@Test(priority = 1, description = "View Mechanics")
	public void viewMechanics() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheerajowner");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();


	    driver.findElement(By.xpath("//a[contains(text(),'Assign Mechanics')]")).click();

	    Thread.sleep(2000);

	    Select garage = new Select(driver.findElement(By.name("garage")));
	    garage.selectByVisibleText("Falcon Motors - Kochi");

	    driver.findElement(By.xpath("//button[contains(text(),'View Mechanics')]")).click();

	    Thread.sleep(3000);

	    System.out.println("Mechanics Displayed Successfully");
	}
	
	@Test(priority = 2, description = "Empty Garage Selection")
	public void emptyGarage() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheerajowner");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'Assign Mechanics')]")).click();

	    Thread.sleep(2000);

	    driver.findElement(By.xpath("//button[contains(text(),'View Mechanics')]")).click();

	    Thread.sleep(3000);

	    System.out.println("Empty Garage Test Executed");
	}

}
