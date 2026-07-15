package CarsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
//	@Test(priority = 1, description = "Valid Login")
//	public void validLogin() throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://sathu.pythonanywhere.com/");
//
//		Thread.sleep(4000);
//
//	    driver.findElement(By.xpath("//a[text()='Login']")).click();
//
//	    driver.findElement(By.id("username")).sendKeys("Dheeraj123");
//
//	    driver.findElement(By.id("password")).sendKeys("Password@123");
//
//	    driver.findElement(By.xpath("//button[@type='submit']")).click();
//
//	    System.out.println("Valid Login Executed");
//	}
//	
//	@Test(priority = 2, description = "Invalid Username")
//	public void invalidUsername() throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://sathu.pythonanywhere.com/");
//
//		Thread.sleep(4000);
//
//	    driver.findElement(By.xpath("//a[text()='Login']")).click();
//
//	    driver.findElement(By.id("username")).sendKeys("WrongUser");
//
//	    driver.findElement(By.id("password")).sendKeys("Password@123");
//
//	    driver.findElement(By.xpath("//button[@type='submit']")).click();
//
//	    System.out.println("Invalid Username Test Executed");
//	}
//	
//	@Test(priority = 3, description = "Invalid Password")
//	public void invalidPassword() throws InterruptedException {
//		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://sathu.pythonanywhere.com/");
//
//		Thread.sleep(4000);
//
//	    driver.findElement(By.xpath("//a[text()='Login']")).click();
//
//	    driver.findElement(By.id("username")).sendKeys("Dheeraj123");
//
//	    driver.findElement(By.id("password")).sendKeys("WrongPassword");
//
//	    driver.findElement(By.xpath("//button[@type='submit']")).click();
//
//	    System.out.println("Invalid Password Test Executed");
//	}
//	@Test(priority = 4, description = "Invalid Username and Password")
//	public void invalidUsernamePassword() throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://sathu.pythonanywhere.com/");
//
//		Thread.sleep(4000);
//
//	    driver.findElement(By.xpath("//a[text()='Login']")).click();
//
//	    driver.findElement(By.id("username")).sendKeys("WrongUser");
//
//	    driver.findElement(By.id("password")).sendKeys("WrongPassword");
//
//	    driver.findElement(By.xpath("//button[@type='submit']")).click();
//
//	    System.out.println("Invalid Username and Password Test Executed");
//	}
//	@Test(priority = 5, description = "Empty Username")
//	public void emptyUsername() throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://sathu.pythonanywhere.com/");
//
//		Thread.sleep(4000);
//
//	    driver.findElement(By.xpath("//a[text()='Login']")).click();
//
//	    driver.findElement(By.id("password")).sendKeys("Password@123");
//
//	    driver.findElement(By.xpath("//button[@type='submit']")).click();
//
//	    System.out.println("Empty Username Test Executed");
//	}
//	@Test(priority = 6, description = "Empty Password")
//	public void emptyPassword() throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://sathu.pythonanywhere.com/");
//
//		Thread.sleep(4000);
//
//	    driver.findElement(By.xpath("//a[text()='Login']")).click();
//
//	    driver.findElement(By.id("username")).sendKeys("Dheeraj123");
//
//	    driver.findElement(By.xpath("//button[@type='submit']")).click();
//
//	    System.out.println("Empty Password Test Executed");
//	}
//	
//	@Test(priority = 7, description = "Empty Username and Password")
//	public void emptyUsernamePassword() throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://sathu.pythonanywhere.com/");
//
//		Thread.sleep(4000);
//
//	    driver.findElement(By.xpath("//a[text()='Login']")).click();
//
//	    driver.findElement(By.xpath("//button[@type='submit']")).click();
//
//	    System.out.println("Empty Username and Password Test Executed");
//	}
//	@Test(priority = 8, description = "Username with Special Characters")
//	public void specialCharacterUsername() throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://sathu.pythonanywhere.com/");
//
//		Thread.sleep(4000);
//	    driver.findElement(By.xpath("//a[text()='Login']")).click();
//
//	    driver.findElement(By.id("username")).sendKeys("@@@###");
//
//	    driver.findElement(By.id("password")).sendKeys("Password@123");
//
//	    driver.findElement(By.xpath("//button[@type='submit']")).click();
//
//	    System.out.println("Special Character Username Test Executed");
//	}
//	
//	@Test(priority = 9, description = "Password Case Sensitivity")
//	public void passwordCaseSensitivity() throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://sathu.pythonanywhere.com/");
//
//		Thread.sleep(4000);
//
//	    driver.findElement(By.xpath("//a[text()='Login']")).click();
//
//	    driver.findElement(By.id("username")).sendKeys("Dheeraj123");
//
//	    driver.findElement(By.id("password")).sendKeys("password@123");
//
//	    driver.findElement(By.xpath("//button[@type='submit']")).click();
//
//	    System.out.println("Password Case Sensitivity Test Executed");
//	}
	@Test(priority = 10, description = "Login with Leading and Trailing Spaces")
	public void loginWithSpaces() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);

	    driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys(" Dheeraj123 ");

	    driver.findElement(By.id("password")).sendKeys(" Password@123 ");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Login With Spaces Test Executed");
	}
}
