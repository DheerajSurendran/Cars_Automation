package CarsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Addvehicle {
	@Test(priority = 1, description = "Add Vehicle with Valid Details")
	public void addVehicle() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheeraj123");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    driver.findElement(By.xpath("//a[contains(text(),'View Vehicles')]")).click();

	    Thread.sleep(2000);

	    driver.findElement(By.xpath("//a[contains(text(),'Add Vehicle')]")).click();

	    Thread.sleep(2000);

	    Select vehicle = new Select(driver.findElement(By.id("id_vehicle_type")));
	    vehicle.selectByVisibleText("Car");
        
	    Select brand = new Select(driver.findElement(By.id("id_brand")));
	    brand.selectByVisibleText("Toyota");
	    
	    driver.findElement(By.id("id_model")).sendKeys("Swift");

	    driver.findElement(By.id("id_registration_number")).sendKeys("KL07AB9988");

	    driver.findElement(By.id("id_mileage")).sendKeys("25000");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Vehicle Added Successfully");
	}
	
	
	@Test(priority = 2, description = "Empty Vehicle Type")
	public void emptyVehicleType() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	
		driver.findElement(By.id("username")).sendKeys("Dheeraj123");

		driver.findElement(By.id("password")).sendKeys("Password@123");
		
	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'View Vehicles')]")).click();
	    Thread.sleep(2000);

	    driver.findElement(By.xpath("//a[contains(text(),'Add Vehicle')]")).click();
	    Thread.sleep(2000);

	    Select brand = new Select(driver.findElement(By.id("id_brand")));
	    brand.selectByVisibleText("Toyota");

	    driver.findElement(By.id("id_model")).sendKeys("Swift");
	    driver.findElement(By.id("id_registration_number")).sendKeys("KL07AB1234");
	    driver.findElement(By.id("id_mileage")).sendKeys("25000");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Empty Vehicle Type Test Executed");
	}
	
	@Test(priority = 3, description = "Empty Brand")
	public void emptyBrand() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	
		driver.findElement(By.id("username")).sendKeys("Dheeraj123");

		driver.findElement(By.id("password")).sendKeys("Password@123");
		
	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'View Vehicles')]")).click();
	    Thread.sleep(2000);

	    driver.findElement(By.xpath("//a[contains(text(),'Add Vehicle')]")).click();
	    Thread.sleep(2000);

	    Select vehicle = new Select(driver.findElement(By.id("id_vehicle_type")));
	    vehicle.selectByVisibleText("Car");

	    driver.findElement(By.id("id_model")).sendKeys("Swift");
	    driver.findElement(By.id("id_registration_number")).sendKeys("KL07AB1234");
	    driver.findElement(By.id("id_mileage")).sendKeys("25000");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Empty Brand Test Executed");
	}
	
	@Test(priority = 4, description = "Empty Model")
	public void emptyModel() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	
		driver.findElement(By.id("username")).sendKeys("Dheeraj123");

		driver.findElement(By.id("password")).sendKeys("Password@123");
		
	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'View Vehicles')]")).click();
	    Thread.sleep(2000);

	    

	    driver.findElement(By.xpath("//a[contains(text(),'Add Vehicle')]")).click();
	    Thread.sleep(2000);

	    new Select(driver.findElement(By.id("id_vehicle_type"))).selectByVisibleText("Car");
	    new Select(driver.findElement(By.id("id_brand"))).selectByVisibleText("Toyota");

	    driver.findElement(By.id("id_registration_number")).sendKeys("KL07AB1234");
	    driver.findElement(By.id("id_mileage")).sendKeys("25000");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Empty Model Test Executed");
	}
	
	@Test(priority = 5, description = "Empty Registration Number")
	public void emptyRegistration() throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	
		driver.findElement(By.id("username")).sendKeys("Dheeraj123");

		driver.findElement(By.id("password")).sendKeys("Password@123");
		
	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'View Vehicles')]")).click();
	    Thread.sleep(2000);

	    driver.findElement(By.xpath("//a[contains(text(),'Add Vehicle')]")).click();
	    Thread.sleep(2000);

	    new Select(driver.findElement(By.id("id_vehicle_type"))).selectByVisibleText("Car");
	    new Select(driver.findElement(By.id("id_brand"))).selectByVisibleText("Toyota");

	    driver.findElement(By.id("id_model")).sendKeys("Swift");
	    driver.findElement(By.id("id_mileage")).sendKeys("25000");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Empty Registration Number Test Executed");
	}
	
	@Test(priority = 6, description = "Empty Mileage")
	public void emptyMileage() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	
		driver.findElement(By.id("username")).sendKeys("Dheeraj123");

		driver.findElement(By.id("password")).sendKeys("Password@123");
		
	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'View Vehicles')]")).click();
	    Thread.sleep(2000);

	    driver.findElement(By.xpath("//a[contains(text(),'Add Vehicle')]")).click();
	    Thread.sleep(2000);

	    new Select(driver.findElement(By.id("id_vehicle_type"))).selectByVisibleText("Car");
	    new Select(driver.findElement(By.id("id_brand"))).selectByVisibleText("Toyota");

	    driver.findElement(By.id("id_model")).sendKeys("Swift");
	    driver.findElement(By.id("id_registration_number")).sendKeys("KL07AB1234");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Empty Mileage Test Executed");
	}
	
	@Test(priority = 7, description = "Invalid Registration Number")
	public void invalidRegistration() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	
		driver.findElement(By.id("username")).sendKeys("Dheeraj123");

		driver.findElement(By.id("password")).sendKeys("Password@123");
		
	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'View Vehicles')]")).click();
	    Thread.sleep(2000);

	    driver.findElement(By.xpath("//a[contains(text(),'Add Vehicle')]")).click();
	    Thread.sleep(2000);

	    new Select(driver.findElement(By.id("id_vehicle_type"))).selectByVisibleText("Car");
	    new Select(driver.findElement(By.id("id_brand"))).selectByVisibleText("Toyota");

	    driver.findElement(By.id("id_model")).sendKeys("Swift");
	    driver.findElement(By.id("id_registration_number")).sendKeys("123");
	    driver.findElement(By.id("id_mileage")).sendKeys("25000");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Invalid Registration Number Test Executed");
	}
	
	@Test(priority = 8, description = "Invalid Mileage")
	public void invalidMileage() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	
		driver.findElement(By.id("username")).sendKeys("Dheeraj123");

		driver.findElement(By.id("password")).sendKeys("Password@123");
		
	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'View Vehicles')]")).click();
	    Thread.sleep(2000);

	    driver.findElement(By.xpath("//a[contains(text(),'Add Vehicle')]")).click();
	    Thread.sleep(2000);

	    new Select(driver.findElement(By.id("id_vehicle_type"))).selectByVisibleText("Car");
	    new Select(driver.findElement(By.id("id_brand"))).selectByVisibleText("Toyota");

	    driver.findElement(By.id("id_model")).sendKeys("Swift");
	    driver.findElement(By.id("id_registration_number")).sendKeys("KL07AB1234");
	    driver.findElement(By.id("id_mileage")).sendKeys("-50");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Invalid Mileage Test Executed");
	}
	
	@Test(priority = 9, description = "Add Bike")
	public void addBike() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	
		driver.findElement(By.id("username")).sendKeys("Dheeraj123");

		driver.findElement(By.id("password")).sendKeys("Password@123");
		
	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'View Vehicles')]")).click();
	    Thread.sleep(2000);

	    driver.findElement(By.xpath("//a[contains(text(),'Add Vehicle')]")).click();
	    Thread.sleep(2000);

	    new Select(driver.findElement(By.id("id_vehicle_type"))).selectByVisibleText("Bike");
	    new Select(driver.findElement(By.id("id_brand"))).selectByVisibleText("Honda");

	    driver.findElement(By.id("id_model")).sendKeys("Shine");
	    driver.findElement(By.id("id_registration_number")).sendKeys("KL01AA1234");
	    driver.findElement(By.id("id_mileage")).sendKeys("12000");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Bike Added Successfully");
	}
	@Test(priority = 10, description = "Add SUV")
	public void addSUV() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	
		driver.findElement(By.id("username")).sendKeys("Dheeraj123");

		driver.findElement(By.id("password")).sendKeys("Password@123");
		
	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'View Vehicles')]")).click();
	    Thread.sleep(2000);

	    driver.findElement(By.xpath("//a[contains(text(),'Add Vehicle')]")).click();
	    Thread.sleep(2000);

	    new Select(driver.findElement(By.id("id_vehicle_type"))).selectByVisibleText("SUV");
	    new Select(driver.findElement(By.id("id_brand"))).selectByVisibleText("Hyundai");

	    driver.findElement(By.id("id_model")).sendKeys("Creta");
	    driver.findElement(By.id("id_registration_number")).sendKeys("KL09CD4567");
	    driver.findElement(By.id("id_mileage")).sendKeys("18000");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("SUV Added Successfully");
	}
}
