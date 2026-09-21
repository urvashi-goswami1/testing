import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Title Verified");
        } else {
            System.out.println("Title Mismatch");
        }
        

        driver.quit();
}
}