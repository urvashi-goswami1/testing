import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginValidation {
	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username"))
                .sendKeys("student");

        driver.findElement(By.id("password"))
                .sendKeys("Password123");

        driver.findElement(By.id("submit"))
                .click();

        String url = driver.getCurrentUrl();

        if(url.contains("logged-in-successfully")) {
            System.out.println("Login Passed");
        } else {
            System.out.println("Login Failed");
        }

        driver.quit();
    }
}
