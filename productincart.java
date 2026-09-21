import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class productincart {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        // Login
        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
              .click();

        // Add backpack
        driver.findElement(
            By.id("add-to-cart-sauce-labs-backpack")
        ).click();

        // Open cart
        driver.findElement(By.className("shopping_cart_link"))
              .click();

        // Get product name
        String product =
            driver.findElement(By.className("inventory_item_name"))
                  .getText();

        if (product.equals("Sauce Labs Backpack")) {
            System.out.println("PASS: Product is in cart");
        } else {
            System.out.println("FAIL: Product not found");
        }

        driver.quit();
    }
}