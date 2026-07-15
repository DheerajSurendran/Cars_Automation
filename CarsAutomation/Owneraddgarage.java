package CarsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Owneraddgarage {
	
	@Test(priority = 1, description = "Add Garage with Valid Details")
	public void addGarage() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheerajowner");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Manage Garages')]")).click();

	    Thread.sleep(2000);

	    driver.findElement(By.id("id_name")).clear();
	    driver.findElement(By.id("id_name")).sendKeys("Falcon Motors");

	    driver.findElement(By.id("id_city")).clear();
	    driver.findElement(By.id("id_city")).sendKeys("Kochi");

	    driver.findElement(By.id("id_address")).clear();
	    driver.findElement(By.id("id_address")).sendKeys("MG Road, Kochi");

	    driver.findElement(By.id("id_phone")).clear();
	    driver.findElement(By.id("id_phone")).sendKeys("9876543210");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Garage Added Successfully");
	}
	@Test(priority = 2, description = "Empty Garage Name")
	public void emptyGarageName() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheerajowner");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Manage Garages')]")).click();

	    Thread.sleep(2000);

	    driver.findElement(By.id("id_city")).clear();
	    driver.findElement(By.id("id_city")).sendKeys("tvm");

	    driver.findElement(By.id("id_address")).clear();
	    driver.findElement(By.id("id_address")).sendKeys("tvm, trivandrum");

	    driver.findElement(By.id("id_phone")).clear();
	    driver.findElement(By.id("id_phone")).sendKeys("9876543210");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Empty Garage Name Test Executed");
	}
	@Test(priority = 3, description = "Empty City")
	public void emptyCity() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheerajowner");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'Manage Garages')]")).click();

	    Thread.sleep(2000);

	    driver.findElement(By.id("id_name")).clear();
	    driver.findElement(By.id("id_name")).sendKeys("Falcon Motors");

	    driver.findElement(By.id("id_address")).clear();
	    driver.findElement(By.id("id_address")).sendKeys("kk,kozhikode");

	    driver.findElement(By.id("id_phone")).clear();
	    driver.findElement(By.id("id_phone")).sendKeys("9876543210");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Empty City Test Executed");
	}
	@Test(priority = 4, description = "Empty Address")
	public void emptyAddress() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheerajowner");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'Manage Garages')]")).click();

	    Thread.sleep(2000);

	    driver.findElement(By.id("id_name")).clear();
	    driver.findElement(By.id("id_name")).sendKeys("Falcon Motors");

	    driver.findElement(By.id("id_city")).clear();
	    driver.findElement(By.id("id_city")).sendKeys("Kochi");

	    driver.findElement(By.id("id_phone")).clear();
	    driver.findElement(By.id("id_phone")).sendKeys("9876543210");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Empty Address Test Executed");
	}
	@Test(priority = 5, description = "Empty Phone Number")
	public void emptyPhone() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheerajowner");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'Manage Garages')]")).click();

	    Thread.sleep(2000);

	    driver.findElement(By.id("id_name")).clear();
	    driver.findElement(By.id("id_name")).sendKeys("Falcon Motors");

	    driver.findElement(By.id("id_city")).clear();
	    driver.findElement(By.id("id_city")).sendKeys("Kochi");

	    driver.findElement(By.id("id_address")).clear();
	    driver.findElement(By.id("id_address")).sendKeys("kochi,MG Road");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Empty Phone Test Executed");
	}
	
	@Test(priority = 6, description = "Invalid Phone Number")
	public void invalidPhone() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheerajowner");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'Manage Garages')]")).click();

	    Thread.sleep(2000);

	    driver.findElement(By.id("id_name")).clear();
	    driver.findElement(By.id("id_name")).sendKeys("Falcon Motors");

	    driver.findElement(By.id("id_city")).clear();
	    driver.findElement(By.id("id_city")).sendKeys("Kochi");

	    driver.findElement(By.id("id_address")).clear();
	    driver.findElement(By.id("id_address")).sendKeys("kochi,MG Road");

	    driver.findElement(By.id("id_phone")).clear();
	    driver.findElement(By.id("id_phone")).sendKeys("123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Invalid Phone Test Executed");
	}
	
	@Test(priority = 7, description = "Special Characters in Garage Name")
	public void specialCharacterGarage() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheerajowner");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'Manage Garages')]")).click();

	    Thread.sleep(2000);

	    driver.findElement(By.id("id_name")).clear();
	    driver.findElement(By.id("id_name")).sendKeys("@@@###");

	    driver.findElement(By.id("id_city")).clear();
	    driver.findElement(By.id("id_city")).sendKeys("Kochi");

	    driver.findElement(By.id("id_address")).clear();
	    driver.findElement(By.id("id_address")).sendKeys("kochi,MG Road");

	    driver.findElement(By.id("id_phone")).clear();
	    driver.findElement(By.id("id_phone")).sendKeys("9876543210");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Special Character Garage Name Test Executed");
	}
	@Test(priority = 8, description = "Numeric City")
	public void numericCity() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheerajowner");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'Manage Garages')]")).click();

	    Thread.sleep(2000);

	    driver.findElement(By.id("id_name")).clear();
	    driver.findElement(By.id("id_name")).sendKeys("Falcon Motors");

	    driver.findElement(By.id("id_city")).clear();
	    driver.findElement(By.id("id_city")).sendKeys("12345");

	    driver.findElement(By.id("id_address")).clear();
	    driver.findElement(By.id("id_address")).sendKeys("kochi,MG Road");

	    driver.findElement(By.id("id_phone")).clear();
	    driver.findElement(By.id("id_phone")).sendKeys("9876543210");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Numeric City Test Executed");
	}
}
