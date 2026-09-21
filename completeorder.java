package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class completeorder {
	public static void main(String[] args)throws InterruptedException {

		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption(
		    "prefs",
		    java.util.Map.of(
		        "credentials_enable_service", false,
		        "profile.password_manager_leak_detection", false
		    )
		);

		WebDriver driver = new ChromeDriver(options);
		
		  // 1. Open website
	        driver.get("https://www.saucedemo.com/");
	        Thread.sleep(2000);

	        // 2. Login
	        driver.findElement(By.id("user-name"))
	              .sendKeys("standard_user");

	        driver.findElement(By.id("password"))
	              .sendKeys("secret_sauce");

	        driver.findElement(By.id("login-button"))
	              .click();

	        Thread.sleep(3000);

	        // 3. Add Backpack
	        driver.findElement(
	            By.id("add-to-cart-sauce-labs-backpack")
	        ).click();

	        System.out.println("Product added to cart");

	        Thread.sleep(2000);

	        // 4. Open Cart
	        driver.findElement(
	            By.id("shopping_cart_container")
	        ).click();

	        Thread.sleep(3000);

	        // Check URL
	        System.out.println("Current URL: " +
	                           driver.getCurrentUrl());

	        // 5. Click Checkout
	        driver.findElement(
	            By.id("checkout")
	        ).click();

	        Thread.sleep(3000);

	        // 6. Enter customer details
	        driver.findElement(By.id("first-name"))
	              .sendKeys("Dipti");

	        driver.findElement(By.id("last-name"))
	              .sendKeys("Bhatt");

	        driver.findElement(By.id("postal-code"))
	              .sendKeys("380001");

	        Thread.sleep(2000);

	        // 7. Continue
	        driver.findElement(
	            By.id("continue")
	        ).click();

	        Thread.sleep(3000);

	        // 8. Finish
	        driver.findElement(
	            By.id("finish")
	        ).click();

	        Thread.sleep(3000);

	        // 9. Verify order
	        String message =
	            driver.findElement(
	                By.className("complete-header")
	            ).getText();

	        if (message.contains("Thank you")) {
	            System.out.println("ORDER PASSED");
	        } else {
	            System.out.println("ORDER FAILED");
	        }

	        Thread.sleep(2000);

	        // 10. Close browser
	        driver.quit();
	    }
}
