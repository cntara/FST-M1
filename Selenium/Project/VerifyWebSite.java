package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class VerifyWebSite {
    public static void main(String[] args) {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        System.out.println("Goal: Read the title of the website and verify the text");
        // Open the browser
        driver.get("https://alchemy.hguy.co/jobs");
        System.out.println(driver.getTitle());
        String actualTitle=driver.getTitle();
        if (actualTitle.equals("Alchemy Jobs – Job Board Application")){
            System.out.println("Title matches");
            driver.quit();
        }
        else{
            System.out.println("Title not matches");
        }
        //Assert.assertEquals(actualTitle,"Alchemy Jobs – Job Board Application");

        /*
        driver.findElement(By.name("Username")).clear();
        driver.findElement(By.name("Username")).sendKeys("admin");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("password");
        // Perform testing and assertions
        driver.findElement(By.xpath("//button[text()='Log in']")).click();


        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly*/

    }
}
