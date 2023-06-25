package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class VerifyWebHeading {
    public static void main(String[] args) {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        System.out.println("Goal: Read the heading of the website and verify the text");
        // Open the browser
        driver.get("https://alchemy.hguy.co/jobs");
        String header=driver.findElement(By.className("entry-title")).getText();
        if (header.equals("Welcome to Alchemy Jobs")){
            System.out.println("Header matches");
            driver.quit();
        }
        else{
            System.out.println("Header not matches");
        }
       // driver.close();
    }
}
