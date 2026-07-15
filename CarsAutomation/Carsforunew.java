package CarsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Carsforunew {

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://sathu.pythonanywhere.com/");
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }

    public void fillRegistrationForm(String username, String email, String role,
            String phone, String password, String confirmPassword) throws InterruptedException {

        driver.findElement(By.xpath("//a[text()='Register']")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("username")).sendKeys(username);

        driver.findElement(By.id("email")).sendKeys(email);

        Select dropdown = new Select(driver.findElement(By.id("role")));
        dropdown.selectByVisibleText(role);

        driver.findElement(By.id("phone")).sendKeys(phone);

        driver.findElement(By.id("password")).sendKeys(password);

        driver.findElement(By.id("password2")).sendKeys(confirmPassword);

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(3000);
    }

    @Test(priority = 1, description = "Valid Registration")
    public void validRegistration() throws InterruptedException {

        fillRegistrationForm(
                "Dheeraj123",
                "dheeraj123@gmail.com",
                "Customer",
                "9876543210",
                "Password@123",
                "Password@123");

        System.out.println("Valid Registration Executed");
    }

    @Test(priority = 2, description = "Username Already Exists")
    public void usernameAlreadyExists() throws InterruptedException {

        fillRegistrationForm(
                "Dheeraj123",
                "newemail@gmail.com",
                "Customer",
                "9876543210",
                "Password@123",
                "Password@123");

        System.out.println("Username Already Exists Test Executed");
    }

    @Test(priority = 3, description = "Email Already Exists")
    public void emailAlreadyExists() throws InterruptedException {

        fillRegistrationForm(
                "NewUser123",
                "dheeraj123@gmail.com",
                "Customer",
                "9876543210",
                "Password@123",
                "Password@123");

        System.out.println("Email Already Exists Test Executed");
    }

    @Test(priority = 4, description = "Password Mismatch")
    public void passwordMismatch() throws InterruptedException {

        fillRegistrationForm(
                "User123",
                "user123@gmail.com",
                "Customer",
                "9876543210",
                "Password@123",
                "Password@321");

        System.out.println("Password Mismatch Test Executed");
    }

    @Test(priority = 5, description = "Invalid Email")
    public void invalidEmail() throws InterruptedException {

        fillRegistrationForm(
                "User124",
                "abcd",
                "Customer",
                "9876543210",
                "Password@123",
                "Password@123");

        System.out.println("Invalid Email Test Executed");
    }

    @Test(priority = 6, description = "Invalid Phone Number")
    public void invalidPhone() throws InterruptedException {

        fillRegistrationForm(
                "User125",
                "user125@gmail.com",
                "Customer",
                "12345",
                "Password@123",
                "Password@123");

        System.out.println("Invalid Phone Test Executed");
    }

    @Test(priority = 7, description = "Short Username")
    public void shortUsername() throws InterruptedException {

        fillRegistrationForm(
                "ab",
                "user126@gmail.com",
                "Customer",
                "9876543210",
                "Password@123",
                "Password@123");

        System.out.println("Short Username Test Executed");
    }

    @Test(priority = 8, description = "Weak Password")
    public void weakPassword() throws InterruptedException {

        fillRegistrationForm(
                "User127",
                "user127@gmail.com",
                "Customer",
                "9876543210",
                "12345",
                "12345");

        System.out.println("Weak Password Test Executed");
    }

    @Test(priority = 9, description = "Special Characters Username")
    public void specialCharacterUsername() throws InterruptedException {

        fillRegistrationForm(
                "@@@####",
                "user1288@gmail.com",
                "Customer",
                "9876543210",
                "Password@123",
                "Password@123");

        System.out.println("Special Character Username Test Executed");
    }

    @Test(priority = 10, description = "Long Username")
    public void longUsername() throws InterruptedException {

        fillRegistrationForm(
                "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXY",
                "user1290@gmail.com",
                "Customer",
                "9876543210",
                "Password@123",
                "Password@123");

        System.out.println("Long Username Test Executed");
    }
}