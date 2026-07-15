package CarsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Bookservice {
	
	@Test(priority = 1, description = "Book Service with Valid Details")
	public void bookService() throws InterruptedException {
        
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheeraj123");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Book Now')]")).click();

	    Thread.sleep(2000);

	    Select vehicle = new Select(driver.findElement(By.id("id_vehicle")));
	    vehicle.selectByVisibleText("KL07AB9988 - Toyota Swift");

	    Select service = new Select(driver.findElement(By.id("id_service_type")));
	    service.selectByVisibleText("General Service");

	    Select garage = new Select(driver.findElement(By.id("id_garage")));
	    garage.selectByVisibleText("Falcon Motors");

	    driver.findElement(By.id("id_appointment_date")).sendKeys("15-07-2026");

	    driver.findElement(By.id("id_appointment_time")).sendKeys("10:00");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Book Service Successfully");
	}
	
	@Test(priority = 2, description = "Empty Vehicle")
	public void emptyVehicle() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheeraj123");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Book Now')]")).click();

	    Thread.sleep(2000);

	    Select service = new Select(driver.findElement(By.id("id_service_type")));
	    service.selectByVisibleText("General Service");

	    Select garage = new Select(driver.findElement(By.id("id_garage")));
	    garage.selectByVisibleText("Falcon Motors");

	    driver.findElement(By.id("id_appointment_date")).sendKeys("15-07-2026");
	    driver.findElement(By.id("id_appointment_time")).sendKeys("10:00");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Empty Vehicle Test Executed");
	}
	
	@Test(priority = 3, description = "Empty Service Type")
	public void emptyServiceType() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheeraj123");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'Book Now')]")).click();

	    Thread.sleep(2000);

	    Select vehicle = new Select(driver.findElement(By.id("id_vehicle")));
	    vehicle.selectByVisibleText("KL07AB9988 - Toyota Swift");

	    Select garage = new Select(driver.findElement(By.id("id_garage")));
	    garage.selectByVisibleText("Falcon Motors");

	    driver.findElement(By.id("id_appointment_date")).sendKeys("15-07-2026");
	    driver.findElement(By.id("id_appointment_time")).sendKeys("10:00");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Empty Service Type Test Executed");
	}
	
	@Test(priority = 4, description = "Empty Garage")
	public void emptyGarage() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheeraj123");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Book Now')]")).click();
	    

	    Thread.sleep(2000);

	    Select vehicle = new Select(driver.findElement(By.id("id_vehicle")));
	    vehicle.selectByVisibleText("KL07AB9988 - Toyota Swift");

	    Select service = new Select(driver.findElement(By.id("id_service_type")));
	    service.selectByVisibleText("General Service");

	    driver.findElement(By.id("id_appointment_date")).sendKeys("15-07-2026");
	    driver.findElement(By.id("id_appointment_time")).sendKeys("10:00");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Empty Garage Test Executed");
	}
	@Test(priority = 5, description = "Empty Appointment Date")
	public void emptyAppointmentDate() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheeraj123");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'Book Now')]")).click();

	    Thread.sleep(2000);

	    new Select(driver.findElement(By.id("id_vehicle"))).selectByVisibleText("KL07AB9988 - Toyota Swift");
	    new Select(driver.findElement(By.id("id_service_type"))).selectByVisibleText("General Service");
	    new Select(driver.findElement(By.id("id_garage"))).selectByVisibleText("Falcon Motors");

	    driver.findElement(By.id("id_appointment_time")).sendKeys("10:00");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Empty Appointment Date Test Executed");
	}
	@Test(priority = 6, description = "Empty Appointment Time")
	public void emptyAppointmentTime() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheeraj123");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'Book Now')]")).click();

	    Thread.sleep(2000);

	    new Select(driver.findElement(By.id("id_vehicle"))).selectByVisibleText("KL07AB9988 - Toyota Swift");
	    new Select(driver.findElement(By.id("id_service_type"))).selectByVisibleText("General Service");
	    new Select(driver.findElement(By.id("id_garage"))).selectByVisibleText("Falcon Motors");

	    driver.findElement(By.id("id_appointment_date")).sendKeys("15-07-2026");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Empty Appointment Time Test Executed");
	}
	@Test(priority = 7, description = "Book Service for Bike")
	public void bookBikeService() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheeraj123");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'Book Now')]")).click();

	    Thread.sleep(2000);

	    new Select(driver.findElement(By.id("id_vehicle"))).selectByVisibleText("KL01AA1234 - Honda Shine");
	    new Select(driver.findElement(By.id("id_service_type"))).selectByVisibleText("Oil Change");
	    new Select(driver.findElement(By.id("id_garage"))).selectByVisibleText("King Service");

	    driver.findElement(By.id("id_appointment_date")).sendKeys("16-07-2026");
	    driver.findElement(By.id("id_appointment_time")).sendKeys("11:00");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Bike Service Booked");
	}
	@Test(priority = 8, description = "Book Service with Different Garage")
	public void differentGarage() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheeraj123");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'Book Now')]")).click();

	    Thread.sleep(2000);

	    new Select(driver.findElement(By.id("id_vehicle"))).selectByVisibleText("KL09CD4567 - Hyundai Creta");
	    new Select(driver.findElement(By.id("id_service_type"))).selectByVisibleText("General Service");
	    new Select(driver.findElement(By.id("id_garage"))).selectByVisibleText("True value");

	    driver.findElement(By.id("id_appointment_date")).sendKeys("17-07-2026");
	    driver.findElement(By.id("id_appointment_time")).sendKeys("12:00");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Different Garage Test Executed");
	}
	
	@Test(priority = 9, description = "Oil Change Service")
	public void oilChangeService() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheeraj123");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'Book Now')]")).click();

	    Thread.sleep(2000);

	    new Select(driver.findElement(By.id("id_vehicle"))).selectByVisibleText("KL07AB9988 - Toyota Swift");
	    new Select(driver.findElement(By.id("id_service_type"))).selectByVisibleText("Oil Change");
	    new Select(driver.findElement(By.id("id_garage"))).selectByVisibleText("Falcon Motors");

	    driver.findElement(By.id("id_appointment_date")).sendKeys("18-07-2026");
	    driver.findElement(By.id("id_appointment_time")).sendKeys("09:30");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Oil Change Booked");
	}
	
	@Test(priority = 10, description = "Book Service for SUV")
	public void suvService() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheeraj123");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'Book Now')]")).click();

	    Thread.sleep(2000);

	    new Select(driver.findElement(By.id("id_vehicle"))).selectByVisibleText("KL09CD4567 - Hyundai Creta");
	    new Select(driver.findElement(By.id("id_service_type"))).selectByVisibleText("General Service");
	    new Select(driver.findElement(By.id("id_garage"))).selectByVisibleText("Falcon Motors");

	    driver.findElement(By.id("id_appointment_date")).sendKeys("20-07-2026");
	    driver.findElement(By.id("id_appointment_time")).sendKeys("14:00");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("SUV Service Booked");
	}
}
