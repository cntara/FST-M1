package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginWebsite {

    public static void main(String[] args) {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // WebDriverWait wait=
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        System.out.println("Goal: Visit the site’s backend and login");
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
        //Sign in

        //WebElement userId=driver.findElement(By.id("user_login"));
        WebElement userId=driver.findElement(By.xpath("//input[@type='text']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_login")));
        userId.clear();
        userId.sendKeys("root");
        WebElement pwd=driver.findElement(By.id("user_pass"));
        pwd.clear();
        pwd.sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement homePage=driver.findElement(By.xpath("//h1[text()='Dashboard']"));

        if(homePage.isDisplayed()){
            System.out.println("User logged in successfully");
        }else{
            System.out.println("User logged in successfully");
        }
        driver.close();
    }
}
