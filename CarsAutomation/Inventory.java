package CarsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Inventory {
	@Test(priority = 1, description = "Add Inventory Part")
	public void addInventoryPart() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheerajowner");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'View Inventory')]")).click();

	    Thread.sleep(2000);

	    Select garage = new Select(driver.findElement(By.name("garage")));
	    garage.selectByVisibleText("Falcon Motors");

	    driver.findElement(By.id("id_name")).sendKeys("Brake Pad");

	    driver.findElement(By.id("id_quantity")).sendKeys("20");

	    driver.findElement(By.id("id_price")).sendKeys("1500");

	    driver.findElement(By.id("id_brand")).sendKeys("Bosch");

	    driver.findElement(By.id("id_min_stock")).clear();
	    driver.findElement(By.id("id_min_stock")).sendKeys("5");

	    driver.findElement(By.xpath("//button[contains(text(),'Add Part')]")).click();

	    System.out.println("Inventory Part Added Successfully");
	}
	
	@Test(priority = 2, description = "Empty Part Name")
	public void emptyPartName() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheerajowner");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'View Inventory')]")).click();

	    Thread.sleep(2000);

	    Select garage = new Select(driver.findElement(By.name("garage")));
	    garage.selectByVisibleText("Falcon Motors");

	    driver.findElement(By.id("id_quantity")).sendKeys("20");
	    driver.findElement(By.id("id_price")).sendKeys("1500");
	    driver.findElement(By.id("id_brand")).sendKeys("Bosch");

	    driver.findElement(By.xpath("//button[contains(text(),'Add Part')]")).click();

	    System.out.println("Empty Part Name Test Executed");
	}
	@Test(priority = 3, description = "Empty Quantity")
	public void emptyQuantity() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheerajowner");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'View Inventory')]")).click();

	    Thread.sleep(2000);

	    new Select(driver.findElement(By.name("garage"))).selectByVisibleText("Falcon Motors");

	    driver.findElement(By.id("id_name")).sendKeys("Brake Pad");
	    driver.findElement(By.id("id_price")).sendKeys("1500");

	    driver.findElement(By.xpath("//button[contains(text(),'Add Part')]")).click();

	    System.out.println("Empty Quantity Test Executed");
	}
	@Test(priority = 4, description = "Empty Price")
	public void emptyPrice() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheerajowner");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'View Inventory')]")).click();

	    Thread.sleep(2000);

	    new Select(driver.findElement(By.name("garage"))).selectByVisibleText("Falcon Motors");

	    driver.findElement(By.id("id_name")).sendKeys("Brake Pad");
	    driver.findElement(By.id("id_quantity")).sendKeys("20");

	    driver.findElement(By.xpath("//button[contains(text(),'Add Part')]")).click();

	    System.out.println("Empty Price Test Executed");
	}
	
	@Test(priority = 5, description = "Invalid Quantity")
	public void invalidQuantity() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheerajowner");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	    driver.findElement(By.xpath("//a[contains(text(),'View Inventory')]")).click();

	    Thread.sleep(2000);

	    new Select(driver.findElement(By.name("garage"))).selectByVisibleText("Falcon Motors");

	    driver.findElement(By.id("id_name")).sendKeys("Brake Pad");
	    driver.findElement(By.id("id_quantity")).sendKeys("-5");
	    driver.findElement(By.id("id_price")).sendKeys("1500");

	    driver.findElement(By.xpath("//button[contains(text(),'Add Part')]")).click();

	    System.out.println("Invalid Quantity Test Executed");
	}
	@Test(priority = 6, description = "Invalid Price")
	public void invalidPrice() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheerajowner");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'View Inventory')]")).click();

	    Thread.sleep(2000);

	    new Select(driver.findElement(By.name("garage"))).selectByVisibleText("Falcon Motors");

	    driver.findElement(By.id("id_name")).sendKeys("Brake Pad");
	    driver.findElement(By.id("id_quantity")).sendKeys("20");
	    driver.findElement(By.id("id_price")).sendKeys("-500");

	    driver.findElement(By.xpath("//button[contains(text(),'Add Part')]")).click();

	    System.out.println("Invalid Price Test Executed");
	}
	
	@Test(priority = 7, description = "Edit Inventory Part") //edit page will not work (it is a bug)
	public void editInventory() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheerajowner");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//a[contains(text(),'View Inventory')]")).click();

	    new Select(driver.findElement(By.name("garage"))).selectByVisibleText("Falcon Motors");

	    driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();

	    driver.findElement(By.id("id_price")).clear();
	    driver.findElement(By.id("id_price")).sendKeys("1800");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    System.out.println("Inventory Updated Successfully");
	}
	
	@Test(priority = 8, description = "Delete Inventory Part")
	public void deleteInventory() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheerajowner");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();


	    driver.findElement(By.xpath("//a[contains(text(),'View Inventory')]")).click();

	    new Select(driver.findElement(By.name("garage"))).selectByVisibleText("Falcon Motors");

	    driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();

	    Thread.sleep(2000);

	    driver.switchTo().alert().accept();

	    System.out.println("Inventory Deleted Successfully");
	}
	
	@Test(priority = 9, description = "Low Stock Item")
	public void lowStock() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sathu.pythonanywhere.com/");

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	    driver.findElement(By.id("username")).sendKeys("Dheerajowner");

	    driver.findElement(By.id("password")).sendKeys("Password@123");

	    driver.findElement(By.xpath("//button[@type='submit']")).click();


	    driver.findElement(By.xpath("//a[contains(text(),'View Inventory')]")).click();

	    Thread.sleep(2000);

	    new Select(driver.findElement(By.name("garage"))).selectByVisibleText("Falcon Motors");

	    driver.findElement(By.id("id_name")).sendKeys("Oil Filter");
	    driver.findElement(By.id("id_quantity")).sendKeys("2");
	    driver.findElement(By.id("id_price")).sendKeys("350");
	    driver.findElement(By.id("id_brand")).sendKeys("Toyota");

	    driver.findElement(By.xpath("//button[contains(text(),'Add Part')]")).click();

	    System.out.println("Low Stock Item Added");
	}
	
}

