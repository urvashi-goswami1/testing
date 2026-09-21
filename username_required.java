import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyUsernameTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        // Leave username empty
        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
              .click();

        String error =
            driver.findElement(By.cssSelector("[data-test='error']"))
                  .getText();

        if (error.contains("Username is required")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        driver.quit();
    }
}