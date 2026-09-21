import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleUserTest {

    public static void main(String[] args) {

        String[] users = {
            "standard_user",
            "locked_out_user",
            "problem_user",
            "performance_glitch_user",
            "error_user",
            "visual_user"
        };

        for (String user : users) {

            WebDriver driver = new ChromeDriver();

            driver.get("https://www.saucedemo.com/");

            // Enter username
            driver.findElement(By.id("user-name"))
                  .sendKeys(user);

            // Enter password
            driver.findElement(By.id("password"))
                  .sendKeys("secret_sauce");

            // Click Login
            driver.findElement(By.id("login-button"))
                  .click();

            // Check login result
            String url = driver.getCurrentUrl();

            if (url.contains("inventory.html")) {

                System.out.println(user + " : PASS");

            } else {

                System.out.println(user + " : FAIL");

            }

            driver.quit();
        }
    }
}